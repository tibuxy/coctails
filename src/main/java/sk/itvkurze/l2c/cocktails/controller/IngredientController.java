package sk.itvkurze.l2c.cocktails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import sk.itvkurze.l2c.cocktails.model.IngredientsFormModel;
import sk.itvkurze.l2c.cocktails.repository.IIngredientRepository;

@Controller
public class IngredientController {
	
	@Autowired
	private IIngredientRepository ingredientRepository;
	
	@GetMapping("/ingredients") // local url: http://localhost:PORT/Cocktails/ingredients
	public String getIngredients(Model model) {

		model.addAttribute("ingredients", ingredientRepository.findAll());	// tu sa pracuje s chybajucim suborom ingredients.html
		model.addAttribute("ingredientsFormModel", new IngredientsFormModel());
		
		return "ingredients";  // return ingredients.html from /templates
	}
	
	@PostMapping("/result")
	public String result(@ModelAttribute IngredientsFormModel formModel, Model model) {
		Long[] ingredientIds = formModel.getIngredientIds();
		return "result"; // return result.html from /templates
	}
}
