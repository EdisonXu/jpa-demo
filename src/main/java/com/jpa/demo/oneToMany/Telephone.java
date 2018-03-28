package com.jpa.demo.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by edison
 * On 2018/3/27 14:08
 */
@Entity
public class Telephone {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String no;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Telephone{" +
				"id=" + id +
				", no='" + no + '\'' +
				'}';
	}
}
