package praoject2;

import java.util.Scanner;
public class TestPro {

	public static void main(String[] args) {
		
		Person p = new Person();
		Scanner in = new Scanner(System.in);
		boolean b=true;
		int n=1;
    System.out.print("IF YOU WANT TO FILL THIS FORM ENTER YES ");
     String s = in.next();
     if(s.contains("Yes")||s.contains("yes")||s.contains("YES")) {
    	 while(n==1) {
    		System.out.print("Enter your name,plz : ");
    		p.setName(in.next()); 
    		if(p.getName()!=null)
    			p.getName();
    		else {
    			System.err.println("Sorry,Not Valid...Try Again");
    			b=false;
    			break;
    		}
    		System.out.print("Enter your age,plz betwen 20 and 40 : ");
    		p.setAge(in.nextInt());
    		if(p.getAge()!=-1)
    			p.getAge();
    		else {
    			System.err.println("Sorry,Not Valid...Try Again");
    			b=false;
    			break;
    			
    		}
    		System.out.print("Enter your phone number 010 012 015 only : ");
    		p.setPhoneNumber(in.next());
    		if(p.getPhoneNumber()!=null)
    			p.getPhoneNumber();
    		else {
    			System.err.println("Sorry,Not Valid...Try Again");
    			b=false;
    			break;
    			
    		}
    		 System.out.print("Enter your email: ");
    	     p.setEmail(in.next());
    	     if(p.getEmail()!=null)
     			p.getEmail();
     		else {
     			System.err.println("Sorry,Not Valid...Try Again");
     			b=false;
     			break;	
     		}
    	   System.out.print("Enter your brith day month year: ");
    	  p.setBirth(in.nextInt(), in.nextInt(), in.nextInt());
    	  if(p.getBirth()!=null)
   			p.getBirth();
   		else {
   			System.err.println("Sorry,Not Valid...Try Again");
   			b=false;
   			break;
   				
   		}
    	 
    		n--;
    	 }
    	 if(b) {
    		 p.getData();
    	 }
     }
//         p.setEmail("shhh4858@yahoo.com");
//		System.out.println(p.getEmail()); 
		
     
	}

}












  



