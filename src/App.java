import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> arithmeticalProgression = ProgressionGenerator.generateArithmeticalProgression(5);

        List<Integer> nonArithmeticalProgression = ProgressionGenerator.generateNonArithmeticalProgression(4);

        System.out.println(ArithmeticalProgressionTester.isArithmetical(nonArithmeticalProgression));

    }
}
