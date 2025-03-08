package Team9789.quizly_Spring.entity;

import ch.qos.logback.classic.model.RootLoggerModel;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_result")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentResult {

    @Id
    @GeneratedValue
    @Column(name = "stu_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rood_id")
    private QuizRoom quizRoom;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "select_option")
    private String selectOption;

    @Column(name = "result")
    private String result;

    @Column(name = "total_score")
    private Integer totalScore;

}
