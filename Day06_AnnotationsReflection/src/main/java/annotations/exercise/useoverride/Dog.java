package annotations.exercise.useoverride;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog sound !");
    }
}
