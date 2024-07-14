package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.QuizRoom;
import org.springframework.data.repository.CrudRepository;

public interface QuizRoomRepository extends CrudRepository<QuizRoom, String> {
    QuizRoom findByRoomId(String roomId);
}
