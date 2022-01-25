package sk.itvkurze.l2c.cocktails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.itvkurze.l2c.cocktails.model.TCocktailXIngredient;

public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long> {

}
