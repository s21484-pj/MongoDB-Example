package com.example.mongodbexample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@ToString
public class FootballTeam {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    private Coach coach;

    private List<Player> players;
}
