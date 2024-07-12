package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.StudentResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentResultRepository extends CrudRepository<StudentResult, Integer> {
    List<StudentResult> findByRoomCode(String roomCode);
}
