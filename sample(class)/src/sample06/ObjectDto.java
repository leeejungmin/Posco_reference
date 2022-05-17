package sample06;

import java.util.Arrays;

// Data Transfer Object == DTO -> 데이터 저장 단위
// Value Object == VO 
public class ObjectDto {
	
	private String name;
	private int age;
	private String fluits[];
	
	public ObjectDto() {
	}

	public ObjectDto(String name, int age, String[] fluits) {
		super();
		this.name = name;
		this.age = age;
		this.fluits = fluits;
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

	public String[] getFluits() {
		return fluits;
	}

	public void setFluits(String[] fluits) {
		this.fluits = fluits;
	}

	@Override
	public String toString() {
		return "ObjectDto [name=" + name + ", age=" + age + ", fluits=" + Arrays.toString(fluits) + "]";
	}
}
