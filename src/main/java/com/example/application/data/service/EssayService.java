package com.example.application.data.service;

import com.example.application.data.entity.Essay;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EssayService {

    private EssayRepository repository;

    public EssayService(@Autowired EssayRepository repository) {
        this.repository = repository;
    }

    public Optional<Essay> get(Integer id) {
        return repository.findById(id);
    }

    public Essay update(Essay entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Page<Essay> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
