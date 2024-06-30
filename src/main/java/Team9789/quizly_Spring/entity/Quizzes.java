package Team9789.quizly_Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Quizzes {

    // 퀴즈 식별자
    @Id
    @Column(name="quiz_id")
    private String quizId;

    // 퀴즈 제목
    @Column(name="quiz_title")
    private String quizTitle;

    // 퀴즈 설명
    @Column(name="quiz_description")
    private String quizDescription;

    // 퀴즈 작성자
    @Column(name="quiz_writer")
    private String writer;
}
