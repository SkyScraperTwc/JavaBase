package indi.twc.test.algorithm.huawei.package1;

import java.util.HashSet;
import java.util.Set;

public class Class {
	private int id;
	
	private  Set<Person> set = new HashSet<Person>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Person> getSet() {
		return set;
	}

	public void setSet(Set<Person> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", set=" + set + "]";
	}

	
}
