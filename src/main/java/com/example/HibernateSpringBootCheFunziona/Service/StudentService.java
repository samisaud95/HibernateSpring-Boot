package com.example.HibernateSpringBootCheFunziona.Service;

import com.example.HibernateSpringBootCheFunziona.Repository.StudentRepository;
import com.example.HibernateSpringBootCheFunziona.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Students creaStudente(Students students){
        studentRepository.save(students);
        return students;
    }

    public List<Students> viewList(){
        return studentRepository.findAll();
    }
}


