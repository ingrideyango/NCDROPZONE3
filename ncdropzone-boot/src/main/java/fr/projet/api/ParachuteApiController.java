package fr.projet.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

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

import fr.projet.dao.IParachuteDaoJpaRepository;
import fr.projet.model.Parachute;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/parachute")
public class ParachuteApiController {
    
    @Autowired
    private IParachuteDaoJpaRepository daoParachute;

    @GetMapping
    @JsonView(Views.Parachute.class)
    public List<Parachute> findAll(){
        return this.daoParachute.findAll();
    }

    @PostMapping
    @JsonView(Views.Parachute.class)
    public boolean add(@RequestBody Parachute parachute) {
        try {
            this.daoParachute.save(parachute);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @DeleteMapping("/{id}")
    @JsonView(Views.Parachute.class)
    public boolean deleteById(@PathVariable int id) {
        try {
            this.daoParachute.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PutMapping("/{id}")
    @JsonView(Views.Parachute.class)
    public boolean edit(@PathVariable int id, @RequestBody Parachute parachute) {
        try {
            parachute.setId(id);
            this.daoParachute.save(parachute);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
