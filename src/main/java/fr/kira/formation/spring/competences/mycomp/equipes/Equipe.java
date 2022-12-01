package fr.kira.formation.spring.competences.mycomp.equipes;

import fr.kira.formation.spring.competences.mycomp.personnes.Personne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Equipe {
    @Id
    private String id;
    private String nom;
    @DBRef
    private List<Personne> membres = new ArrayList<>();
}
