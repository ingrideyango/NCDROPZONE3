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

import fr.projet.dao.IPiloteDaoJpaRepository;
import fr.projet.model.Pilote;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/pilote")
public class PiloteApiController {
    @Autowired
    private IPiloteDaoJpaRepository daoPilote;

    @GetMapping
    public List<Pilote> findAll() {
        return daoPilote.findAll();
    }

    @PostMapping
    public boolean add(@RequestBody Pilote pilote) {
        try {
            daoPilote.save(pilote);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @RequestBody Pilote pilote) {
        try {
            pilote.setId(id);
            daoPilote.save(pilote);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        try {
            daoPilote.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}