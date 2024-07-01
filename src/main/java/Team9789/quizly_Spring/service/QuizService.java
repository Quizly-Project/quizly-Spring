package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.entity.Quiz;
import Team9789.quizly_Spring.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepo;

    // TODO: 퀴즈 목록 가져오기 함수 제작
    public List<Quiz> getQuizList() {
        return (List<Quiz>)quizRepo.findAll();
    }
    // TODO: 퀴즈 하나 가져오기 함수 제작
    public Quiz getQuizOne(Integer quizId) {
        return quizRepo.findById(quizId).orElse(null);

    }
    // TODO: 퀴즈 등록하기
    public void addQuiz(Quiz quiz) {
        quizRepo.save(quiz);
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
