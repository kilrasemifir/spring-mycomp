package fr.kira.formation.spring.competences.mycomp.personnes;

import fr.kira.formation.spring.competences.mycomp.personnes.dto.PersonneMinimalDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/personnes")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("")
    public List<PersonneMinimalDTO> findAll(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size
    ) {
        return personneService.findAll(page, size);
    }

    @PostMapping("")
    public Personne save(@RequestBody Personne entity) {
        return personneService.save(entity);
    }

    @GetMapping("{id}")
    public Personne findById(@PathVariable String id) {
        return personneService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        personneService.deleteById(id);
    }
}
