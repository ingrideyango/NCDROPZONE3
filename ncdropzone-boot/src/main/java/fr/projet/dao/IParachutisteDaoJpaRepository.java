package fr.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Parachutiste;

public interface IParachutisteDaoJpaRepository extends JpaRepository<Parachutiste, Integer>{

	public List<Parachutiste> findAllByNomContaining(String nom);
}
