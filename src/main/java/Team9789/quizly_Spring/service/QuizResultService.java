//package Team9789.quizly_Spring.service;
//
//import Team9789.quizly_Spring.entity.QuizResult;
//import Team9789.quizly_Spring.repository.QuizResultRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class QuizResultService {
//
//    private final QuizResultRepository quizResultRepository;
//
//
//
//    public QuizResult getQuizResultById(Integer quizId)
//    {
//        return quizResultRepository.findById(quizId).orElse(null);
//    }
//
//
////    public RoomAnswers getRoomAnswers(){
////
////        return null;
////    }
////    public RoomAnswers saveRoomAnswers(String roomCode, List<StudentResultDto> answers) {
////
////        for(StudentResultDto answer : answers) {
////
////            StudentResult studentResult = new StudentResult();
////            studentResult.setQuizGroupId(answer.getQuizGroupId());
////            studentResult.setNickName(answer.getNickName());
////            studentResult.setRoomCode(roomCode);
////            String selectOption = "selectOption : "+ Arrays.toString(answer.getSelectOption().toArray());
////            String result = "result : "+Arrays.toString(answer.getResult().toArray());
////            studentResult.setSelectOption(selectOption);
////            studentResult.setResult(result);
////            studentResult.setTotalScore(answer.getTotalScore());
////
////            roomAnswersRepository.save(studentResult);
////        }
////        return null;
////    }
//
//
//}
