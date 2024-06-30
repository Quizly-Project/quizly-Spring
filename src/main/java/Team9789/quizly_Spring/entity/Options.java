package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Options {

    // 선택지 식별자
    @Id
    @Column(name="option_id")
    private Integer optionId;

    // 퀴즈 식별자
    @Column(name="quiz_id")
    private Integer quizId;

    // 선택지 내용
    @Column(name="option_text")
    private String optionText;

    // 선택지 정답 여부 0 이면 거짓, 1이면 참
    @Column(name="right_answer")
    private Integer rightAnswer ;

}
