package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.dto.StudentResultDto;
import Team9789.quizly_Spring.entity.StudentResult;
import Team9789.quizly_Spring.service.StudentResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quizResult")
public class StudentResultController {

    private final StudentResultService studentResultService;

    @GetMapping("/{roomCode}")
    public List<StudentResult> getQuizResult(@PathVariable("roomCode") String roomCode)
    {
        System.out.println("roomCode = " + roomCode);
        return this.studentResultService.getRoomAnswers(roomCode);
    }

    @PostMapping("/{roomCode}")
    public String PostQuizResult(@PathVariable("roomCode") String roomCode, @RequestBody List<StudentResultDto> answers)
    {
        this.studentResultService.saveRoomAnswers(roomCode, answers);
        return roomCode;
    }
}
