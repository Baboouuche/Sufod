package sufod.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sufod.entity.Equipement;
import sufod.entity.EquipementKey;
import sufod.entity.Ingredient;
import sufod.entity.IngredientKey;
import sufod.entity.Item;
import sufod.exception.ItemException;
import sufod.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;

	public List<Item> getAll() {
		return itemRepo.findAll();
	}

	public Item getById(Long id) {
		return itemRepo.findById(id).orElseThrow(() -> {
			throw new ItemException("id inconnu");
		});
	}

	public Item create(Item item) {
		if (item.getLibelle() == null) {
			throw new ItemException("id auto");
		}
		return itemRepo.save(item);
	}

	public void delete(Long id) {
		Item item = getById(id);
		itemRepo.delete(item);
	}

	public Ingredient create(Ingredient ingredient) {
		if (ingredient.getId() == null) {
			throw new ItemException("id auto");
		}
		return itemRepo.save(ingredient);
	}

}
