package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class QuizRoom {
    // 방번호
    @Id
    @Column(name="room_num")
    private Integer roomNum;

    // 선생님 아이디
    @Column(name="user_id")
    private Integer userId;

    // 퀴즈 진행 일자
    @Column(name="date")
    private Date date;

    // 퀴즈 번호
    @Column(name="quiz_id")
    private Integer quizId;

    // 하나의 퀴즈방은 하나의 퀴즈묶음이랑 연관됨 (1:1)
    @OneToOne
    @Column(name="quizzes_id")
    private Quizzes quizzes;

    // 하나의 퀴즈방은 여러 학생들의 결과를 가질 수 있음 (1:N)
    @OneToMany
    @Column(name="stu_num")
    private List<StudentResult> studentResults;
}
