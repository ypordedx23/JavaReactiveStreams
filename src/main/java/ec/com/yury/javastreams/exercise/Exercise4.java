package ec.com.yury.javastreams.exercise;

import java.io.IOException;

public class Exercise4 {

    public static void main(String [] args) throws IOException {
        //TODO ReactiveSources.intNumberMono();


        //Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));


        //Get the value from the mono into a integer value
        Integer value= ReactiveSources.intNumberMono().block().intValue();
        System.out.println("Returned value from mono once its blocked: "+value);
        System.out.println("Press Any Key to end");
        System.in.read();

    }
}
