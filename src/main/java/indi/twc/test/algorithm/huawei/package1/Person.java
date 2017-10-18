package indi.twc.test.algorithm.huawei.package1;

import java.lang.Class;

public class Person {
	private int id;
	
	private String name;
	
	private Class cla;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getCla() {
		return cla;
	}

	public void setCla(Class cla) {
		this.cla = cla;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cla=" + cla + "]";
	}
	
}
