package listhomework2;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {

    private int i;


    List<Integer> integerList = new ArrayList<>();


    public List getList() {

        for (i = 0; i < 10; i++) {
            double randomDix = Math.random() * 10 + 1;
            int randomIx = (int) randomDix;
            Integer random = randomIx;
            integerList.add(random);
        }
        return integerList;
    }

    public void getPairList() {

        for (int i = 0; i < integerList.size(); i++) {
            int number = integerList.get(i);
            if (number % 2 == 0) {
                Integer num = number;
                System.out.println("on index = " + integerList.indexOf(num) + " is number: " + integerList.get(i));
            }
        }
    }


    @Override
    public String toString() {
        return "GetInteger{" +
                "integerList=" + integerList +
                '}';
    }
}
