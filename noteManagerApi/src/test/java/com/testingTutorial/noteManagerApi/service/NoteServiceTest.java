package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NoteServiceTest {

    private final NoteService noteService=new NoteService();

    @BeforeClass
    public static void count(){
        int c=0;
        for(int i=1;i<10;i++){
            c=c+i;
        }
        System.out.println(c);
    }
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
        System.out.println(note);

    }

    @AfterClass
    public static void present(){
        System.out.println(new Date());
    }

}
