package y.checkfeatures;

import java.util.*;

public class MarksPrinter {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(85, 92, 76, 88, 95);

        // Print each mark using method reference
        marks.forEach(System.out::println);
        
//        equivalent to
//        for(Integer m: marks)
//        		System.out.println(m);
    }
}
