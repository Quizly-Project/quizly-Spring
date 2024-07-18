package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.dto.OptionDto;
import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.dto.QuizPostDto;
import Team9789.quizly_Spring.entity.*;
import Team9789.quizly_Spring.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepo;
    private final QuizGroupRepository quizGroupRepo;
    private final QuizOptionRepository quizOptionRepo;
    private final UserRepository userRepo;

    // TODO: 퀴즈 하나 가져오기 함수 제작
    public QuizDto getQuizOne(Integer quizId) {
        Quiz quiz = quizRepo.findById(quizId).orElse(null);
        System.out.println("quiz = " + quiz);
        QuizDto quizDto = new QuizDto();
        quizDto.setType(quiz.getType());
        quizDto.setQuestion(quiz.getQuestion());
        quizDto.setCorrectAnswer(quiz.getCorrectAnswer());
        quizDto.setScore(quiz.getQuizScore());
        quizDto.setTime(quiz.getTime());
        quizDto.setExplanation(quiz.getExplanation());

        if(quiz.getOptions() != null){
            List<OptionDto> options = new ArrayList<>();
            for(QuizOption option : quiz.getOptions()) {
                OptionDto optionDto = new OptionDto();
                optionDto.setOptionNum(option.getOptionNum());
                optionDto.setOptionText(option.getOptionText());
                options.add(optionDto);
            }
            quizDto.setOptions(options);
        }

        return quizDto;
    }
    // TODO: 퀴즈 등록하기
    public void addQuiz(QuizPostDto quizPostDto) {

        QuizGroup quizGroup = (QuizGroup)quizGroupRepo.findById(quizPostDto.getQuizgroup()).orElse(null);

        Quiz quiz = new Quiz();
        quiz.setQuizgroup(quizGroup);
        quiz.setType(quizPostDto.getQuiz().getType());
        quiz.setQuestion(quizPostDto.getQuiz().getQuestion());
        quiz.setCorrectAnswer(quizPostDto.getQuiz().getCorrectAnswer());
        quiz.setQuizScore(quizPostDto.getQuiz().getScore());
        quiz.setTime(quizPostDto.getQuiz().getTime());
        quiz.setExplanation(quizPostDto.getQuiz().getExplanation());

        quiz = quizRepo.save(quiz);
        System.out.println("quiz = " + quiz);
        if(quizPostDto.getQuiz().getOptions() != null) {
            List<QuizOption> options = new ArrayList<>();
            for(OptionDto optionDto : quizPostDto.getQuiz().getOptions()) {
                QuizOption option = new QuizOption();
                option.setOptionNum(optionDto.getOptionNum());
                option.setOptionText(optionDto.getOptionText());
                option.setQuiz(quiz);
                options.add(option);
                quizOptionRepo.save(option);
            }
        }
    }
    // TODO: 퀴즈 수정하기
    public void updateQuiz(Quiz quiz) {
        quizRepo.save(quiz);
    }
    // TODO: 퀴즈 삭제하기
    public void deleteQuiz(Integer quizId) {
        quizRepo.deleteById(quizId);
    }

}
