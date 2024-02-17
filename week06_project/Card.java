package week06_project;

public class Card {
	private int value;
	private String name;

//Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

//Getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void describe() {
		System.out.println(value + " of " + name);
	}
}
