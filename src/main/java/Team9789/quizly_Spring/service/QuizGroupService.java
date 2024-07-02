package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.dto.OptionDto;
import Team9789.quizly_Spring.dto.QuizGroupDto;
import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.entity.Quiz;
import Team9789.quizly_Spring.entity.QuizGroup;
import Team9789.quizly_Spring.entity.QuizOption;
import Team9789.quizly_Spring.entity.User;
import Team9789.quizly_Spring.repository.QuizGroupRepository;
import Team9789.quizly_Spring.repository.QuizOptionRepository;
import Team9789.quizly_Spring.repository.QuizRepository;
import Team9789.quizly_Spring.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizGroupService {

    private final QuizGroupRepository quizGroupRepo;
    private final QuizOptionRepository quizOptionRepo;
    private final UserRepository userRepo;
    private final QuizRepository quizRepo;



    // TODO: 퀴즈 묶음 목록 가져오기 함수 제작
    public List<QuizGroup> getQuizzesList() {
        return (List<QuizGroup>)quizGroupRepo.findAll();
    }

    // TODO: 퀴즈 묶음 하나 가져오기 함수 제작
    public QuizGroup getQuizzesOne(Integer quizzesId) {
        return quizGroupRepo.findById(quizzesId).orElse(null);

    }
    @Transactional
    // TODO: 퀴즈 묶음 등록하기
    public void addQuizzes(QuizGroupDto quizGroupDto) {

        System.out.println("quizGroupDto = " + quizGroupDto);
        QuizGroup quizGroup = new QuizGroup();
        User user = userRepo.findById(quizGroupDto.getCreator()).orElse(null);
        quizGroup.setUser(user);

        // 퀴즈 그룹 생성 후 저장
        quizGroup.setQuizTitle(quizGroupDto.getQuizTitle());
        quizGroup.setQuizDescription(quizGroupDto.getDescription());
        System.out.println("quizGroup = " + quizGroup);
        quizGroup = quizGroupRepo.save(quizGroup);

        // 퀴즈 생성 후 저장
        if(quizGroupDto.getQuizzes() != null) {
            for(QuizDto quizDto : quizGroupDto.getQuizzes()) {
                Quiz quiz = new Quiz();
                quiz.setQuizgroup(quizGroup);
                quiz.setType(quizDto.getType());
                quiz.setQuestion(quizDto.getQuestion());
                quiz.setCorrectAnswer(quizDto.getCorrectAnswer());
                quiz.setQuizScore(quizDto.getScore());
                quiz.setTime(quizDto.getTime());

                quiz = quizRepo.save(quiz);

                // 퀴즈 선택지 생성 후 저장
                if(quizDto.getOptions() != null){
                    for(OptionDto curr : quizDto.getOptions()) {
                        QuizOption quizOption = new QuizOption();
                        quizOption.setQuiz(quiz);
                        quizOption.setOptionText(curr.getOptionText());
                        quizOption.setOrderNum(curr.getOptionNum());

                        quizOptionRepo.save(quizOption);
                    }
                }
            }
        }

    }

    // TODO: 퀴즈 묶음 수정하기
//    public void updateQuizzes(Quizzes quizzes) {
//        quizzesRepo.
//    }

    // TODO: 퀴즈 묶음 삭제하기
    public void deleteQuizzes(Integer quizzesId) {
        quizGroupRepo.deleteById(quizzesId);
    }
}
