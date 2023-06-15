package week06;

public class Card {
	int value;
	String name;
	
	public Card(String name, int value) {
		this.value = value;
		this.name = name;

}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println( this.name + "-- " + this.value);
	}
}
