package butana.shopdale.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;

	private String name;
	private String type;
	private Float price;

}
