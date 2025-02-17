package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class FunctionalProgramming {
        public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                System.out.println("Original numbers: " + numbers);

                List<Integer> evenNumbers = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());

                System.out.println("Even numbers: " + evenNumbers);

                List<Integer> doubledNumbers = numbers.stream()
                                .map(n -> n * 2)
                                .collect(Collectors.toList());

                int sum = doubledNumbers.stream()
                                .mapToInt(n -> n)
                                .sum();

                System.out.println("Doubled numbers: " + doubledNumbers);
                System.out.println("Sum of doubled numbers: " + sum);
        }
}
