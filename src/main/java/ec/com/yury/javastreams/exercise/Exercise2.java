package ec.com.yury.javastreams.exercise;

import java.io.IOException;
import java.time.Duration;

public class Exercise2 {

    public static void main (String []args) throws IOException {

        //NO SECUENTIAL DATA FLUX!!!!!

        //Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        //Print all numbers in the ReactiveSources.intNumbersFlux stream
        System.out.println("Print all numbers in the ReactiveSources.intNumbersFlux stream");
        ReactiveSources.intNumberFlux().subscribe(System.out::println);

        //Print all users in the ReactiveSources.userFlux stream
        System.out.println("Print all users in the ReactiveSources.userFlux stream");
        ReactiveSources.userFlux().subscribe(e -> {
            System.out.println(e.userName);
        });

       System.out.println("Press a key to end");
       System.in.read();

    }

}
