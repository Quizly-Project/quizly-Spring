package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quizzes {

    // 퀴즈 식별자
    @Id
    @Column(name="quizzes_id")
    private Integer quizzesId;

    // 퀴즈 작성자
    @Column(name="user_id")
    private String userId;

    // 하나의 퀴즈묶음은 여러 퀴즈를 가질 수 있음 (1:N)
    @OneToMany
    @JoinColumn(name="quiz_id", nullable = false)
    private List<Quiz> quiz;

}
