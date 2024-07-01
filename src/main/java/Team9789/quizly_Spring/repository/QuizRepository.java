package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}
