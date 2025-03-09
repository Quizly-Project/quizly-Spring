package Team9789.quizly_Spring.dto.request;

import Team9789.quizly_Spring.dto.QuizDto;
import Team9789.quizly_Spring.entity.Quiz;
import Team9789.quizly_Spring.entity.QuizType;
import Team9789.quizly_Spring.entity.UserEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateQuizGroupRequest {

    private String quizTitle;
    private String quizGroupDescription;
    private List<CreateQuizRequest> quizzes = new ArrayList<>();

}
