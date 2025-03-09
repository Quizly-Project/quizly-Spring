package Team9789.quizly_Spring.repository.command;

import Team9789.quizly_Spring.entity.QuizGroup;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizGroupCommandRepository {

    //== Business Query ==//

    Long saveQuizGroup(QuizGroup quizGroup);

    Long removeQuizGroup(QuizGroup quizGroup);

    //== Business Query ==//
}
