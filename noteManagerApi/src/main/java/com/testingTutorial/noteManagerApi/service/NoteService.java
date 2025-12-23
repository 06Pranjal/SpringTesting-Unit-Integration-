package com.testingTutorial.noteManagerApi.service;

import com.testingTutorial.noteManagerApi.model.Note;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NoteService {
    private final Map<Long, Note> notes=new HashMap<>();

    public Note createNote(Note note){
        notes.put(note.getId(),note);
        return note;
    }

    public Note getNote(Long id){
        return notes.get(id);
    }
}
