package fr.kira.formation.spring.competences.mycomp.equipes;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Equipe {
    @Id
    private String id;
    private String nom;
}
