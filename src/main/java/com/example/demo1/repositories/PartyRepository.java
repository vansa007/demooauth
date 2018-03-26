package com.example.demo1.repositories;

import java.util.Collection;
import com.example.demo1.models.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends CrudRepository<Party, Long> {

    Collection<Party> findAll();

}
