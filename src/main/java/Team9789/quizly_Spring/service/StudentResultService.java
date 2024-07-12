package Team9789.quizly_Spring.service;


import Team9789.quizly_Spring.dto.StudentResultDto;
import Team9789.quizly_Spring.entity.StudentResult;
import Team9789.quizly_Spring.repository.StudentResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentResultService {

    private final StudentResultRepository studentResultRepo;

    public List<StudentResult> getRoomAnswers(String roomCode){
        return studentResultRepo.findByRoomCode(roomCode);
    }

    public StudentResult saveRoomAnswers(String roomCode, List<StudentResultDto> answers) {

        for (StudentResultDto answer : answers) {

            StudentResult studentResult = new StudentResult();
            studentResult.setQuizGroupId(answer.getQuizGroupId());
            studentResult.setNickName(answer.getNickName());
            studentResult.setRoomCode(roomCode);
            String selectOption = "selectOption : " + Arrays.toString(answer.getSelectOption().toArray());
            String result = "result : " + Arrays.toString(answer.getResult().toArray());
            studentResult.setSelectOption(Arrays.toString(answer.getSelectOption().toArray()));
            studentResult.setResult(Arrays.toString(answer.getResult().toArray()));
            studentResult.setTotalScore(answer.getTotalScore());

            studentResultRepo.save(studentResult);
        }

        return null;
    }
}
