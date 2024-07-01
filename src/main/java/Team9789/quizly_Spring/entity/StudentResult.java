package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

@Entity
public class StudentResult {

    // 학생 식별자
    @Id
    @Column(name="stu_num")
    private Integer stuNum;

//    // 참여한 방번호
//    @Column(name="room_num")
//    private Integer roomNum;

    // 학생 이름
    @Column(name="stu_name")
    private String stuName;

    @ManyToOne
    @JoinColumn(name="room_num")
    private QuizRoom quizRoom;
}
