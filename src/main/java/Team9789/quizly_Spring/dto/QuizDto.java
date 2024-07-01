package Team9789.quizly_Spring.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QuizDto {

    private Integer quizId;

    private String quizTitle;

    private String quizDescription;

    private Integer quizScore;
}
