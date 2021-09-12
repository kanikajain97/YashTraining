

import java.util.Scanner;

class Student {

	private int numID, year;
	private String userName, course;

	public Student(int numID, int year, String userName, String course) {

		this.numID = numID;
		this.year = year;
		this.userName = userName;
		this.course = course;

	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

public class Main {

	static Student[] stud = new Student[100];
	static int i = 0;

	public static void main(String[] args) {

		getMenu();

	}

	public static void getMenu() {
		Scanner sc = new Scanner(System.in);
		int id;
		while (true) {

			int select;
			System.out.println("1. Add Student Record");
			System.out.println("2. View Student Record");
			System.out.println("3. Update Student Record");
			System.out.println("4. Delete Student Record");
			System.out.println("0. Exit");
			select = sc.nextInt();

			switch (select) {
			case 1:
				addStud(stud);

				break;
			case 2:
				System.out.println("enter student id: ");
				id = sc.nextInt();
				viewStud(id);

				break;
			case 3:
				System.out.println("enter student id: ");
				id = sc.nextInt();
				updateStud(id);
				break;
			case 4:
				System.out.println("enter student id: ");
				id = sc.nextInt();
				deleteStud(id);
				break;
			case 0:
				return;
			default:
				System.out.println("Invalid Option");
			}
		}

	}

	public static void addStud(Student[] stud) {
		Scanner sc = new Scanner(System.in);
		int numID, year;
		String userName, course;

		int addMore;

		do {

			System.out.println("1. Enter Student ID: ");
			numID = sc.nextInt();
			sc.nextLine();
			System.out.println("2. Enter Student Name");
			userName = sc.nextLine();
			System.out.println("3. Enter Student Course");
			course = sc.nextLine();
			System.out.println("4. Enter Student Year");
			year = sc.nextInt();
			stud[i] = new Student(numID, year, userName, course);
			++i;

			System.out.println("To add another Student Record Press 1");
			addMore = sc.nextInt();
		} while (addMore == 1);

	}

	public static Student getStudentByid(int id) {
		for (Student element : stud) {
			if (element.getNumID() == id)
				return element;
		}
		return null;

	}

	public static void updateStud(int id) {

		Scanner sc = new Scanner(System.in);
		Student s = getStudentByid(id);
		if (s != null) {
			System.out.println(" Enter Student Name");
			s.setUserName(sc.nextLine());
			System.out.println(" Enter Student Course");
			s.setCourse(sc.nextLine());
			System.out.println(" Enter Student Year");
			s.setYear(sc.nextInt());
		} else
			System.out.println("Invaild Id");

	}

	public static void deleteStud(int id) {
		boolean flag = false;
		for (int i = 0; i < stud.length; i++) {
			if (stud[i].getNumID() == id) {
				stud[i] = null;
				System.out.println("Student Deleted");
				flag = true;
			}
		}
		if (!flag)
			System.out.println("Invaild Id");
	}

	public static void viewStud(int id) {
		Student element = getStudentByid(id);
		if (element != null) {
			System.out.println("1. Student ID: " + element.getNumID());
			System.out.println("2. Student Name: " + element.getUserName());
			System.out.println("3. Student Course: " + element.getCourse());
			System.out.println("4. Student Year: " + element.getYear() + "\n");
		} else
			System.out.println("Ivaild ID");
	}

}