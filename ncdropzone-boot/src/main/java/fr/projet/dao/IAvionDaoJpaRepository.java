package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Avion;

public interface IAvionDaoJpaRepository extends JpaRepository <Avion, Integer>  {
    
}
