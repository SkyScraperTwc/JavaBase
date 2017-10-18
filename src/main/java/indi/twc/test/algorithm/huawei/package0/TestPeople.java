package indi.twc.test.algorithm.huawei.package0;

public class TestPeople {

	public static void main(String[] args) {
		People people = new People();
		System.out.println(people.hashCode()); 
		
	}    
}

class People { 
	public String name; 
	public int age; 
	public int number; 
	 
	public void eat(){ 
		System.out.println("�Է��ˣ�");
	}
	 
	public static void staticMethod(){ 
		System.out.println("����һ����̬������");
	}
	
	public static void run(){
		System.out.println("�ܲ��ˣ�'");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String turnString(){
		return "A [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}
