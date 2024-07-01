package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter

public class Quiz {

    // 문제 식별자
    @Id
    @GeneratedValue
    @Column(name="quiz_id")
    private Integer quizId;

    // 퀴즈 제목
    @Column(name="quiz_title")
    private String quizTitle;

    // 퀴즈 설명(본문)
    @Column(name="quiz_description")
    private String quizDescription;

    // 퀴즈 점수
    @Column(name="quiz_score")
    private Integer quizScore;

    @ManyToOne
    @JoinColumn(name="quizzes_id")
    private Quizzes quizzess;

}
