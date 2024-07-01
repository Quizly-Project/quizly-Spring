package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.entity.Quizzes;
import Team9789.quizly_Spring.repository.QuizzesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizzesService {

    private final QuizzesRepository quizzesRepo;

    // TODO: 퀴즈 묶음 목록 가져오기 함수 제작
    public List<Quizzes> getQuizzesList() {
        return (List<Quizzes>)quizzesRepo.findAll();
    }

    // TODO: 퀴즈 묶음 하나 가져오기 함수 제작
    public Quizzes getQuizzesOne(Integer quizzesId) {
        return quizzesRepo.findById(quizzesId).orElse(null);

    }
    // TODO: 퀴즈 묶음 등록하기
    public void addQuizzes(Quizzes quizzes) {
        quizzesRepo.save(quizzes);
    }

    // TODO: 퀴즈 묶음 수정하기
//    public void updateQuizzes(Quizzes quizzes) {
//        quizzesRepo.
//    }

    // TODO: 퀴즈 묶음 삭제하기
    public void deleteQuizzes(Integer quizzesId) {
        quizzesRepo.deleteById(quizzesId);
    }
}
