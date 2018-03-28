package com.jpa.demo.manyToOne;

import javax.persistence.*;

/**
 * Created by edison
 * On 2018/3/27 19:17
 */
@Entity
public class Student {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
