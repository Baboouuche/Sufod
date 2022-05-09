package sufod.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sufod.repository.AttaqueRepository;
import sufod.repository.EquipementRepository;
import sufod.repository.PersonnageRespository;

@Service
public class PersonnageService {
	@Autowired
	private PersonnageRespository personnageRespository;
	@Autowired
	private EquipementRepository equipementRepository;
	@Autowired
	private EquipementService equipementService;
	@Autowired
	private AttaqueService attaqueService;
	@Autowired
	private AttaqueRepository attaqueRepository;

}
