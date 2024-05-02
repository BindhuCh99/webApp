package com.webApplication.webApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter

public class Student {
    @Id
    private int id;
    private String name;
    private String tech;
    @Override
    public String toString() {
        return "com.webApplication.webApp.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
