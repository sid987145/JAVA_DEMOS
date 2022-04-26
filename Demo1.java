class A{
A()
{
System.out.println("A");
}
}
class B{
B()
{
System.out.println("B");
}
}

class Demo1{
public static void main(String args[]){
System.out.println("Hello Java");
A a=new A();
B b=new B();
}
}