package fr.kira.formation.spring.competences.mycomp.competences;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competences")
@CrossOrigin
public class CompetenceController {

    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping("")
    public List<Competence> findAll() {
        return competenceService.findAll();
    }

    @PostMapping("")
    public Competence save(@RequestBody Competence entity) {
        return competenceService.save(entity);
    }

    @GetMapping("{id}")
    public Competence findById(@PathVariable String id) {
        return competenceService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        competenceService.deleteById(id);
    }
}
