package sk.itvkurze.l2c.cocktails.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_cocktails", schema = "co")
public class TCocktail implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_cocktails_seq")
	@SequenceGenerator(name = "t_cocktails_seq", sequenceName = "co.t_cocktails_cocktail_id_seq", allocationSize = 1, initialValue = 0)
	@Column(name = "cocktail_id", nullable = false)
	private Long cocktailId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "url", nullable = false)
	private String url;
	
	
	
}


