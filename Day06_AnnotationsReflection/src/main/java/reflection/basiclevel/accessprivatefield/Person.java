package reflection.basiclevel.accessprivatefield;

public class Person {
    private int age;

    public Person(int age){
        this.age=age;
    }
   public void displayAge(){
       System.out.println("Age is "+age);
   }
}
