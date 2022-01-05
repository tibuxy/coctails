CREATE database db_cocktails;

CREATE SCHEMA co;

CREATE TABLE `co`.`t_ingredients` (
  `ingredient_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ingredient_id`));
  
  CREATE TABLE `co`.`t_cocktails` (
  `cocktail_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `url` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`cocktail_id`));

  CREATE TABLE `co`.`t_cocktails_x_ingredients` (
  `cocktail_id` INT NOT NULL,
  `ingredient_id` INT NOT NULL,
  INDEX `cocktail_id_idx` (`cocktail_id` ASC) VISIBLE,
  INDEX `ingredient_id_idx` (`ingredient_id` ASC) VISIBLE,
  CONSTRAINT `cocktail_id`
    FOREIGN KEY (`cocktail_id`)
    REFERENCES `co`.`t_cocktails` (`coctail_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ingredient_id`
    FOREIGN KEY (`ingredient_id`)
    REFERENCES `co`.`t_ingredients` (`ingredient_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);