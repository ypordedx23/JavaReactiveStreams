package ec.com.yury.javastreams.exercise;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String []args) throws IOException {

        //Use ReactiveSources.intNumberFlux() and ReactiveSources.userMono()
        System.out.println("Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()");

        //Subscribe to a flux using the error and complete hooks
        System.out.println("Subscribe to a flux using the error and complete hooks");
        ReactiveSources.userFlux().subscribe(
                e-> System.out.println(e.userName),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completition of the flux"));


        //Subscribe to a flux using and implementation of BaseSubscriber
        System.out.println("Subscribe to a flux using and implementation of BaseSubscriber");
        ReactiveSources.intNumberFlux().subscribe(new CustomSubscriber<>());

        System.out.println("Press Any Key to end");
        System.in.read();

    }
}

class CustomSubscriber<T> extends BaseSubscriber<T>{

    public void hookOnSubscribe(Subscription subscription){
        System.out.println("Start Subscription");
        request(1);
    }

    public void hookOnNext(T value){
        System.out.println(value.toString()+" received");
        request(1);
    }



}
