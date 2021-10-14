package Dto;

public class Person {
private String Name;
private int Age;
private String Address;
private String ID;
public Person() {
	super();
}
public Person(String name, int age, String address, String iD) {
	super();
	Name = name;
	Age = age;
	Address = address;
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}

}
