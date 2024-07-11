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
public class RoomAnswers {


//    private String selectOption;

//    private String result;

//    private Integer totalScore;

    //primary key
    @Id
    @GeneratedValue
    @Column(name="quiz_id")
    private Integer quizId;

    @Column(name="select_option")
    private String selectOption;


    //    @Column(name="room_num")
//    private Integer roomNum;
    @Column(name="result_ox")
    private String result;


    @Column(name="total_score")
    private Integer totalScore;

}

