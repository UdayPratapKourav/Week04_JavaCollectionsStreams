package annotations.beginnerlevel.markimportantmethods;

public class ImpMe {

    @ImportantMethod // Uses default level "HIGH"
    public void method1() {
        System.out.println("Executing method1");
    }

    @ImportantMethod(level = "MEDIUM") // Specifies a custom level
    public void method2() {
        System.out.println("Executing method2");
    }

    public void method3() { // Not annotated
        System.out.println("Executing method3");
    }
}
