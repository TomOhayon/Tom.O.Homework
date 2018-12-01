package student;

public class Student {
//---properties---
	private int grade;
	private int age;
	private String name;

//---set+get---
	public int getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setGrade(int grade) {
		if (!(grade > 100 || grade < 0)) {
			this.grade = grade;
		} else {
			System.out.println("unimpropriate grade");
		}
	}

	public void setAge(int age) {
		if (!(age > 100 || age < 0)) {
			this.age = age;
		} else {
			System.out.println("unimpropriate grade");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	//---cotr---

	public Student(int grade, int age, String name) {
		super();
		this.grade = grade;
		this.age = age;
		this.name = name;
	}

//---func---
	public String toString() {
		return "name:"+getName()+","+"grade:"+getGrade()+","+"age:"+getAge();
	}
	
}



