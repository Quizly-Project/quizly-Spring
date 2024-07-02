package Team9789.quizly_Spring.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuizGroupDto {

    private String quizTitle;

    private String description;

    private String creator;

    private List<QuizDto> quizzes;
}
