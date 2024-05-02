package com.webApplication.webApp;

import com.webApplication.webApp.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface StudentRepo extends CrudRepository<Student,Integer> {
}

