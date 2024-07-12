package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.entity.QuizResult;
import Team9789.quizly_Spring.repository.QuizResultRepository;
import Team9789.quizly_Spring.service.QuizResultService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class QuizResultControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

//    @Autowired
    @Mock
    private QuizResultService quizResultService;

    @Autowired
    private QuizResultRepository quizResultRepository;

    @InjectMocks
    private QuizResultController quizResultController;

    public QuizResultControllerTest() {
    }

//    private QuizResultDto quizResultDto;
//
//    private QuizResult quizResult;

    @BeforeEach
    public void setup() {
        QuizResult quizResult = new QuizResult();

//        quizResult.setQuizId(quizResultDto.getQuizId());
//        quizResult.setCorrectAnswer("1");
//        quizResult.setName("Ali");
//        quizResult.setRoomCode("1");
//        System.out.println("quizResultRepository.save(quizResult) = " + quizResultRepository.save(quizResult));

//        quizResultDto.setQuizId(1);
//        quizResultDto.setCorrectAnswer("Sample Answer");
//        quizResultDto.setRoomNumb(1);
//        quizResultDto.setUserName("Alice");
//        quizResultDto.setRoomNum(1);
//        quizResultDto.setName("Alice");
    }

    @Test
    public void testSaveAndGetQuizResult() throws Exception {
        QuizResult quizResult = new QuizResult();
        QuizResult result = new QuizResult();
        //quizResult.setQuizId(quizResultDto.getQuizId());
        quizResult.setCorrectAnswer("1");
        quizResult.setName("A");
        quizResult.setRoomCode("1");
//        result = quizResultRepository.save(quizResult);

        System.out.println("result = " + result);
        // Test saveQuizResult
//        mockMvc.perform(post("/quizResult")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(quizResultDto)))
//                .andExpect(status().isOk());
//
//        // Test getQuizResult
//        mockMvc.perform(get("/quizResult/{quizId}", quizResultDto.getQuizId()))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.quizId").value(quizResultDto.getQuizId()))
//                .andExpect(jsonPath("$.correctAnswer").value(quizResultDto.getCorrectAnswer()))
//                .andExpect(jsonPath("$.roomNum").value(quizResultDto.getRoomNumb()))
//                .andExpect(jsonPath("$.name").value(quizResultDto.getUserName()));
    }



    @Test
    public void testGetQuizResult() throws Exception {
        QuizResult quizResult = new QuizResult();
        quizResult.setQuizId(253);
        quizResult.setCorrectAnswer("1");
        quizResult.setName("A");
        quizResult.setRoomCode("1");

        when(quizResultService.getQuizResultById(53)).thenReturn(quizResult);

        System.out.println("quizResult = " + quizResult);
        mockMvc = MockMvcBuilders.standaloneSetup(quizResultController).build();
        System.out.println("quizResultController = " + quizResultController);

    }



    @BeforeEach
    public void setupp() {
        QuizResult quizResult = new QuizResult();
        quizResult.setQuizId(253);
        quizResult.setCorrectAnswer("1");
        quizResult.setName("A");
        quizResult.setRoomCode("1");
        quizResultRepository.save(quizResult);
    }

    @Test
    public void testFindQuizResultById() {
        // 실제 데이터베이스에서 QuizResult 조회
        QuizResult savedQuizResult = quizResultRepository.findById(52).orElse(null);

        // 검증
        System.out.println("savedQuizResult.getCorrectAnswer() = " + savedQuizResult.getCorrectAnswer());
        System.out.println("savedQuizResult.getName() = " + savedQuizResult.getName());
        System.out.println("savedQuizResult.getRoomNum() = " + savedQuizResult.getRoomCode());

        //        assertNotNull(savedQuizResult, "Saved quiz result should not be null");
//        assertEquals(253, savedQuizResult.getQuizId(), "Quiz ID should be 253");
//        assertEquals("1", savedQuizResult.getCorrectAnswer(), "Correct answer should be '1'");
//        assertEquals("A", savedQuizResult.getName(), "User name should be 'A'");
//        assertEquals(1, savedQuizResult.getRoomNum(), "Room number should be 1");
    }


    private void print(MockMvc mockMvc) {
        print(mockMvc);
        //        print(mockMvc);

//        mockMvc.perform(get("/quizResult/253")
//                .accept(MediaType.APPLICATION_JSON))
//
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.quizId").value(253))
//                .andExpect(jsonPath("$.correctAnswer").value("1"))
//                .andExpect(jsonPath("$.userName").value("A"))
//                .andExpect(jsonPath("$.roomNum").value("1"))
//                .andDo(print()); // 응답 내용을 출력
    }
}
