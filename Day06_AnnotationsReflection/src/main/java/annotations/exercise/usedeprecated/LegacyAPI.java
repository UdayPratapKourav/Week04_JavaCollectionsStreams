package annotations.exercise.usedeprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("old method ");
    }

    public void newFeature(){
        System.out.println("new method ");
    }
}
