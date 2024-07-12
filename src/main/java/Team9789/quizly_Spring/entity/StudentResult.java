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
    @GeneratedValue
    @Column(name="stu_num")
    private Integer stuNum;

    // 학생 이름
    @Column(name="stu_name")
    private String stuName;

    @ManyToOne
    @JoinColumn(name="room_num")
    private QuizRoom quizRoom;





}
