package fr.kira.formation.spring.competences.mycomp.personnes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.kira.formation.spring.competences.mycomp.personnes.dto.PersonneMinimalDTO;
import fr.kira.formation.spring.competences.mycomp.personnes.repositories.PersonneRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class PersonneServiceImpl implements PersonneService {

    private final PersonneRepository personneRepository;
    private final ObjectMapper objectMapper;

    public PersonneServiceImpl(PersonneRepository personneRepository, ObjectMapper objectMapper) {
        this.personneRepository = personneRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<PersonneMinimalDTO> findAll(int page, int size) {
        List<Personne> listePersonnes = personneRepository.findAll(PageRequest.of(page, size)).toList();
        return objectMapper.convertValue(
                listePersonnes,
                new TypeReference<List<PersonneMinimalDTO>>() {}
        );
    }

    @Override
    public Personne save(Personne entity) {
        return personneRepository.save(entity);
    }

    @Override
    public Personne findById(String id) {
        return personneRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        personneRepository.deleteById(id);
    }
}
