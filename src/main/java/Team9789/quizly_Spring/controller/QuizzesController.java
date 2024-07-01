package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.dto.QuizzesDto;
import Team9789.quizly_Spring.entity.Quizzes;
import Team9789.quizly_Spring.service.QuizService;
import Team9789.quizly_Spring.service.QuizzesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
@RequiredArgsConstructor
public class QuizzesController {

    // 퀴즈 묶음 서비스 의존성 주입
    private final QuizzesService quizzesService;

    // 퀴즈 묶음 목록 불러오기
    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<Quizzes>> getQuizzesList() {
        //TODO: 퀴즈 묶음 목록을 DB에서 가져와야 함
        List<Quizzes> quizzesList = quizzesService.getQuizzesList();
        return new ResponseEntity<List<Quizzes>>(quizzesList, HttpStatus.OK);
    }

    // 특정 퀴즈 묶음 불러오기
    @GetMapping("/{quizzesId}")
    @ResponseBody
    public ResponseEntity<Quizzes> getQuizzesOne(@PathVariable Integer quizzesId){
        //TODO: 특정 퀴즈 묶음을 DB에서 가져와야 함
        Quizzes quizzes = quizzesService.getQuizzesOne(quizzesId);
        return new ResponseEntity<Quizzes>(quizzes, HttpStatus.OK);
    }

    // 퀴즈 묶음 추가
    @PostMapping("")
    @ResponseBody
    public ResponseEntity<String> addQuizzes(@RequestBody QuizzesDto quizzesDto, List<QuizDto> quizes ){
        System.out.println("quizzesDto = " + quizzesDto);
        System.out.println("quizes = " + quizes);
        //TODO: 특정 퀴즈 묶음을 등록해야 함
        //quizzesService.addQuizzes(quizzes);
        return new ResponseEntity<String>("Post Success", HttpStatus.OK);
    }

    // 퀴즈 묶음 삭제
    @DeleteMapping("/{quizzesId}")
    @ResponseBody
    public ResponseEntity<String> deleteQuizzes(@PathVariable Integer quizzesId){
        //TODO: 특정 퀴즈 묶음 삭제 (퀴즈 묶음에 포함된 모든 퀴즈도 삭제되어야 함)
        quizzesService.deleteQuizzes(quizzesId);
        return new ResponseEntity<String>("Delete Success", HttpStatus.OK);
    }
}
