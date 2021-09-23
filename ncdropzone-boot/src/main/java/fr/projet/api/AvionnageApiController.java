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

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.dao.IAvionnageDaoJpaRepository;
import fr.projet.model.Avionnage;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/avionnage")
public class AvionnageApiController {

	@Autowired
	private IAvionnageDaoJpaRepository daoAvionnage;
	
	@GetMapping
	@JsonView(Views.Avionnage.class)
	public List<Avionnage> findAll(){
		return this.daoAvionnage.findAll();
	}
	
	@PostMapping
	public boolean add(@RequestBody Avionnage avionnage){
		try{
			this.daoAvionnage.save(avionnage);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	@PutMapping("/{id}")
    public boolean edit(@PathVariable int id, @RequestBody Avionnage avionnage) {
        try {
            avionnage.setId(id);
            this.daoAvionnage.save(avionnage);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable int id) {
        try {
            this.daoAvionnage.deleteById(id);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
}
