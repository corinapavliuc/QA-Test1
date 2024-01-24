import java.util.ArrayList;
import java.util.List;

public class ListPrime {
    //{1,5,7,13,445,76,100}
    //Average value of prime values
    //3 1 3
    //7 1 7
    //8 1 2 4 8
    public static void main(String[] args) {
        List<Integer> allValues = new ArrayList<>();
        allValues.add(1);
        allValues.add(3);
        allValues.add(445);
        allValues.add(100);
        //value % 2==0
        int sumofPrime =0;
        int quantityOfPrime =0;
        for (Integer num : allValues) {
            int d = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    d += 1;
                }
                if (d == 0) {
                   sumofPrime+=num;
                  quantityOfPrime+=1;
                }
            }
            System.out.println("sumOfPrime/quantityOfPrime");
        }
    }

}
