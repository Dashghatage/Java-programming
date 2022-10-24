package DynamicInput;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the option");
		System.out.println("1.Insert Values \n2.Fetch Values \n3.Upadate Values \n4.Remove Values");
		boolean flag=true;
		
		while(flag){
			switch (scanner.nextInt()) {
			case 1: {
				Student student = new Student();
				System.out.println("Enter USN");
				student.setUsn(scanner.next());
				System.out.println("Enter name");
				student.setName(scanner.next());
				System.out.println("Enter Phone Number");
				student.setPhonenumber(scanner.nextLong());
				System.out.println("Enter Address");
				student.setAddress(scanner.next());
				entityTransaction.begin();
				entityManager.persist(student);
				entityTransaction.commit();

			}
				break;
			case 2: {
				System.out.println("Enter Usn");
				Student student = entityManager.find(Student.class, scanner.next());
				if (student != null) {
					System.out.println(student);
				} else {
					System.out.println("No Data");
				}
			}
				break;
			case 3: {
				System.out.println("Enter USN");
				Student student = entityManager.find(Student.class, scanner.next());
				if (student != null) {
					student.setAddress(scanner.next());
					entityTransaction.begin();
					entityManager.merge(student);
					entityTransaction.commit();
				} else {
					System.out.println("No Data");
					
				}
			}
				break;
			case 4: {
				System.out.println("Enter USN");
				Student student = entityManager.find(Student.class, scanner.next());
				if (student != null) {
					entityTransaction.begin();
					entityManager.remove(student);
					entityTransaction.commit();
				} else {
					System.out.println("No Data");
				}
			}
				break;
				default :
					flag=false;
					System.out.println("Invalid Option");
			}
		}
	}
}