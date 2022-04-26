import java.util.Scanner;
class Demo3{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your ID"+" \nEnter your Name"+"\nEnter your Age"+"\nEnter your salary"+"\nEnter your designation");
int id=sc.nextInt();
String name=sc.nextLine();
int age=sc.nextInt();
int salary=sc.nextInt();
String desig=sc.nextLine();
System.out.println(id +"\n"+name +"\n"+ age +"\n"+ salary+"\n"+desig);



//id name age salary designation

}
}