package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentResult {

    // 학생 식별자
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stu_id")
    private Integer stuId;

    @Column(name="quizgroup_id")
    private Integer quizGroupId;

    @Column(name="nickname")
    private String nickName;

    @Column(name="roomcode")
    private String roomCode;

    @Column(name="select_option")
    private String selectOption;

    @Column(name="result")
    private String result;

    @Column(name="total_score")
    private Integer totalScore;





}
