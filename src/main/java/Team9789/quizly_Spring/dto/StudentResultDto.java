package Team9789.quizly_Spring.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentResultDto {

    private Integer quizGroupId;

    private String nickName;

    private List<String> selectOption;

    private List<String> result;

    private Integer totalScore;
}
