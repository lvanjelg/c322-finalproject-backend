package edu.iu.lvanjelg.c322finalprojectbackend.repository;

import edu.iu.lvanjelg.c322finalprojectbackend.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowersRepository
        extends CrudRepository<Flower, Integer> {
}
