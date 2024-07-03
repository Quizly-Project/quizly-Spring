package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.dto.QuizPostDto;
import Team9789.quizly_Spring.entity.Quiz;
import Team9789.quizly_Spring.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quiz")
public class QuizController {

    // 퀴즈 서비스 의존성 주입
    private final QuizService quizService;

    // 퀴즈 모두 불러오기
    @GetMapping("/user/{username}")
    @ResponseBody
    public ResponseEntity<List<Quiz>> getQuizList(@PathVariable("username") String username){

        //TODO: 퀴즈 목록을 DB에서 가져와야 함
        //quizService.getQuizListByUserName(username);
        List<Quiz> quizList = new ArrayList<>();

        return new ResponseEntity<List<Quiz>>(quizList, HttpStatus.OK);
    }

    // 특정 퀴즈 묶음 불러오기
    @GetMapping("/{quizId}")
    @ResponseBody
    public ResponseEntity<QuizDto> getQuizOne(@PathVariable("quizId") Integer quizId){
        //TODO: 특정 퀴즈를 DB에서 가져와야 함
        QuizDto quizDto = quizService.getQuizOne(quizId);
        return new ResponseEntity<QuizDto>(quizDto, HttpStatus.OK);
    }

    // 퀴즈 묶음 추가
    @PostMapping("")
    @ResponseBody
    public ResponseEntity<String> addQuiz(@RequestBody QuizPostDto quizPostDto){
        System.out.println("quizDto = " + quizPostDto);

        //TODO: 특정 퀴즈를 등록해야 함
        quizService.addQuiz(quizPostDto);
        return new ResponseEntity<String>("Post Success", HttpStatus.OK);
    }

    // 퀴즈 묶음 삭제
    @DeleteMapping("/{quizId}")
    @ResponseBody
    public ResponseEntity<String> deleteQuiz(@PathVariable("quizId") Integer quizId){
        //TODO: 특정 퀴즈를 삭제 (퀴즈 묶음에 포함된 모든 퀴즈도 삭제되어야 함)
        quizService.deleteQuiz(quizId);
        return new ResponseEntity<String>("Delete Success", HttpStatus.OK);
    }
}
