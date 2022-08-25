package Person;

int year = Year.now().getValue();

public class Person {
	private String name;
	private String middleName;
	private String familyName;
	private int age;
	private int yearOfBirth;

	public Person(String name, String middleName, String familyName, int age, int yearOfBirth) {
		this.name = name;
		this.middleName = middleName;
		this.familyName = familyName;
		this.age = age;
		this.yearOfBirth = yearOfBirth;
	}
	public void yearOfBirth(int x){
		x = year - age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return familyName + " " + name + " " + middleName + ", " + age + " years old.";
	}
}
