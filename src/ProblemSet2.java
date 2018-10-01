import java.util.Scanner;
public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name");
		String text1 = in.nextLine();
		System.out.println();
		System.out.print("Please enter your last name");
		String text2 = in.nextLine();
		System.out.println();
		String text = ("Hello, " + text1 + " " + text2 + "!");
		System.out.println(text);
	
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 homework scores, 3 quiz scores, 3 test scores");
		
		double hw1 = in.nextDouble();
		double hw2 = in.nextDouble();
		double hw3 = in.nextDouble();
		double quiz1 = in.nextDouble();
		double quiz2 = in.nextDouble();
		double quiz3 = in.nextDouble();
		double test1 = in.nextDouble();
		double test2 = in.nextDouble();
		double test3 = in.nextDouble();
		
		double hwavg = (hw1 + hw2 + hw3) / 3;
		double quizavg = (quiz1 + quiz2 + quiz3) / 3;
		double testavg = (test1 + test2 + test3) / 3;
		double hwweight = hwavg * 0.15;
		double quizweight = quizavg * 0.3;
		double testweight = testavg * 0.55;
		double grade = hwweight + quizweight + testweight;
		System.out.println("Your overall grade is " + grade);
		
	}
	
	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.print("How many students are there?");
		int students = in.nextInt();
		System.out.print("How many teachers are there?");
		int teachers = in.nextInt();
		int total = students + teachers;
		
		int count = 0;
		int bus;
		int newbus;
		if(total%47 != 0) {
			bus = total / 47;
			count = count + 1;
			newbus = total % 47;
		}
		else {
			count = total / 47;
			newbus = 47;
		}
		System.out.println("The total number of buses is " + count + " buses"); 
		if (count == 1) {
			System.out.println("The total number of people on the bus is " + newbus);
		}
		else {
			System.out.println("The total number on each bus is 47, execpt the last bus which has " + newbus);
		}
		
	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name");
		String fname = in.nextLine();
		System.out.println();
		System.out.print("Please enter your last name");
		String lname = in.nextLine();
		System.out.println();
		System.out.print("Please enter your current grade level");
		int grade = in.nextInt();
		System.out.println();
		System.out.print("Please enter your age");
		int age = in.nextInt();
		System.out.println();
		System.out.print("Please enter the name of your hometown");
		String clear = in.nextLine();
		String town = in.nextLine();
		System.out.println();
		
		System.out.println("NAME     : " + fname + lname);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + town);
	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name");
		String fname = in.nextLine();
		System.out.println();
		System.out.print("Please enter your middle name");
		String mname = in.nextLine();
		System.out.println();
		System.out.print("Please enter your last name");
		String lname = in.nextLine();
		System.out.println();
		
		char f = fname.charAt(0);
		char m = mname.charAt(0);
		char l = lname.charAt(0);
		
		System.out.println("Your initials are " + f + m + l);
	}
}