import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        ArrayList<Double> empty = new ArrayList<>();
        assert testAverage(empty) == 0.0 : "getSum (empty): Failed!";

        ArrayList<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(3.0);
        list.add(5.0);
        assert testAverage(list) == 5.0 : "Filled list: Failed!";

        System.out.println("All tests passed!");
    }
    
    public static double testAverage(ArrayList<Double> list) {
        if (list.size() == 0) return 0;

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum / list.size();
    }
}
