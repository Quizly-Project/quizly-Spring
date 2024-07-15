package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.QuizGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuizGroupRepository extends CrudRepository<QuizGroup, Integer> {
    List<QuizGroup> findAllByUser_Username(String username);
}
