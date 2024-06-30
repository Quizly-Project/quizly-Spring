package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

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
}
