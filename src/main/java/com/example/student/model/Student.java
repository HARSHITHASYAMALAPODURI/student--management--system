package com.example.student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank
    private String name;

    @Min(5)
    @Max(100)
    private int age;

    @NotBlank
    private String studentClass;

    @Email
    private String email;

    @NotBlank
    private String address;

    // Getters and Setters
}
