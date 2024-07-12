package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.dto.QuizResultDto;
import Team9789.quizly_Spring.dto.RoomAnswersDto;
import Team9789.quizly_Spring.entity.QuizResult;
import Team9789.quizly_Spring.entity.RoomAnswers;
import Team9789.quizly_Spring.repository.QuizResultRepository;
import Team9789.quizly_Spring.repository.RoomAnswersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizResultService {

    private final QuizResultRepository quizResultRepository;
    private final RoomAnswersRepository roomAnswersRepository;


    public QuizResult getQuizResultById(Integer quizId)
    {
        return quizResultRepository.findById(quizId).orElse(null);
    }

    public QuizResult saveQuizResult(QuizResultDto quizResultDto)
    {
        QuizResult quizResult = new QuizResult();

        quizResult.setQuizId(quizResultDto.getQuizId());
        quizResult.setCorrectAnswer(quizResultDto.getCorrectAnswer());
        quizResult.setName(quizResultDto.getUserName());
        quizResult.setRoomCode(quizResultDto.getRoomCode());

        return quizResultRepository.save(quizResult);
    }

//    public RoomAnswers saveRoomAnswers(Integer quizId, String ) {
////        //
////        RoomAnswers answers = new RoomAnswers();
////
////        //answers.setQuizId(roomAnswersDto);
////        answers.setSelectOption(roomAnswersDto.getSelectOption());
////        answers.setResult(roomAnswersDto.getResult());
////        answers.setTotalScore(roomAnswersDto.getTotalScore());
//
//        return roomAnswersRepository.save(answers);
//    }


}
