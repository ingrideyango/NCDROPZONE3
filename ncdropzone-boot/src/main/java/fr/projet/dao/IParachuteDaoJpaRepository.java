package fr.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Parachute;

public interface IParachuteDaoJpaRepository extends JpaRepository<Parachute, Integer>{
    
	public List<Parachute> findAllByEstDisponible(boolean dispo);
}
