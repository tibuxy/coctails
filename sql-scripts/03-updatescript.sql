UPDATE db_cocktails.t_ingredients SET name= 'orange liqueur' WHERE ingredient_id = 46;
UPDATE db_cocktails.t_ingredients SET name= 'worcester sauce' WHERE ingredient_id = 37;

DELETE FROM db_cocktails.t_cocktails_x_ingredients WHERE ingredient_id = 21 AND cocktail_id = 11;
DELETE FROM db_cocktails.t_cocktails_x_ingredients WHERE ingredient_id = 21 AND cocktail_id = 53;

DELETE FROM db_cocktails.t_ingredients WHERE ingredient_id = 21;

DELETE FROM db_cocktails.t_cocktails_x_ingredients
	WHERE cocktail_id in (SELECT t.cocktail_id FROM co.t_cocktails t WHERE t.cocktail_id NOT IN 
	(SELECT t.cocktail_id FROM (SELECT distinct on (name) name, cocktail_id FROM co.t_cocktails) t));
	
DELETE FROM db_cocktails.t_cocktails WHERE cocktail_id in (SELECT t.cocktail_id FROM co.t_cocktails t WHERE t.cocktail_id NOT IN 
	(SELECT t.cocktail_id FROM (SELECT distinct on (name) name, cocktail_id FROM co.t_cocktails) t));
