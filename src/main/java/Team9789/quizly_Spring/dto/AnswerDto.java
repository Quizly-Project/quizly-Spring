package Team9789.quizly_Spring.dto;

import lombok.Data;

@Data
public class AnswerDto {

    private String nickName;
    private String selectOption;
    private String result;
    private Integer totalScore;
}
