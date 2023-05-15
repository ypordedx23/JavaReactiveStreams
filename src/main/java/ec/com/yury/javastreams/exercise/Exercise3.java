package ec.com.yury.javastreams.exercise;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String [] args) throws IOException {
        // Use reactiveSources.intNumbersFlux()

        //Get all numbers in the ReactiveSources.intNumbersFlux stream
        //into a list and print the list and list size

        List<Integer> numbersStream = ReactiveSources.intNumberFlux().toStream().toList();
        System.out.println("List of Numbers: "+ numbersStream);
        System.out.println("Size: "+numbersStream.size());
        System.out.println("Press a key to end");
        System.in.read();
    }
}
