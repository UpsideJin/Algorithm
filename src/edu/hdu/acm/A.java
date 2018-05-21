package edu.hdu.acm;

public class A {
    int num = 1;
    public void print(){
        System.out.println("A"+num);

    }
    public static void main(String args[]){
        B b= new B();
        A a= (A)b;
        b.print();
        a.print();
        System.out.println(a.num+" "+b.num);
    }
}
class B extends A{
    int num = 2 ;
    public void print(){
        System.out.println("B"+num);
        super.print();
    }
}
