package sk.itvkurze.l2c.cocktails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sk.itvkurze.l2c.cocktails.repository.IIngredientRepository;

@Controller
public class IngredientController {
	
	@Autowired
	private IIngredientRepository ingredientRepository;
	
	@GetMapping("/ingredients") // local url: http://localhost:PORT/Cocktails/ingredients
	public String getIngredients(Model model) {

		model.addAttribute("ingredients", ingredientRepository.findAll());	// tu sa pracuje s chybajucim suborom ingredients.html
		
		return "ingredients";  // return ingredients.html from /templates
	}
}
