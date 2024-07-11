package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.dto.QuizResultDto;
import Team9789.quizly_Spring.dto.RoomAnswersDto;
import Team9789.quizly_Spring.entity.QuizResult;
import Team9789.quizly_Spring.entity.RoomAnswers;
import Team9789.quizly_Spring.repository.RoomAnswersRepository;
import Team9789.quizly_Spring.service.QuizResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quizResult")
public class QuizResultController {

    private final QuizResultService quizResultService;
    private final RoomAnswersRepository roomAnswersRepositpory;

    @GetMapping("/quizResult/{quizId}")
    public QuizResult getQuizResult(@PathVariable Integer quizId)
    {
        return quizResultService.getQuizResultById(quizId);
    }



    @PostMapping("/quizResultDto")
    public QuizResult saveQuizResult(@RequestBody QuizResultDto quizResultDto) {
//        return quizResultService.saveQuizResult(quizResultDto);
//        return quizResultService.getQuizResultById(quizResultDto);
        return quizResultService.getQuizResultById(55);
    }


    // 이놈으로 저장
    @PostMapping("/roomAnswers/{quizId}")
    public RoomAnswers saveRoomAnswers(@PathVariable Integer quizId) {
        return roomAnswersRepositpory.findById(quizId).orElse(null);
    }



    @PostMapping("/findId")
    public RoomAnswers RoomSearch() {
        return roomAnswersRepositpory.findById(1).orElse(null);
    }



    @PostMapping("/quizzz/{quizId}")
    public QuizResult PostQuizResult(@PathVariable("quizId") Integer quizId)
    {
        return quizResultService.getQuizResultById(quizId);
    }
}
