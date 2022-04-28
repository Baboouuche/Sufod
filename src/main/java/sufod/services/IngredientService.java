package sufod.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sufod.entity.Ingredient;
import sufod.entity.Item;
import sufod.exception.IngredientException;
import sufod.repository.IngredientRepository;

@Service
public class IngredientService extends ItemService {

	@Autowired
	private IngredientRepository ingredientRepo;

	@Override
	public Item create(Item item) {
		return super.create(item);
	}

	@Override
	public void delete(Long id) {
		super.delete(id);
	}

	@Override
	public Ingredient create(Ingredient ingredient) {
		if (ingredient.getKey() == null) {
			throw new IngredientException("id auto");
		}
		return ingredientRepo.save(ingredient);
	}

}
