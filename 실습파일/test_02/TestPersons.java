package test;

abstract class Person {
	String pnum;
	String name;
	int age;
	
	public String toString() {
		return pnum + ":" + name + ":" + age;
	}
	
	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}
	
	abstract void show(); // toString()를 호출하여 sysout으로 처리
	
	abstract void increase();// salary, scholarship, or dayPay를 10% 증가
}

class Employee extends Person {
	String job;
	String dept;
	int salary;
	
	
	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;	
	}
	public String toString() {
		return super.toString() +  ":" + job + ":" + dept + ":" + salary;
	}

	@Override
	void show() {
		System.out.println(toString());
	}
	@Override
	void increase() {
		salary = (int) (salary*1.1);		
	}
}

class Designer extends Employee {
	String language;
	int workYear;
	
	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language, int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}
	public String toString() {
		return super.toString() + ":" + language + ":" + workYear;
	}
}

class Student extends Person {
	String schoolName;
	int schoolyear;
	int scholarship;
	
	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}
	public String toString() {
		return super.toString() + ":" + schoolName + ":" + schoolyear + ":" + scholarship;
	}
	
	@Override
	void show() {
		System.out.println(toString());
	}
	@Override
	void increase() {
		scholarship = (int) (scholarship*1.1);
	}
}

class WorkStudent extends Student {
	String Job;
	int dayPay;	
	public WorkStudent(String pnum, String name, int age, String schoolName, 
			int schoolyear, int scholarship, String Job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.Job = Job;
		this.dayPay = dayPay;
	}
	public String toString() {
		return super.toString() + ":" + Job + ":" + dayPay;
	}
	@Override
	void show() {
		System.out.println(toString());
	}
	@Override
	void increase() {
		dayPay = (int) (dayPay*1.1);
	}
}

public class TestPersons {
	static void showAll(Person[] p) {
		for (int i=0; i<p.length; i++) {
			p[i].show(); // 동적바인딩 구현
		}
	}

	static void increaseAll(Person[] p) {
		for (int i=0; i<p.length; i++) {
			
			p[i].increase(); // 동적바인딩 구현
		}
	}
	
	static void getData(Person[] p) {
		Employee e = new Employee("e01","Hong", 10, "DB", "Design", 2000);
		Designer d = new Designer("e01","Hong", 10, "DB", "Design", 2000, "en", 2010);
		Student s = new Student("s01","gold", 15, "pnu", 2018, 400);
	    WorkStudent w = new WorkStudent("s01","gold", 15, "pnu", 2018, 400, "academy", 5000);
	    p[0] = e; p[1] = d; p[1] = d; p[2] = s; p[3] = w;
	}
	
	public static void main(String[] args) {
		Person [] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		showAll(setPerson);
	}

}

//sublcass의 생성자는 superclass의 생성자를 호출
//show()함수는 동적 바인딩이 되도록 구현, Designer 객체의 show()함수는 Employee 객체의 show()함수를 부르고 자신 객체에 대한 show()함수를 호출하도록 구현
//자바 파일은 TestPersons이며 public class TestPersons로 구현 > 하나의 파일에 모두 구현한다.
//public String toString()을 구현한다.
