package fr.projet.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.projet.dao.IAvionDaoJpaRepository;
import fr.projet.model.Avion;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/avion")
public class AvionApiController {
    @Autowired
    private IAvionDaoJpaRepository daoAvion;

    @GetMapping
    public List<Avion> findAll() {
        return this.daoAvion.findAll();
    }

    @PostMapping
    public boolean add(@RequestBody Avion avion) {
        try {
            this.daoAvion.save(avion);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }

    @PutMapping("/{id}")
    public boolean edit(@PathVariable int id, @RequestBody Avion avion) {
        try {
            avion.setId(id);
            this.daoAvion.save(avion);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable int id) {
        try {
            this.daoAvion.deleteById(id);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
}
