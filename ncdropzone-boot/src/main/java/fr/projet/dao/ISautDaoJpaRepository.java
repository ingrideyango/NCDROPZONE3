package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Saut;

public interface ISautDaoJpaRepository extends JpaRepository<Saut,Integer> {
    
}
