package ec.com.yury.javastreams.exercise;

import java.io.IOException;
import java.time.Duration;

public class Exercise6 {
    public static void main(String [] args) throws IOException {
        //TODO ReactiveSources.intNumberMono();


        //Get the value from the mono into a String variable but give up after 5 seconds
        String foo = ReactiveSources.unresponsiveMono().block(Duration.ofSeconds(5));
        System.out.println("Value from unresponsive mono: "+foo);
        //Get tjh




        System.out.println("Press Any Key to end");
        System.in.read();

    }
}
