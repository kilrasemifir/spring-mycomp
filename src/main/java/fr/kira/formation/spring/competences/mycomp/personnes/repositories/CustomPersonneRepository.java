package fr.kira.formation.spring.competences.mycomp.personnes.repositories;

public interface CustomPersonneRepository {

    public void deleteCompetenceByCompetenceId(String idPersonne, String idCompetence);
}
