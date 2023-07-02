package com.example.uploadCSVfile.repository;

import com.example.uploadCSVfile.entity.Emloyee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Emloyee,Integer> {
}
