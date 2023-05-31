package com.infisoln.siddhant.roomdatabase_demo;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert
    List<Long> insertNotes(Notes... notes);

    @Update
    void updateNote(Notes note);

    @Delete
    void deleteNote(Notes note);

    @Query("SELECT * FROM notesTable")
    LiveData<List<Notes>> getAllNotes();

    @Query("SELECT * FROM notesTable WHERE id = :id")
    Notes getNoteById(Long id);

}
