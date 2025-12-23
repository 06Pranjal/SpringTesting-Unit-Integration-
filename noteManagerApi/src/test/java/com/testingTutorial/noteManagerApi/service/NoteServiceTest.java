package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NoteServiceTest {

    private final NoteService noteService=new NoteService();

    @Test
    public void shouldCreateNoteSuccessfully(){
        Note note=new Note(
                1L,
                "Test",
                "Testing content");
        Note saved=noteService.createNote(note);

        assertNotNull(saved);
        assertEquals("Test",saved.getTitle());
        assertEquals("Testing content",saved.getContent());

    }

}
