package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class QuizResult {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="quiz_id")
    private Integer quizId;

    @Column(name="correct_answer")
    private String correctAnswer;


//    @Column(name="room_num")
//    private Integer roomNum;
    @Column(name="room_cod")
    private String roomCode;


    @Column(name="user_name")
    private String name;



}
