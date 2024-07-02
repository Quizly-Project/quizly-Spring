package Team9789.quizly_Spring.repository;

import Team9789.quizly_Spring.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
