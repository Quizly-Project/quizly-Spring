package Team9789.quizly_Spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quiz_type")
public class QuizType {
    @Id
    @GeneratedValue
    @Column(name = "quiz_type_id")
    private Long id;

    @Column(name = "type_name")
    private String typeName;
}
