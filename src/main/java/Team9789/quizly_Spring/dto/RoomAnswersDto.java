package Team9789.quizly_Spring.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoomAnswersDto {

    private String nickName;

    private List<String> selectOption;

    private List<String> result;

    private Integer totalScore;

}
