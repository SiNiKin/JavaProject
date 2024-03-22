package obj;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -797077L;
	
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	private transient boolean isJoin;
	
	
	// 기본 생성자
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	
	// 필드 생성자
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}


	// getter, setter
	public String getName() {
		return name;
	}


	public char getGender() {
		return gender;
	}


	public String getEmail() {
		return email;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	
	public boolean isJoin() {
		return isJoin;
	}


	public void setJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}


	// toString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", genser=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
}
