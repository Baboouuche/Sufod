package sufod.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sufod.entity.Equipement;
import sufod.entity.Monstre;
import sufod.exception.MonstreException;
import sufod.repository.AttaqueRepository;
import sufod.repository.EquipementRepository;
import sufod.repository.MonstreRepository;

@Service
public class MonstreService {

	@Autowired
	private MonstreRepository monstreRepository;
	@Autowired
	private AttaqueRepository attaqueRepository;
	@Autowired
	private AttaqueService attaqueService;
	@Autowired
	private EquipementRepository equipementRepository;

	@Autowired
	private EquipementService equipementService;
	
	public List<Monstre> getAll(){
		return monstreRepository.findAll();
	}

	/*----------- findByID -----------*/
	public Monstre getById(Integer id) {
		return monstreRepository.findById(id).orElseThrow(MonstreException::new);
	}

	/*----------- Create -----------*/
	public void create(Monstre monstre) {
		if (monstre.getNom() == null || monstre.getNom().isEmpty()) {
			throw new MonstreException();
		}
		monstreRepository.save(monstre);
	}

	/*----------- Update -----------*/
	public Monstre update(Monstre monstre) {
		Monstre monstreEnBase = getById(monstre.getId());
		monstreEnBase.setNom(monstre.getNom());
		monstreEnBase.setAttaqueMonstre(monstre.getAttaqueMonstre());
		return monstreRepository.save(monstreEnBase);
	}

	/*----------- delete -----------*/
	public void delete(Monstre monstre) {
		monstreRepository.delete(monstre);

	}

	/*----------- deleteByID -----------*/
	public void deleteById(Integer id) {
		Monstre monstre = new Monstre();
		monstre.setId(id);
		delete(monstre);
	}

	public Monstre updateAttributMonstre(Monstre monstre) {
		Monstre monstreEnBase = getById(monstre.getId());
		equipementRepository.findAllMonstre(monstreEnBase).forEach(equipement -> {
		monstreEnBase.setAttDistance(monstre.getAttDistance() + equipement.getAttDistance());
		monstreEnBase.setAttMagique(monstre.getAttMagique() +equipement.getAttMagique());
		monstreEnBase.setAttPhysique(monstre.getAttPhysique() + equipement.getAttPhysique());
		monstreEnBase.setDefDistance(monstre.getDefDistance() + equipement.getDefDistance());
		monstreEnBase.setDefMagique(monstre.getDefMagique() + equipement.getDefMagique());
		monstreEnBase.setDefPhysique(monstre.getDefPhysique() + equipement.getDefPhysique());
		monstreEnBase.setEsquive(monstre.getEsquive() + equipement.getEsquive());
		monstreEnBase.setPv(monstre.getPv() + equipement.getPv());
		monstreEnBase.setPm(monstre.getPm() + equipement.getPMequipement());
		monstreEnBase.setPm(monstre.getPa() + equipement.getPAequipement());
		});

	return monstreRepository.save(monstreEnBase);
}

}
