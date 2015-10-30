
import java.util.Scanner;

class Person {
	private String name;
	private int age;

	public void setName (String newName){
		name = newName;
	}
	public void setAge (int newAge){
			age = newAge;
		
	}
	public void setPerson(String newName, int newAge){
		setName (newName);
		setAge (newAge);
	}
	public String getName(){
		return name;

	}
	public int getAge(){
		return age;
	}
	public boolean older (Person other){
		return age > other.age;
	}
	public boolean younger (Person other){
		return age == other.age;
	}
	public boolean equalname (Person other){
		return name == other.name;
	}
	public boolean equalage (Person other){
		return age ==  other.age;
	}
}
