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

import fr.projet.dao.ITandemDaoJpaRepository;
import fr.projet.model.Tandem;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tandem")
public class TandemApiController {
	
	@Autowired
	private ITandemDaoJpaRepository daoTandem;

	@GetMapping
	@JsonView(Views.Tandem.class)
	public List<Tandem> findAll(){
		return this.daoTandem.findAll();
	}
	
	@PostMapping
	public boolean ajouter(@RequestBody Tandem tandem){
		try{
			this.daoTandem.save(tandem);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable int id){
		try{
			this.daoTandem.deleteById(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	@PutMapping("/{id}")
	public boolean edit(@PathVariable int id, @RequestBody Tandem tandem){
		try {
			tandem.setId(id);
			this.daoTandem.save(tandem);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	
}
