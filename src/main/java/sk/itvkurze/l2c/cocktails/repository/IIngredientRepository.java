package sk.itvkurze.l2c.cocktails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.itvkurze.l2c.cocktails.model.TIngredient;

public interface IIngredientRepository extends JpaRepository<TIngredient, Long> {

}
