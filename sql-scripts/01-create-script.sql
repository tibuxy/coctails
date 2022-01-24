CREATE database db_cocktails;

CREATE TABLE `db_cocktails`.`t_ingredients` (
  `ingredient_id` INT NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ingredient_id`));
  
  CREATE TABLE `db_cocktails`.`t_cocktails` (
  `cocktail_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `url` VARCHAR(1000) NULL,
  PRIMARY KEY (`cocktail_id`));

  CREATE TABLE `db_cocktails`.`t_cocktails_x_ingredients` (
  `cocktail_id` INT NOT NULL,
  `ingredient_id` INT NOT NULL,
  INDEX `cocktail_id_idx` (`cocktail_id` ASC) VISIBLE,
  INDEX `ingredient_id_idx` (`ingredient_id` ASC) VISIBLE,
  CONSTRAINT `cocktail_id`
    FOREIGN KEY (`cocktail_id`)
    REFERENCES `db_cocktails`.`t_cocktails` (`cocktail_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ingredient_id`
    FOREIGN KEY (`ingredient_id`)
    REFERENCES `db_cocktails`.`t_ingredients` (`ingredient_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);