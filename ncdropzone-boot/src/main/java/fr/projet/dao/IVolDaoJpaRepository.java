package fr.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.projet.model.Vol;

public interface IVolDaoJpaRepository extends JpaRepository<Vol,Integer> {
    
    public List<Vol> findAllByEtatVol(String etatVol);
}
