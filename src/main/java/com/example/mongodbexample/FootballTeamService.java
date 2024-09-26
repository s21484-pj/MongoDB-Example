package com.example.mongodbexample;

import lombok.AllArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class FootballTeamService {

    private final FootballTeamRepository footballTeamRepository;

    public List<FootballTeam> getAllFootballTeams() {
        return footballTeamRepository.findAll();
    }

    public FootballTeam getFootballTeamByName(String name) {
        return footballTeamRepository.findByName(name).orElse(null);
    }

    public FootballTeam addFootballTeam() {
        Faker faker = new Faker();
        FootballTeam footballTeam = new FootballTeam();
        footballTeam.setName(faker.football().teams());
        footballTeam.setCoach(new Coach(faker.football().coaches()));
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            players.add(new Player(faker.football().players()));
        }
        footballTeam.setPlayers(players);
        System.out.println(footballTeam);
        return footballTeamRepository.save(footballTeam);
    }
}
