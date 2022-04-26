import java.util.Scanner;
class Employe{
    static void Clerk(){
        	Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		System.out.println("Id-->"+id);
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Salary-->"+ 20000);
		System.out.println("Desig-->"+"Clerk");
    }
    static void Tester(){
        	Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		System.out.println("Id-->"+id);
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Salary-->"+ 30000);
		System.out.println("Desig-->"+"Tester");
    }
    static void Developer(){
        	Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		System.out.println("Id-->"+id);
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Salary-->"+ 40000);
		System.out.println("Desig-->"+"Developer");
    }
    static void Manager(){
        	Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		System.out.println("Id-->"+id);
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Salary-->"+ 50000);
		System.out.println("Desig-->"+"Manager");
    }
}
public class Main1
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1--> Clerk"+"\n2-->Tester"+"\n3-->Developer"+"\n4-->Manager"+"\n5-->Exit" );
		int choice=sc.nextInt();
		while(choice!=5){
		   // System.out.println("1--> Clerk"+"\n2-->Tester"+"\n3-->Developer"+"\n4-->Manager"+"\n5-->Exit" );
		    switch(choice) {
  case 1: System.out.println("ID"+"\n-->NAME"+"\n-->Age");
Employe.Clerk();
    break;
  case 2:System.out.println("ID"+"\n-->NAME"+"\n-->Age");
Employe.Tester();
    
    break;
  case 3:System.out.println("ID"+"\n-->NAME"+"\n-->Age");
Employe.Developer();
    
    break;
  case 4:System.out.println("ID"+"\n-->NAME"+"\n-->Age");
Employe.Manager();
    
    break;
case 5:
System.exit(0);
  default:
    System.out.println("Invalid Entry");
}
		    
		}
	}
}
