package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.RoomAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomAnswersRepository extends JpaRepository<RoomAnswers, Integer> {
    // 필요한 경우 추가적인 쿼리 메서드를 정의할 수 있습니다.
}
