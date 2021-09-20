package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Vol;

public interface IVolDaoJpaRepository extends JpaRepository<Vol,Integer> {
    
}
