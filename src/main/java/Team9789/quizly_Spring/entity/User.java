package Team9789.quizly_Spring.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    // 유저 아이디
    @Id
    @Column(name="user_id")
    private String id;
    //
    // 유저 이름
    @Column(name="user_name")
    private String name;

    // 비밀번호
    @Column(name="user_password")
    private String password;
    
    // 이메일
    @Column(name="user_email")
    private String email;

    // 한 명의 유저는 여러 퀴즈를 작성할 수 있음 (1:N)
    @OneToMany
    @JoinColumn(name="quizzes_id", nullable = false)
    private List<Quizzes> quizzes;

    // 한 명의 유저는 여러 퀴즈방을 만들 수 있음 (1:N)
    @OneToMany
    @JoinColumn(name="room_num", nullable = false)
    private List<QuizRoom> quizRooms;

}
