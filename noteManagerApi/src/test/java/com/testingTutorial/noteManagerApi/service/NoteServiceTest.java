package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import com.testingTutorial.noteManagerApi.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class NoteServiceTest {

    @Mock
    private NoteRepository noteRepository;

    @InjectMocks
    private NoteService noteService;

    @Test
    void shouldCreateNoteSuccessfully() {
        Note note = new Note(
                1L,
                "Test",
                "Testing content"
        );

        when(noteRepository.save(note)).thenReturn(note);
        Note result=noteService.createNote(note);

        Assertions.assertEquals("Test",result.getTitle());
        verify(noteRepository,times(1)).save(note);
    }


}
