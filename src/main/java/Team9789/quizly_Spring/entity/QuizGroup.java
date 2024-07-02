package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class QuizGroup {

    // 퀴즈 식별자
    @Id
    @GeneratedValue
    @Column(name="quiz_group")
    private Integer quizGroup;

    // 퀴즈 그룹 제목
    @Column(name="quiz_title")
    private String quizTitle;

    // 퀴즈 그룹 설명
    @Column(name="quiz_description")
    private String quizDescription;

    // 여러 퀴즈는 한 명의 선생님과 연결됨 (N:1)
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

//    @OneToMany(mappedBy="quizgroup")
//    private List<Quiz> quizs = new ArrayList<>();

}
