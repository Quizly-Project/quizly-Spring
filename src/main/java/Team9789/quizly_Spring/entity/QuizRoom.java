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

    // 퀴즈 진행 일자
    @Column(name="date")
    private Date date;

    // 여러 방은 한 명의 선생님과 연결됨 (N:1)
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
