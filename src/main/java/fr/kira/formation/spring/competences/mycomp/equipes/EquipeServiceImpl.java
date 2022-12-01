package fr.kira.formation.spring.competences.mycomp.equipes;

import fr.kira.formation.spring.competences.mycomp.personnes.Personne;
import fr.kira.formation.spring.competences.mycomp.personnes.PersonneService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class EquipeServiceImpl implements EquipeService {

    private final EquipeRepository equipeRepository;
    private final PersonneService personneService;

    public EquipeServiceImpl(EquipeRepository equipeRepository, PersonneService personneService) {
        this.equipeRepository = equipeRepository;
        this.personneService = personneService;
    }

    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }

    public Equipe save(Equipe entity) {
        for(Personne membre: entity.getMembres()) {
            if (membre.getId() == null){
                this.personneService.save(membre);
            }
        }
        return equipeRepository.save(entity);
    }

    public Equipe findById(String id) {
        return equipeRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deleteById(String id) {
        equipeRepository.deleteById(id);
    }

    @Override
    public Equipe ajoutMembre(String idEquipe, String idMembre) {
        Equipe equipe = this.findById(idEquipe);
        Personne membre = this.personneService.findById(idMembre);

        if(equipe.getMembres().stream().noneMatch(equipeMembre -> equipeMembre.getId().equals(idMembre))){
            equipe.getMembres().add(membre);
        }
        // <=>
//        boolean isMembre = false;
//        for(Personne equipeMembre: equipe.getMembres()){
//            if (equipeMembre.getId().equals(idMembre)){
//                isMembre = true;
//                break;
//            }
//        }
//        if (!isMembre) equipe.getMembres().add(membre);

        return this.save(equipe);
    }
}

