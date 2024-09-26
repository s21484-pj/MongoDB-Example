package com.example.mongodbexample;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FootballTeamRepository extends MongoRepository<FootballTeam, String> {

    Optional<FootballTeam> findByName(String name);
}
