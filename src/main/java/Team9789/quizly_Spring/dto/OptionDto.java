package Team9789.quizly_Spring.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


// 퀴즈 묶음을 저장할 때 필요한 Option 정보를 담는 DTO;
@Data
@Getter
@Setter
public class OptionDto {

    private Integer optionId;

    private String optionText;

    private Integer optionNum;
}
