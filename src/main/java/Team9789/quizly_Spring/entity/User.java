package Team9789.quizly_Spring.entity;

import Team9789.quizly_Spring.ValidationGroups;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class User {

    // 유저 아이디
    @Id
    @Column(name="user_id")
    @NotBlank(message="아이디를 입력해주세요.", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^[a-z0-9]*$", message = "알파벳 소문자(a~z), 숫자(0~9)만 입력 가능합니다.", groups = ValidationGroups.PatternGroup.class)
    private String id;

    // 유저 이름
    @Column(name="user_name")
    @NotBlank(message="이름을 입력해주세요.", groups = ValidationGroups.NotBlankGroup.class)
    private String name;

    // 비밀번호
    @Column(name="user_password")
    @NotBlank(message="비밀번호를 입력해주세요.", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "알파벳 대소문자(a~z, A~Z), 숫자(0~9)만 입력 가능합니다.", groups = ValidationGroups.PatternGroup.class)
    private String password;

    // 이메일
    @Column(name="user_email")
    private String email;
}
