class A{

static int x=100;

static void play()
{
System.out.println("I am playing");
}
}
class Demo5{
public static void main(String args[]){
A a=new A();
System.out.println(A.x);
A.play();


}
}