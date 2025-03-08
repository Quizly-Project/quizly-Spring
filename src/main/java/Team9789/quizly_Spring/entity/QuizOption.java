package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "quiz_option")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QuizOption {

    @Id
    @GeneratedValue
    @Column(name = "option_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @Column(name = "option")
    private String option;
}
