import java.util.List;

public class ArithmeticalProgressionTester {

    public static boolean isArithmetical(List<Integer> progression) {
        if (progression.size() == 0) {
            System.out.println("Progression size is 0. It can't be arithmetical");
            return false;
        }

        if (progression.size() == 1) {
            System.out.println("Progression size is 1. It can't be arithmetical");
            return false;
        }

//        Integer q = null;
//        for (int i = 0; i < progression.size()-1; i++) {
//            int tempQ = progression.get(i+1) - progression.get(i);
//            if(q == null){
//                q = tempQ;
//            }else{
//                if(q != tempQ){
//                    System.out.println("It is not arithmetical progression!!!");
//                    return false;
//                }
//            }
//        }

        int q = progression.get(1) - progression.get(0);

        for (int i = 0; i < progression.size(); i++) {
            if (i + 1 < progression.size()) {
                if (q == (progression.get(i + 1) - progression.get(i))) {
                    System.out.println("it's ok");
                } else {
                    System.out.println("It is not arithmetical progression!!!");
                    return false;
                }

            }

        }
        return true;
    }
}
