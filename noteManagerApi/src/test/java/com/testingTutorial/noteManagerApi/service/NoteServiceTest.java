package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import org.junit.jupiter.api.*;

import java.util.Date;


public class NoteServiceTest {

    private final NoteService noteService = new NoteService();

    @BeforeAll
     public static void count() {
        int c = 0;
        for (int i = 1; i < 10; i++) {
            c = c + i;
        }
        System.out.println(c);
    }

    @Test
    @Disabled
    void shouldCreateNoteSuccessfully() {
        Note note = new Note(
                1L,
                "Test",
                "Testing content"
        );

        Note saved = noteService.createNote(note);

        Assertions.assertNotNull(saved);
        Assertions.assertEquals("Test", saved.getTitle());
        Assertions.assertEquals("Testing content", saved.getContent(), "Fail");

        System.out.println(note);
    }

    @AfterAll
     public static void present() {
        System.out.println(new Date());
    }
}
