package com.example.demo1.repositories;

import com.example.demo1.models.TestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<TestModel, Long> {}
