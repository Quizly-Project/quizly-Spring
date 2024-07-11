package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    @GeneratedValue
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
