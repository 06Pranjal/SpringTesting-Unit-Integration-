package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import com.testingTutorial.noteManagerApi.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public Note createNote(Note note){
        return noteRepository.save(note);
    }

    public Note getNote(Long id){
        return noteRepository.findById(id);
    }
}
