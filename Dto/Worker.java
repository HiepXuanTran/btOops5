package Dto;

import java.util.Scanner;

public class Worker extends Person {
	private String Position;
	private int NumberProduct;
	public Worker(String position, int numberProduct) {
		super();
		Position = position;
		NumberProduct = numberProduct;
	}
	public Worker(String name, int age, String address, String iD, String position, int numberProduct) {
		super(name, age, address, iD);
		Position = position;
		NumberProduct = numberProduct;
	}
	public Worker() {
		super();
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getNumberProduct() {
		return NumberProduct;
	}
	public void setNumberProduct(int numberProduct) {
		NumberProduct = numberProduct;
	}
	public void nhap(Scanner sc) {
		sc.nextLine();
		System.out.println("Nhap ID: ");
		this.setID(sc.nextLine());
		System.out.println("Nhap ten: ");
		this.setName(sc.nextLine());
		do {
		System.out.println("Nhap tuoi: ");
		this.setAge(sc.nextInt());
		if(this.getAge()<=0) {
			System.out.println("Nhap lai tuoi: ");
		}
		}while(this.getAge()<=0);
		System.out.println("Nhap address");
		this.setAddress(sc.nextLine());
		sc.nextLine();
		System.out.println("Nhap Position: ");
		this.setPosition(sc.nextLine());
		do {
		System.out.println("Nhap NumberProduct");
		this.setNumberProduct(sc.nextInt());
		if(this.getNumberProduct()<=0) {
			System.out.println("Nhap lai NumberProduct: ");
		}
		}while(this.getNumberProduct()<=0);
	}
	public void xuat() {
		System.out.println("ID : "+this.getID());
		System.out.println("Name : "+this.getName());
		System.out.println("Tuoi : "+this.getAge());
		System.out.println("Address : "+this.getAddress());
		System.out.println("Position : "+this.getPosition());
		System.out.println("NumberProduct: "+this.getNumberProduct());	
		}
	public int Money() {
		return NumberProduct*120;
	}

}
