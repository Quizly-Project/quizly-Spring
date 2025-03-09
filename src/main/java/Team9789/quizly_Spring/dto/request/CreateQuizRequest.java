package Team9789.quizly_Spring.dto.request;

import Team9789.quizly_Spring.entity.QuizType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuizRequest {

    private QuizType quizType;
    private String question;
    private String correctAnswer;
    private String explanation;
    private Integer quizScore;
    private List<CreateOptionRequest> options = new ArrayList<>();

}
