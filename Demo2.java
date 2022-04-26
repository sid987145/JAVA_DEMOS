class A{
A(){
System.out.println("Constructor calling");
}
String abc(){
return "String Return";
}
}

class Demo2{
public static void main(String args[]){
System.out.println("Demo2");
A a =new A();
System.out.println(a.abc());
a.abc();
}
}