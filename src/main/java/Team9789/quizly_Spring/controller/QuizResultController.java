package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.entity.QuizResult;
import Team9789.quizly_Spring.service.QuizResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quizResult")
public class QuizResultController {

    private final QuizResultService quizResultService;

//    @GetMapping("/quizResult/{quizId}")
//    public QuizResult getQuizResult(@PathVariable Integer quizId)
//    {
//        return quizResultService.getQuizResultById(quizId);
//    }



//    @PostMapping("/quizResultDto")
//    public QuizResult saveQuizResult(@RequestBody QuizResultDto quizResultDto) {
//        return quizResultService.getQuizResultById(55);
//    }


    // 이놈으로 저장
//    @PostMapping("/roomAnswers/{quizId}")
//    public RoomAnswers saveRoomAnswers(@PathVariable Integer quizId) {
//        return roomAnswersRepositpory.findById(quizId).orElse(null);
//    }
//
//
//
//    @PostMapping("/findId")
//    public RoomAnswers RoomSearch() {
//        return roomAnswersRepositpory.findById(1).orElse(null);
//    }



    @PostMapping("/quizzz/{quizId}")
    public QuizResult PostQuizResult(@PathVariable("quizId") Integer quizId)
    {
        return quizResultService.getQuizResultById(quizId);
    }

//    @GetMapping("/quiz/")
//    public RoomAnswersDto getQuizResult(@PathVariable("quizId") Integer quizId)
//    {
//        return quizResultService.getQuizResultById(quizId);
//    }

//    @PostMapping("/{roomCode}")
//    public String PostQuizResult(@PathVariable("roomCode") String roomCode, @RequestBody List<RoomAnswersDto> answers)
//    {
//        this.quizResultService.saveRoomAnswers(roomCode, answers);
//        return roomCode;
//    }
}
