package fr.kira.formation.spring.competences.mycomp.personnes;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.kira.formation.spring.competences.mycomp.personnes.repositories.PersonneRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonneConfiguration {


    @Bean
    public PersonneService personneService(PersonneRepository personneRepository, ObjectMapper objectMapper) {
        return new PersonneServiceImpl(personneRepository, objectMapper);
    }
}
