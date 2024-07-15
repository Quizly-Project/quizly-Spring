package Team9789.quizly_Spring.service;

import Team9789.quizly_Spring.entity.QuizRoom;
import Team9789.quizly_Spring.entity.UserEntity;
import Team9789.quizly_Spring.repository.QuizRoomRepository;
import Team9789.quizly_Spring.repository.StudentResultRepository;
import Team9789.quizly_Spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class QuizRoomService {

    private final QuizRoomRepository quizRoomRepo;
    private final StudentResultRepository studentResultRepo;
    private final UserRepository userRepo;


    public QuizRoom getRoom(String roomId){
        QuizRoom quizRoom = quizRoomRepo.findByRoomId(roomId);
        quizRoom.setStudentResults(studentResultRepo.findByRoomCode(roomId));
        UserEntity user = new UserEntity();
        user.setId(quizRoom.getUser().getId());
        user.setUsername(quizRoom.getUser().getUsername());
        quizRoom.setUser(user);
        System.out.println("quizRoom = " + quizRoom);
        return quizRoom;
    }

    public void saveRoom(String RoomId, String userName){
        QuizRoom quizRoom = new QuizRoom();
        quizRoom.setRoomId(RoomId);
        quizRoom.setUser(userRepo.findByUsername(userName));
        quizRoomRepo.save(quizRoom);
    }
}
