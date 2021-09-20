package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Parachute;

public interface IParachuteDaoJpaRepository extends JpaRepository<Parachute, Integer>{
    
}
