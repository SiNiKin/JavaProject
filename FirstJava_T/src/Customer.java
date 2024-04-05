
public class Customer {
	
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	
	public Customer() {	 }
	
	
	public Customer(String name, String gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
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


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		

	}

}
