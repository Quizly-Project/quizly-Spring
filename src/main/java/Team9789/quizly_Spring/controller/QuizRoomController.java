package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.entity.QuizRoom;
import Team9789.quizly_Spring.service.QuizRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quizRoom")
public class QuizRoomController {

    private final QuizRoomService quizRoomService;

    @GetMapping("/{roomCode}")
    public QuizRoom getQuizRoom(@PathVariable("roomCode") String roomCode)
    {
        // 임시 로그인
        String userName = "qwe1234";
        return quizRoomService.getRoom(roomCode);
    }

    @PostMapping("/{roomCode}")
    public ResponseEntity<String> postQuizRoom(@PathVariable("roomCode") String roomCode)
    {
        // 임시 로그인
        String userName = "qwe1234";
        quizRoomService.saveRoom(roomCode, userName);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }
}
