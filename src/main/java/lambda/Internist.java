package lambda;

public class Internist implements Hospital{
    @Override
    public void treat() {
        System.out.println("Internista zaczyna leczyc");
    }
}
