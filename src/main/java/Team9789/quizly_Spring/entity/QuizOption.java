package Team9789.quizly_Spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuizOption {

    // 선택지 식별자
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="option_id")
    private Integer optionId;

    // 선택지 내용
    @Column(name="option_text")
    private String optionText;

    @Column(name="order_num")
    private Integer optionNum;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="quiz_id")
    private Quiz quiz;

    // 선택지 정답 여부 0 이면 거짓, 1이면 참
//    @Column(name="right_answer")
//    private Integer rightAnswer ;

}
