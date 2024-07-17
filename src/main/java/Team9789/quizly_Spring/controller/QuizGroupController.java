package Team9789.quizly_Spring.controller;

import Team9789.quizly_Spring.dto.QuizGroupDto;
import Team9789.quizly_Spring.entity.QuizGroup;
import Team9789.quizly_Spring.service.QuizGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizgroup")
@RequiredArgsConstructor
public class QuizGroupController {

    // 퀴즈 묶음 서비스 의존성 주입
    private final QuizGroupService quizGroupService;

    // 특정 유저가 등록한 퀴즈 묶음 목록을 가져온다.
    @GetMapping("/user/{username}")
    public List<QuizGroup> getQuizzesListByUserName(@PathVariable("username") String username) {
        //TODO: JWT 토큰에서 username을 가져와서 처리하도록 해야 함
        return quizGroupService.getQuizGroupsByUser(username);
    }

    // 퀴즈 묶음 목록 불러오기
    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<QuizGroup>> getQuizzesList() {
        //TODO: 퀴즈 묶음 목록을 DB에서 가져와야 함
        System.out.println("quizGroupService.getQuizzesList() = " + quizGroupService.getQuizzesList());
        List<QuizGroup> quizGroupList = quizGroupService.getQuizzesList();
        return new ResponseEntity<List<QuizGroup>>(quizGroupList, HttpStatus.OK);
    }

    // 특정 퀴즈 묶음 불러오기
    @GetMapping("/{quizgroupId}")
    @ResponseBody
    public ResponseEntity<QuizGroup> getQuizzesOne(@PathVariable("quizgroupId") Integer quizgroupId){
        System.out.println("quizgroupId = " + quizgroupId);
        //TODO: 특정 퀴즈 묶음을 DB에서 가져와야 함
        QuizGroup quizGroup = quizGroupService.getQuizzesOne(quizgroupId);
        return new ResponseEntity<QuizGroup>(quizGroup, HttpStatus.OK);
    }

    // 퀴즈 묶음 추가
    @PostMapping("")
    @ResponseBody
    public ResponseEntity<String> addQuizzes(@RequestBody QuizGroupDto quizGroupDto){
        System.out.println("---------------컨트롤러 호출---------------");
        System.out.println("quizzesDto = " + quizGroupDto);
        //TODO: 특정 퀴즈 묶음을 등록해야 함

        System.out.println("---------------컨트롤러 -> 서비스---------------");
        quizGroupService.addQuizzes(quizGroupDto);

        return new ResponseEntity<String>("Post Success", HttpStatus.OK);
    }

    // 퀴즈 묶음 삭제
    @DeleteMapping("/{quizgroupId}")
    @ResponseBody
    public ResponseEntity<String> deleteQuizzes(@PathVariable("quizgroupId") Integer quizgroupId){
        System.out.println("quizgroupId aaaaaaaa= " + quizgroupId);
        //TODO: 특정 퀴즈 묶음 삭제 (퀴즈 묶음에 포함된 모든 퀴즈도 삭제되어야 함)
        quizGroupService.deleteQuizzes(quizgroupId);
        return new ResponseEntity<String>("Delete Success", HttpStatus.OK);
    }

    //nest로 퀴즈 묶음 보내기
    @GetMapping("/send/{quizgroupId}")
    @ResponseBody
    public ResponseEntity<QuizGroupDto> getQuizGroup(@PathVariable("quizgroupId") Integer quizgroupId) {
        System.out.println("====== quiz Group 전송!!! ========");
        QuizGroupDto quizGroup = quizGroupService.getQuizGroup(quizgroupId);
        return ResponseEntity.ok(quizGroup);
    }
}
