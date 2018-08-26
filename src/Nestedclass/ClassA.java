package Nestedclass;

public class ClassA {
    ClassB cb = new ClassB();

    public void myTv(){
        System.out.println(" I am watching TV");
    }

   public class ClassB{
       public void myPc(){
           System.out.println(" I am plaing Game");
       }
   }
}
