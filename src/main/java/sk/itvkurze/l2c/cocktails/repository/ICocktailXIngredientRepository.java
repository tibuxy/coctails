package sk.itvkurze.l2c.cocktails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sk.itvkurze.l2c.cocktails.model.TCocktailXIngredient;

public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long> {

	@Query("SELECT ci FROM TCocktailXIngredient ci WHERE ci.id.cocktailId = :cocktailId")
	public List<TCocktailXIngredient> findIngredientsByCocktailId(@Param("cocktailId") Long cocktailId);
}
