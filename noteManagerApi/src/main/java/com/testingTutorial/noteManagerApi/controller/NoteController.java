package com.testingTutorial.noteManagerApi.controller;

import com.testingTutorial.noteManagerApi.model.Note;
import com.testingTutorial.noteManagerApi.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NoteController {
     private final NoteService noteService;

     @PostMapping
     public Note create(@RequestBody Note note){
         return noteService.createNote(note);
     }

     @GetMapping("/{id}")
     public Note get(@PathVariable long id){
         return noteService.getNote(id);
     }
}
