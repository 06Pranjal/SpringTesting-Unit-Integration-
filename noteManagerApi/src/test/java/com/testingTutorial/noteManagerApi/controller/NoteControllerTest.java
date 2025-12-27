package com.testingTutorial.noteManagerApi.controller;

import com.testingTutorial.noteManagerApi.model.Note;
import com.testingTutorial.noteManagerApi.service.NoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NoteController.class)
class NoteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private NoteService service;

    @Test
    void shouldReturnNoteById() throws Exception {
        // Arrange
        Note note = new Note(1L, "API", "Controller test");
        when(service.getNote(1L)).thenReturn(note);

        // Act & Assert
        mockMvc.perform(get("/notes/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("API"))
                .andExpect(jsonPath("$.content").value("Controller test"));
    }
}
