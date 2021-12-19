package com.example.application.data.service;

import com.example.application.data.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EssayRepository extends JpaRepository<Essay, Integer> {

}