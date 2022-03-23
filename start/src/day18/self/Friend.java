package day18.self;

import java.io.Serializable;

public class Friend implements Serializable {
	
	private String name, mail;
	private int age;
	private double height;
	private boolean rh;

	public Friend() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isRh() {
		return rh;
	}

	public void setRh(boolean rh) {
		this.rh = rh;
	}


}
