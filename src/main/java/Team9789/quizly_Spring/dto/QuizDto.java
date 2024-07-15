package Team9789.quizly_Spring.dto;

import lombok.Data;

import java.util.List;

// 퀴즈 묶음을 등록할 때 필요한 퀴즈 정보를 담는 DTO
@Data
public class QuizDto {

    private Integer quizId;

    private Integer type;

    private String question;

    private String correctAnswer;

    private Integer score;

    private Integer time;

    private List<OptionDto> options;

}
