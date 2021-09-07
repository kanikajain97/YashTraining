package demo;


class Student{
	int rollNo;
	String studentFirstName;
	String studentLastName;
	int studentAge;
	
	public Student(int rollNo, String studentFirstName, String studentLastName, int studentAge) {
		super();
		this.rollNo = rollNo;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
	}
	@Override
	public int hashCode() {
		return rollNo;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		return rollNo==s.rollNo;
	}
	@Override
	public String toString() {
		return rollNo+" "+studentFirstName+" "+studentLastName+" "+studentAge;
	}
	
		
}
public class Overirde {
	public static void main(String[] args)
	{
		Student s1= new Student(1,"kanika","jain",24);
		Student s2= new Student(2,"palak","jain",24);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1.equals(s2));
	}

}
