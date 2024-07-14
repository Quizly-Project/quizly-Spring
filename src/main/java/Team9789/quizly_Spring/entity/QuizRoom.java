package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class QuizRoom {
    // 방 코드
    @Id
    @Column(name="room_id")
    private String roomId;

    @UpdateTimestamp
    @Column(name="reg_date")
    private Date regDate;

    // 여러 방은 한 명의 선생님과 연결됨 (N:1)
    @ManyToOne
    @JoinColumn(name="id")
    private UserEntity user;

    @OneToMany
    private List<StudentResult> studentResults = new ArrayList<>();

}
