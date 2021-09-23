package fr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Avionnage;

public interface IAvionnageDaoJpaRepository extends JpaRepository<Avionnage, Integer>{

}
