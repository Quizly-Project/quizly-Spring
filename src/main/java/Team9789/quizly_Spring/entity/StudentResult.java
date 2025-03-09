package Team9789.quizly_Spring.entity;

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

    @OneToOne(mappedBy = "studentResult", fetch = FetchType.LAZY)
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
