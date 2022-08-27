package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Aman on 23/08/2022.
 */
public class Main {
	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1,"Lizzy",500);
		Teacher mellisa = new Teacher(2,"Mellisa",700);
		Teacher vanderhorn = new Teacher(3,"Vanderhorn",1000);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student tamasha = new Student(1,"Tamasha",4);
		Student rakshith = new Student(2,"Rakshith",12);
		Student rabbi = new Student(3,"Rabbi",5);

		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);


		School ghs =new School(teacherList,studentList);

		//Teacher megan=new Teacher(6,"Megan",900);
	    //ghs.addTeacher(megan);

		tamasha.payfees(5000);
        rakshith.payfees(6000);
		System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

		System.out.println("----- MAKING SCHOOL PAY SALARY ------");

		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GPG has spent for salary to "+ lizzy.getName()
		+" and now has $" +ghs.getTotalMoneyEarned());

		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GPG has spent for salary to "+ vanderhorn.getName()
		+" and now has $" +ghs.getTotalMoneyEarned());

		System.out.println( rakshith);

		mellisa.receiveSalary(mellisa.getSalary());
		System.out.println(mellisa);


		//System.out.println("Rakshith remaining fees is "+ rakshith.getRemainingfees());
		//System.out.println("Tamasha remaining fees is "+ tamasha.getRemainingfees());
		//System.out.println("Rabbi remaining fees is "+ rabbi.getRemainingfees());
		//System.out.println(tamasha);
		//megan.receiveSalary(megan.getSalary());
		//System.out.println("GHS has spent for salary to "+megan.getName()
		//+" and now has $" +ghs.getTotalMoneyEarned());
	}
}
