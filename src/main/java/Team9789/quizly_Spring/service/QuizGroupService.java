package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.dto.QuizGroupDto;
import Team9789.quizly_Spring.dto.UserDto;
import Team9789.quizly_Spring.dto.request.CreateQuizGroupRequest;
import Team9789.quizly_Spring.dto.request.UpdateQuizGroupRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizGroupService {

    List<QuizGroupDto> getQuizGroupByName(String username, int offset, int limit);

    List<QuizGroupDto> getQuizGroupAll(int offset, int limit);

    QuizGroupDto getQuizGroupOne(Long quizGroupId);

    Long saveQuizGroup(UserDto userDto, CreateQuizGroupRequest request) ;

    Long updateQuizGroup(UserDto userDto, UpdateQuizGroupRequest request);

    Long removeQuizGroup(UserDto userDto, Long quizGroupId);
}
