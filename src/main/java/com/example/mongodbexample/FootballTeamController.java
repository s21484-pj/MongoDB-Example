package com.example.mongodbexample;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/team")
public class FootballTeamController {

    private final FootballTeamService footballTeamService;

    @RequestMapping()
    public List<FootballTeam> getAllTeams() {
        return footballTeamService.getAllFootballTeams();
    }

    @GetMapping("/name")
    public FootballTeam getTeam(@RequestParam String name) {
        return footballTeamService.getFootballTeamByName(name);
    }

    @PostMapping()
    public FootballTeam addTeam() {
        return footballTeamService.addFootballTeam();
    }
}
