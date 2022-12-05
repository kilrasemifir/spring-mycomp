package fr.kira.formation.spring.competences.mycomp.personnes.repositories;

import fr.kira.formation.spring.competences.mycomp.personnes.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonneRepository extends MongoRepository<Personne, String>, CustomPersonneRepository {
}
