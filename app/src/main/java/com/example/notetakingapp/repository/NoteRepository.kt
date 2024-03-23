package com.example.notetakingapp.repository

import com.example.notetakingapp.database.NoteDatabase
import com.example.notetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note) = db.getNoteDAO().insertNote(note)
    suspend fun deleteNote(note : Note) = db.getNoteDAO().deleteNote(note)
    suspend fun updateNote(note : Note) = db.getNoteDAO().updateNote(note)
    fun getAllNotes() = db.getNoteDAO().getAllNotes()
    fun searchNote(query : String?) = db.getNoteDAO().searchNote(query)


}