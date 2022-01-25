package sk.itvkurze.l2c.cocktails.service;

import java.util.List;

import sk.itvkurze.l2c.cocktails.model.TCocktailXIngredient;

public interface ICocktailXIngredientService {
	
	public List<TCocktailXIngredient> findAllCocktailsByIngredientIds(List<Long> ingredientIds);
}
