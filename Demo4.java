class A{
int x=100;
A(){
}
public void finalize()
{
System.out.println("I ma  playing");
}
}
class Demo4{
public static void main(String args[]){
A a=new A();
System.out.println(a.x);
a=null;
System.gc();

}
}