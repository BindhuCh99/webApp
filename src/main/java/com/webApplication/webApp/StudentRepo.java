package com.webApplication.webApp;

import com.webApplication.webApp.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student,Integer> {

}

