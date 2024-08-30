package students;

import java.util.Scanner;

public class StudentDriver 
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in); 
        System.out.println("How many student's details you want to enter : ");
        int num = sc.nextInt();
        
        Student students[] = new Student[num];
        
        String details[] = new String[num];
        
        System.out.println("\n");
		
        for(int i = 0; i < num; i++)
        {
        	students[i] = new Student();
        	
        	System.out.println("Enter Student " + (i+1) + " Details: - \n------------------\n");
	        
        	boolean flag = true;
        	while (flag) 
        	{
        		
		        System.out.println("Enter student ID (of 9 digits only) : ");
		        int id = sc.nextInt();
		        boolean is_9_Digits = students[i].setId(id);
		        if (is_9_Digits)
		        {
		        	flag = false;
		        }
        	}
	        System.out.println("Enter student name : ");
	        String name = sc.next();
	        students[i].setName(name);
	        
	        System.out.println("Enter student gender : ");
	        char gender = sc.next().charAt(0);
	        students[i].setGender(gender);
	        
	        System.out.println("Enter the branch which is taken by student "
	        		+ "\n(from ECE, CSE, ME, ECSE, CE, BT, EEE): ");
	        String branch = sc.next();
	        students[i].setBranch(branch);
	        
	        
	        
	        details[i] = students[i].toString();
	        
	        System.out.println("\n\n");
	        
	        
        }
        
        sc.close();
        
        for (int i = 0; i < num; i++)
        {
        	System.out.println("Student " + (i+1) + " details : \n");
        	System.out.println(details[i]);
	        System.out.println("\n\n");

        }

	}
}