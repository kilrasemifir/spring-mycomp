package fr.kira.formation.spring.competences.mycomp.personnes;

import fr.kira.formation.spring.competences.mycomp.personnes.dto.PersonneMinimalDTO;

import java.util.List;

public interface PersonneService {
    List<PersonneMinimalDTO> findAll();

    Personne save(Personne entity);

    Personne findById(String id);

    void deleteById(String id);
}
