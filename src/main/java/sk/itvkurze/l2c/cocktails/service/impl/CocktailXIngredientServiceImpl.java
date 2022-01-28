package sk.itvkurze.l2c.cocktails.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.itvkurze.l2c.cocktails.model.TCocktailXIngredient;
import sk.itvkurze.l2c.cocktails.repository.ICocktailXIngredientRepository;
import sk.itvkurze.l2c.cocktails.service.ICocktailXIngredientService;

@Service
public class CocktailXIngredientServiceImpl implements ICocktailXIngredientService {

	@Autowired
	ICocktailXIngredientRepository cocktailXIngredientRepository;
	
	@Override
	public List<TCocktailXIngredient> findAllCocktailsByIngredientIds(List<Long> ingredientIds) {
		
		return cocktailXIngredientRepository.findAll().stream()
				.filter(record -> ingredientIds.contains(record.getIngredient().getIngredientId())).distinct()
				.collect(Collectors.toList());
	}

}
