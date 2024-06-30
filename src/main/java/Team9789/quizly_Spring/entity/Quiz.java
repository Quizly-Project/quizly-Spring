package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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

    // 퀴즈 묶음 아이디
    @Column(name="quizzes_id")
    private Integer quizzesId;
}
