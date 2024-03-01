package com.example.HibernateSpringBootCheFunziona.Repository;

import com.example.HibernateSpringBootCheFunziona.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {

}
