package Team9789.quizly_Spring.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = Replace.NONE) // 실제 데이터베이스 사용
public class QuizControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    // 테스트할 데이터베이스의 샘플 데이터
    private static final int SAMPLE_QUIZ_ID = 1;

    @Test
    public void testGetQuizById() throws Exception {
        // 특정 ID의 퀴즈를 가져오는 테스트
        mockMvc.perform(MockMvcRequestBuilders.get("/quiz/{quizId}", SAMPLE_QUIZ_ID)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$.quizId", is(SAMPLE_QUIZ_ID)))
                .andExpect(jsonPath("$.correctAnswer", is("Sample Answer")))
                .andExpect(jsonPath("$.question", is("Sample Question")))
                .andExpect(jsonPath("$.quizScore", is(10)))
                .andExpect(jsonPath("$.time", is(30)))
                .andExpect(jsonPath("$.type", is(1)));
//                .andExpect(jsonPath("$.quizGroup", is(1)));
    }

    @Test
    public void testGetAllQuizzes() throws Exception {
        // 모든 퀴즈 목록을 가져오는 테스트
        mockMvc.perform(MockMvcRequestBuilders.get("/quiz")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$", hasSize(1))) // 예제에서는 하나의 퀴즈만 있음
                .andExpect(jsonPath("$[0].quizId", is(SAMPLE_QUIZ_ID)))
                .andExpect(jsonPath("$[0].correctAnswer", is("Sample Answer")))
                .andExpect(jsonPath("$[0].question", is("Sample Question")))
                .andExpect(jsonPath("$[0].quizScore", is(10)))
                .andExpect(jsonPath("$[0].time", is(30)))
                .andExpect(jsonPath("$[0].type", is(1)));
//                .andExpect(jsonPath("$[0].quizGroup", is(1)));
    }
}
