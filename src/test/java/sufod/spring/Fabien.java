package sufod.spring;

import sufod.entity.Equipement;
import sufod.entity.Monstre;
import sufod.services.MonstreService;

public class Fabien {
	
	public void run(String... args) {
		
		Equipement equipe1 = new Equipement();
		Equipement equipe2 = new Equipement();
		Monstre monstre1 = new Monstre();
		
		equipe1.setAttDistance(3);
		equipe2.setAttDistance(2);
		monstre1.setAttDistance(4);
		
		MonstreService monstreService = new MonstreService();
		monstreService.updateAttributMonstre(monstre1);
		System.out.println(monstre1.getAttDistance());
		
	}


}
