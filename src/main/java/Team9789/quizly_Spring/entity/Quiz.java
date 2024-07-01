package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quiz {

    // 문제 식별자
    @Id
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
    private Quizzes quizzes;

}
