# Projet compétences

## Présentation

Ce projet est un projet de fin de formation de la Wild Code School de Nantes. Il a pour but de mettre en pratique les compétences acquises par les membres d'équipes.

## Prérequis

- Java 11+
- [docker](https://docs.docker.com/get-docker/)
- [docker-compose](https://docs.docker.com/compose/install/)
- un IDE (IntelliJ, Eclipse)

## Installation

### Base de données

Pour lancer la base de données, il faut se placer dans le dossier `docker` et lancer la commande suivante :

```bash
docker-compose up -d
```

### Lancement de l'application sans IDE

Pour lancer l'application, il faut se placer dans le dossier racine et lancer la commande suivante :

```bash
./gradlew spring-boot:run
```

### Lancement de l'application avec IntelliJ

Pour laancer l'application avec un IDE, lancer la class `MycompApplication`