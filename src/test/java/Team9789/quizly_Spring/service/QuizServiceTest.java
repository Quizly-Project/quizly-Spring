package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.dto.OptionDto;
import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.dto.QuizPostDto;
import Team9789.quizly_Spring.entity.Quiz;
import Team9789.quizly_Spring.entity.QuizGroup;
import Team9789.quizly_Spring.entity.QuizOption;
import Team9789.quizly_Spring.repository.QuizGroupRepository;
import Team9789.quizly_Spring.repository.QuizOptionRepository;
import Team9789.quizly_Spring.repository.QuizRepository;
import Team9789.quizly_Spring.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class QuizServiceTest {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuizRepository quizRepo;

    @Autowired
    private QuizGroupRepository quizGroupRepo;

    @Autowired
    private QuizOptionRepository quizOptionRepo;

    @Autowired
    private UserRepository userRepo;

    @BeforeEach
    public void setUp() {
        // 데이터베이스 초기화 등을 위해 필요하다면 이곳에 초기화 코드 추가
    }

    @Test
    public void testGetQuizOne() {
        // 통합 테스트를 위한 실제 데이터베이스와의 상호작용
        Integer quizId = 1;
        Quiz quiz = new Quiz();
        quiz.setQuizId(quizId);
        quiz.setType(1);
        quiz.setQuestion("Sample Question");
        quiz.setCorrectAnswer("Answer");
        quiz.setQuizScore(10);
        quiz.setTime(30);

        List<QuizOption> options = new ArrayList<>();
        QuizOption option = new QuizOption();
        option.setOptionNum(1);
        option.setOptionText("Option 1");
        option.setQuiz(quiz);
        options.add(option);
        quiz.setOptions(options);

        quizRepo.save(quiz);  // 실제 데이터베이스에 저장

        QuizDto result = quizService.getQuizOne(quizId);

        assertEquals(1, result.getType());
        assertEquals("Sample Question", result.getQuestion());
        assertEquals("Answer", result.getCorrectAnswer());
        assertEquals(10, result.getScore());
        assertEquals(30, result.getTime());
        assertEquals(1, result.getOptions().size());
        assertEquals("Option 1", result.getOptions().get(0).getOptionText());
    }

    @Test
    public void testAddQuiz() {
        QuizPostDto quizPostDto = new QuizPostDto();
        quizPostDto.setQuizgroup(1);

        QuizDto quizDto = new QuizDto();
        quizDto.setType(1);
        quizDto.setQuestion("Sample Question");
        quizDto.setCorrectAnswer("Answer");
        quizDto.setScore(10);
        quizDto.setTime(30);

        List<OptionDto> options = new ArrayList<>();
        OptionDto optionDto = new OptionDto();
        optionDto.setOptionNum(1);
        optionDto.setOptionText("Option 1");
        options.add(optionDto);
        quizDto.setOptions(options);

        quizPostDto.setQuiz(quizDto);

        QuizGroup quizGroup = new QuizGroup();
        quizGroup.setQuizGroup(1);
        quizGroupRepo.save(quizGroup);  // 실제 데이터베이스에 저장

        quizService.addQuiz(quizPostDto);

        // 추가된 퀴즈를 검증하기 위해 다시 로드
        Quiz savedQuiz = quizRepo.findById(1).orElse(null);

        assertEquals(1, savedQuiz.getQuizgroup().getQuizGroup());
        assertEquals("Sample Question", savedQuiz.getQuestion());
        assertEquals("Answer", savedQuiz.getCorrectAnswer());
        assertEquals(10, savedQuiz.getQuizScore());
        assertEquals(30, savedQuiz.getTime());
        assertEquals(1, savedQuiz.getOptions().size());
        assertEquals("Option 1", savedQuiz.getOptions().get(0).getOptionText());
    }

    @Test
    public void testUpdateQuiz() {
        Quiz quiz = new Quiz();
        quiz.setQuizId(1);
        quiz.setType(1);
        quiz.setQuestion("Updated Question");
        quiz.setCorrectAnswer("Updated Answer");
        quiz.setQuizScore(20);
        quiz.setTime(60);

        quizRepo.save(quiz);  // 업데이트할 퀴즈를 먼저 저장

        quiz.setQuestion("New Question");
        quizService.updateQuiz(quiz);

        Quiz updatedQuiz = quizRepo.findById(1).orElse(null);

        assertEquals("New Question", updatedQuiz.getQuestion());
    }

    @Test
    public void testDeleteQuiz() {
//        Quiz quiz = new Quiz();
//        quiz.setQuizId(1);
//        quizRepo.save(quiz);  // 삭제할 퀴즈를 먼저 저장

//        quizService.deleteQuiz(3);

        Optional<Quiz> deletedQuiz = quizRepo.findById(1);
        assertEquals(Optional.empty(), deletedQuiz);
    }
}
