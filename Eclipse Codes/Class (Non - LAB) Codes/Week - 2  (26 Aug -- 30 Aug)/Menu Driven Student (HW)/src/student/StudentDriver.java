package student;

import java.util.Scanner;

public class StudentDriver 
{
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		int num = 1;
		boolean flag = true;
		Student store[][] = new Student[1][];
		Student students[] = new Student[num];
		int count = 0; // Entry count
		while (flag)
		{
			
			store[0] = students;
			
			
			
			
//			if (count != 0)
//			{
//				Student students[] = new Student[num];
//				store[0] = students[];
//				Student students[] = new Student[num];
//			}
			
			
			
			Student student = new Student();
			setting(student);
			
			
			
	        
			System.out.println("The Available Options are: \n1. Create Student  \n2. Display all Students  "
					+ "\n3. Delete recent Student  \n4. Delete nth Student  "
					+ "\n5. Delete First Student  \n6. Sort on the basis of ID \n\n");
			System.out.println("Choose any one Option : ");
	        int option = sc.nextInt();
	        
	        if (option == 1)
	        {
	        	
	        	
//		        Student students[] = new Student[1];
//
//		        String details[] = new String[];
		        
	        	
	        	
		        System.out.println("\n");
	        }
	        
	        else if (option == 2)
	        {
	        	
	        }
	        
	        else if (option == 3)
	        {
	        	
	        }
	        
	        else if (option == 4)
	        {
	        	
	        }
	        
	        else if (option == 5)
	        {
	        	
	        }
	        
	        else if (option == 6)
	        {
	        	System.out.println("Thank Tou for using. ");
	        	flag = false;	        	
	        }
	        
	        else
	        {
	        	System.out.println("Invalid Entry. Please enter within 1 to 6. ");
	        }
	        
	        
		}
		sc.close();
	}
	
	public static void setting(Student obj)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Details: - \n------------------\n");
        
    	boolean flag = true;
    	while (flag) 
    	{
    		
	        System.out.println("Enter student ID (of 9 digits only) : ");
	        int id = sc.nextInt();
	        boolean is_9_Digits = obj.setId(id);
	        if (is_9_Digits)
	        {
	        	flag = false;
	        }
    	}
        System.out.println("Enter student name : ");
        String name = sc.next();
        obj.setName(name);
        
        System.out.println("Enter student gender : ");
        char gender = sc.next().charAt(0);
        obj.setGender(gender);
        
        System.out.println("Enter the branch which is taken by student "
        		+ "\n(from ECE, CSE, ME, ECSE, CE, BT, EEE): ");
        String branch = sc.next();
        obj.setBranch(branch);
        
        sc.close();
		
	}
	
	
}
	        
/*
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
	        
        }
        
        
        
        for (int i = 0; i < num; i++)
        {
        	System.out.println("Student " + (i+1) + " details : \n");
        	System.out.println(details[i]);
	        System.out.println("\n\n");

        }
        
        
        sc.close();
	}
	
}

*/