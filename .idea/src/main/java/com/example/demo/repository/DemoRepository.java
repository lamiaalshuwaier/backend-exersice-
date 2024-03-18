package com.example.demo.repository;

import com.example.demo.models.RandomText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<RandomText, Long> {

}