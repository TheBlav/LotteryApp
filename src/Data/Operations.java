package Data;

import Inout.InOut;
import Interfaces.Printer;

import java.util.*;

public class Operations implements Printer {

    public void Operations(){
        List<Integer> lottery = generate();
        print(lottery);
        Collections.shuffle(lottery);
        print(lottery + "\n\n");
        List<Integer> userProvidedNumbers = userNumbers();
        print(userProvidedNumbers);
        checkResult(lottery,userProvidedNumbers);


    }

    private void checkResult(List<Integer> lottery, List<Integer> userProvidedNumbers) {
        int counter = 0;
        List<Integer> check = lottery.subList(0,6);
        for (int i=0; i<userProvidedNumbers.size(); i++){
            if (check.contains(userProvidedNumbers.get(i)))
                counter++;
        }
        print(counter);
    }


    private List<Integer> userNumbers() {
        InOut io = new InOut();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            print("Please provide number for lottery: ");
            list.add(io.getInt());
        }
        return list;
    }

    private List<Integer> generate() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<49; i++){
            int number = random.nextInt(49);
            list.add(number);

        }

        return list;
    }
}
