package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="quiz_group")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QuizGroup {

    @Id
    @GeneratedValue
    @Column(name = "quiz_group_id")
    private Long id;

    // 퀴즈 제작 유저
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private UserEntity userEntity;

    // 퀴즈 묶음 제목
    @Column(name = "quiz_title")
    private String quizTitle;

    // 퀴즈 묶음 설명
    @Column(name="quiz_group_description")
    private String quizGroupDescription;

    // 퀴즈 목록
    @OneToMany(mappedBy = "quizGroup", cascade = CascadeType.ALL)
    private List<Quiz> quizList = new ArrayList<>();

}
