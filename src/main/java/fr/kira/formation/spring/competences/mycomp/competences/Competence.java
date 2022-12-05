package fr.kira.formation.spring.competences.mycomp.competences;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class Competence {
    private String id;
    private String nom;
    private String description;

    public Competence(String id) {
        this.id = id;
    }
}
