package fr.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Tandem;

public interface ITandemDaoJpaRepository extends JpaRepository<Tandem, Integer>{

	public List<Tandem> findAllByNomContaining(String nom);
}
