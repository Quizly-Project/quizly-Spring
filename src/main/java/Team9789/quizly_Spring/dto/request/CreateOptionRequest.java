package Team9789.quizly_Spring.dto.request;

import lombok.Data;

@Data
public class CreateOptionRequest {
    private String optionText;
    private Integer optionNum;
}
