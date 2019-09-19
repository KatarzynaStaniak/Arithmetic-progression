import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgressionGenerator {

    public static List<Integer> generateArithmeticalProgression(int numberOfElements) {
        List<Integer> arithmeticProgression = new ArrayList<>();

        if (numberOfElements > 0) {
            Random randomGenerator = new Random();
            int q = randomGenerator.nextInt(10);
            int currentValue = randomGenerator.nextInt(10);
            System.out.println("Arithmetical Progression delta = " + q + ", number of elements = " + numberOfElements);
            System.out.println("Initial value = " + currentValue);

            arithmeticProgression.add(currentValue);

            for (int i = 0; i < numberOfElements - 1; i++) {

                currentValue = currentValue + q;
                arithmeticProgression.add(currentValue);
            }
        } else {
            System.out.println("Number of elements = " + numberOfElements + " !!!!!!!!!!!!");
        }
        printProgression(arithmeticProgression);
        return arithmeticProgression;
    }


    public static List<Integer> generateNonArithmeticalProgression(int numberOfElements) {
        List<Integer> progression = new ArrayList<>();

        if (numberOfElements > 0) {
            Random randomGenerator = new Random();
            int q = randomGenerator.nextInt(10);
            int currentValue = randomGenerator.nextInt(10);
            System.out.println("Nonarithmetical Progression: Number of elements = " + numberOfElements);
            System.out.println("Initial value = " + currentValue);

            progression.add(currentValue);

            for (int i = 0; i < numberOfElements - 1; i++) {

                currentValue = currentValue + q + i;
                progression.add(currentValue);
            }
        } else {
            System.out.println("Number of elements = " + numberOfElements + " !!!!!!!!!!!!");
        }

        printProgression(progression);
        return progression;
    }

    public static void printProgression(List<Integer> progression) {

//        System.out.println("progression list size =  " + progression.size());

        for (int i = 0; i < progression.size(); i++) {

            System.out.print(progression.get(i) + (i + 1 == progression.size() ? "\n" : ","));

        }

        System.out.println();
    }
}
