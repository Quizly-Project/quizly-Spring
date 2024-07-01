package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Quizzes {

    // 퀴즈 식별자
    @Id
    @GeneratedValue
    @Column(name="quizzes_id")
    private Integer quizzesId;

    // 퀴즈 개수
    @Column(name="quiz_cnt")
    private Integer quizCnt;

    // 여러 퀴즈는 한 명의 선생님과 연결됨 (N:1)
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

//
//    @OneToMany(mappedBy="quizzess")
//    @JoinColumn(name="quiz_id")
//    private List<Quiz> quizs = new ArrayList<>();

}
