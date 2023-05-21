package com.geekster.springDeploy;

import com.geekster.springDeploy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
