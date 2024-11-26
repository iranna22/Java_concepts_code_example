package problem;

class Student {
	int rollno;
	String name;
	float fee;

//both paramaters and instance variables are same,this not used
	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class Teacher{
	int age;
	String name;
	//this is used
	public Teacher(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	void displayOne() {
		System.out.println(age+" "+name);
	}
	
}
class ThisDemo {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		Teacher t1 = new Teacher(30, "Abhi");
		s1.display();
		s2.display();
		t1.displayOne();
	}
}