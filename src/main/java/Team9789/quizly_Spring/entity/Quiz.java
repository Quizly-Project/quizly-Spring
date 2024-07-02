package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Quiz {

    // 문제 식별자
    @Id
    @GeneratedValue
    @Column(name="quiz_id")
    private Integer quizId;

    @Column(name="type")
    private Integer type;
    // 문제
    @Column(name="question")
    private String question;

    // 퀴즈 답
    @Column(name="correct_answer")
    private String correctAnswer;

    // 퀴즈 점수
    @Column(name="quiz_score")
    private Integer quizScore;

    // 퀴즈 시간
    @Column(name="time")
    private Integer time;

    @ManyToOne
    @JoinColumn(name="quiz_group")
    private QuizGroup quizgroup;

}
