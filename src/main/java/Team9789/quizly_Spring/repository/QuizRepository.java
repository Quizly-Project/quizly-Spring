package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}

