//package Team9789.quizly_Spring.controller;
//
//import Team9789.quizly_Spring.dto.QuizDto;
//import Team9789.quizly_Spring.entity.Quiz;
//import Team9789.quizly_Spring.service.QuizService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/quiz")
//public class QuizController {
//
//    // 퀴즈 서비스 의존성 주입
//    private final QuizService quizService;
//
//    // 퀴즈 묶음 목록 불러오기
//    @GetMapping("")
//    @ResponseBody
//    public ResponseEntity<List<Quiz>> getQuizList() {
//        //TODO: 퀴즈 목록을 DB에서 가져와야 함
//        List<Quiz> quizList = quizService.getQuizList();
//        return new ResponseEntity<List<Quiz>>(quizList, HttpStatus.OK);
//    }
//
//    // 특정 퀴즈 묶음 불러오기
//    @GetMapping("/{quizId}")
//    @ResponseBody
//    public ResponseEntity<Quiz> getQuizOne(@PathVariable Integer quizId){
//        //TODO: 특정 퀴즈를 DB에서 가져와야 함
//        Quiz quiz = quizService.getQuizOne(quizId);
//        return new ResponseEntity<Quiz>(quiz, HttpStatus.OK);
//    }
//
//    // 퀴즈 묶음 추가
//    @PostMapping("")
//    @ResponseBody
//    public ResponseEntity<String> addQuiz(@RequestBody QuizDto quizDto){
////        System.out.println("quizDto = " + quizDto);
////
////        Quiz quiz = new Quiz();
////        quiz.setQuizScore(quizDto.getQuizScore());
//
//        //TODO: 특정 퀴즈를 등록해야 함
//        //quizService.addQuiz(quiz);
//
//        return new ResponseEntity<String>("Post Success", HttpStatus.OK);
//    }
//
//    // 퀴즈 묶음 삭제
//    @DeleteMapping("/{quizId}")
//    @ResponseBody
//    public ResponseEntity<String> deleteQuiz(@PathVariable Integer quizId){
//        //TODO: 특정 퀴즈를 삭제 (퀴즈 묶음에 포함된 모든 퀴즈도 삭제되어야 함)
//        quizService.deleteQuiz(quizId);
//        return new ResponseEntity<String>("Delete Success", HttpStatus.OK);
//    }
//}
