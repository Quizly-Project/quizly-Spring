package Team9789.quizly_Spring.dto;

import lombok.Data;

@Data
public class QuizResultDto {

    private Integer quizId;

    private String correctAnswer;

    private String roomCode;

    private String userName;

}
