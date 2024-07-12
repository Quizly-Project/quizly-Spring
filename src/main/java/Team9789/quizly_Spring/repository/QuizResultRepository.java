package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.QuizResult;
import Team9789.quizly_Spring.entity.RoomAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface QuizResultRepository extends JpaRepository<QuizResult, Integer>
{
}
