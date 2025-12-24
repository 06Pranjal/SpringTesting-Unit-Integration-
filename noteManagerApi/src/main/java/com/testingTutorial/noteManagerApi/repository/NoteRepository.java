package com.testingTutorial.noteManagerApi.repository;

import com.testingTutorial.noteManagerApi.model.Note;

public interface NoteRepository {
    Note save(Note note);
    Note findById(Long id);
}
