package reflection.basiclevel.dynamicallycreateobjects;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public void display(){
        System.out.println("Name : "+name+" RollNumber : "+rollNumber);
    }
}
