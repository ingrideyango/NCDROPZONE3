package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Pilote;

public interface IPiloteDaoJpaRepository extends JpaRepository<Pilote,Integer> {
    
}
