package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quizzes {

    // 퀴즈 식별자
    @Id
    @GeneratedValue
    @Column(name="quizzes_id")
    private Integer quizzesId;

    // 여러 퀴즈는 한 명의 선생님과 연결됨 (N:1)
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
