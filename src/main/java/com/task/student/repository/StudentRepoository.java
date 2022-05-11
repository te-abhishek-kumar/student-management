package com.task.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.student.entity.Student;
@Repository
public interface StudentRepoository extends JpaRepository<Student, Long> {

}
