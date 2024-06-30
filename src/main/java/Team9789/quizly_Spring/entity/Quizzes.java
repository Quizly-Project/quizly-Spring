package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quizzes {

    // 퀴즈 식별자
    @Id
    @Column(name="quizzes_id")
    private Integer quizzesId;

    // 퀴즈 작성자
    @Column(name="user_id")
    private String userId;
}
