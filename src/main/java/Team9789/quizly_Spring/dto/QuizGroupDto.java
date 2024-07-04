package Team9789.quizly_Spring.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class QuizGroupDto {

    private Integer quizGroup;

    private String quizTitle;

    private String description;

    private String creator;

    private List<QuizDto> quizzes;
}
