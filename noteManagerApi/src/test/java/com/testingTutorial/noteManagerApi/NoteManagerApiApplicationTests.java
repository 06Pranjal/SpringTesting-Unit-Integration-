package com.testingTutorial.noteManagerApi;

import com.testingTutorial.noteManagerApi.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class NoteManagerApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private NoteRepository noteRepository;

	@Test
	void fullFlowTest() throws Exception {

		String json = """
                {
                  "id": 1,
                  "title": "Integration",
                  "content": "Full App Test"
                }
                """;

		mockMvc.perform(
				post("/notes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(json)
		).andExpect(status().isOk());
	}
}
