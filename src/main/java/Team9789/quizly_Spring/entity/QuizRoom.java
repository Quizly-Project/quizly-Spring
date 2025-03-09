package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "quiz_room")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QuizRoom {

    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private UserEntity userEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_group_id")
    private QuizGroup quizGroup;

    @Column(name = "room_code")
    private String roomCode;

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "stu_id")
    private StudentResult studentResult;
}
