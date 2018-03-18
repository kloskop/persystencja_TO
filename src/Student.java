
public class Student {
	
	private String name;
	private String surname;
	private String pesel;
	private long id;
	
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", surname: " + surname + ", pesel: " + pesel;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

}
