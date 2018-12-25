package Service;


import Dao.Student_ScoreDao;
import Domain.Student_Score;

import java.util.List;

public class Student_ScoreService {


    Student_ScoreDao studentDao = new Student_ScoreDao();

    public List<Student_Score> getEvalatorList(int page) {
        return studentDao.getEvalatorList(page);
    }

    public int getEvalatorTotal() {
        return studentDao.getEvalatorTotal();
    }

    public void addEvalator(Student_Score student) {
        studentDao.addEvalator(student);
    }

    public void deleteEvalator(String studentNo) {
        studentDao.deleteEvalator(studentNo);
    }
    public  boolean modifyStudent(String StudentNo,double score){
        return studentDao.modifyStudnt(StudentNo, score);
    }


}
