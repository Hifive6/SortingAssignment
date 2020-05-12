import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class SortingAssignment {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(100);    
        for(int i = 0; i <= 100; i++){
            Random random = new Random();
            int numbers = random.nextInt(100);
            // System.out.println(numbers);    
            randomNumbers.add(numbers);
            // Arrays.sort(randomNumbers);

        }
       //I used Collections so that I could get more Practice using them. Collections can also be use with ArrayList
       //The Collections Class operates on and return collections. Works when there is a already a specified collection.
        
       //Sort is the very first method that comes along with collections. It takes the existing Collections that Collections has taken and now will sort in Ascending order and also can sort in Descending order. Sort will only sort types of the same type and is a immuteable return. which will not change.
        System.out.println(randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);

        //Replace is a sorting method within Collections that will allow you to replaces all occurrences of the value in the list to another value, must give array, value to add, value to be replaced
        Collections.replaceAll(randomNumbers, 18, 30);
        Collections.replaceAll(randomNumbers, 0, 15);
        Collections.replaceAll(randomNumbers, 80, 100);
        System.out.println(randomNumbers);
        


    }

}