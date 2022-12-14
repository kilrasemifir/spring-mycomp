package fr.kira.formation.spring.competences.mycomp.personnes;

import fr.kira.formation.spring.competences.mycomp.personnes.dto.PersonneMinimalDTO;

import java.util.List;

public interface PersonneService {

    public List<PersonneMinimalDTO> findAll(int page, int size);

    Personne save(Personne entity);

    Personne findById(String id);

    void deleteById(String id);


}
