package sufod.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sufod.entity.Equipement;
import sufod.entity.Ingredient;
import sufod.entity.Item;
import sufod.exception.EquipementException;
import sufod.exception.IngredientException;
import sufod.repository.EquipementRepository;

@Service
public class EquipementService extends ItemService {

	@Autowired
	private EquipementRepository equipementRepo;

	@Override
	public List<Item> getAll() {
		return super.getAll();
	}

	@Override
	public Item getById(Long id) {
		return super.getById(id);
	}

	@Override
	public Item create(Item item) {
		return super.create(item);
	}

	@Override
	public void delete(Long id) {
		super.delete(id);
	}

}
