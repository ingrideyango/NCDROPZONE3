package fr.projet.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.projet.dao.IVolDaoJpaRepository;
import fr.projet.model.Vol;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/vol")
public class VolApiController {
    @Autowired
    private IVolDaoJpaRepository daoVol;

    @GetMapping
    public List<Vol> findAll() {
        return this.daoVol.findAll();
    }

    @PostMapping
    public boolean add(@RequestBody Vol vol) {
        try {
            this.daoVol.save(vol);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    @PutMapping("/{id}")
    public boolean edit(@PathVariable int id, @RequestBody Vol vol) {
        try  {
            vol.setId(id);
            this.daoVol.save(vol);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
