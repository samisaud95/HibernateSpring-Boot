package com.example.HibernateSpringBootCheFunziona.Controller;

import com.example.HibernateSpringBootCheFunziona.Service.StudentService;
import com.example.HibernateSpringBootCheFunziona.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scuola")
public class StudentController {
        @Autowired
        private StudentService studentService;

        @PostMapping("/addstudente")
        public ResponseEntity<Students> addStudente(@RequestBody Students students){
            studentService.creaStudente(students);
            return ResponseEntity.ok().body(students);
        }

        @GetMapping("/selectstudent")
        public ResponseEntity<List<Students>> selectAllStudent(){
            List<Students> allStudents =   studentService.viewList();
            return ResponseEntity.ok().body(allStudents);
        }
}
