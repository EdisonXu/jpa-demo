package com.jpa.demo.oneToMany;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by edison
 * On 2018/3/27 14:08
 */
@Entity
@NamedEntityGraphs({
		@NamedEntityGraph(
				name = "phones.all",
				attributeNodes = @NamedAttributeNode("phones"))
})
public class Person {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id")
	private Set<Telephone> phones;

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

	public Set<Telephone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Telephone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phones=" + phones +
				'}';
	}
}
