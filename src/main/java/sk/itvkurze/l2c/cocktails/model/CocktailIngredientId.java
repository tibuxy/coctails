package sk.itvkurze.l2c.cocktails.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CocktailIngredientId implements Serializable {

	private static final long serialVersionUID = -952995699650082188L;

	@Column(name = "cocktailId")
	private Long cocktailId;

	@Column(name = "ingredientId")
	private Long ingredientId;

	public CocktailIngredientId() {
		super();
	}
	
	public CocktailIngredientId(Long cocktailId, Long ingredientId) {
		this.cocktailId = cocktailId;
		this.ingredientId = ingredientId;
	}

	public Long getCocktailId() {
		return cocktailId;
	}

	public void setCocktailId(Long cocktailId) {
		this.cocktailId = cocktailId;
	}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}
	
}
