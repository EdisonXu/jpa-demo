package com.jpa.demo.biDirection;

import javax.persistence.*;
import java.util.List;

/**
 * Created by edison
 * On 2018/3/27 14:08
 */
@Entity
@NamedEntityGraphs({
		@NamedEntityGraph(
				name = "products.all",
				attributeNodes = @NamedAttributeNode("products"))
})
public class Store {
	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	//cannot use FetchType.EAGER here to avoid stackoverflow
	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private List<Product> products;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		products.forEach(p->p.setStore(this));
		this.products = products;
	}
}
