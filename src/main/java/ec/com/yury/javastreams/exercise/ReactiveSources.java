package ec.com.yury.javastreams.exercise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.channels.MembershipKey;
import java.time.Duration;

public class ReactiveSources {

    public static Flux<String> stringNumbersFlux(){
        return Flux.just("one","two","three","four","five","six","seven","eight","nine","ten")
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumberFlux(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1));
    }

    public static  Flux<Integer>  intNumberFluxWithRepeat() {
        return Flux.just(1,1,2,2,3,4,5,6,6,7,8,9,10)
                .delayElements(Duration.ofSeconds(1));
    }


    public static Flux<Integer> intNumbersFluxWithException(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .map(e->{
                    if(e==5) throw new RuntimeException("An error happend in the flux");
                    return e;
                });
    }

    public static Mono<Integer> intNumberMono(){
        return Mono.just(42)
                .delayElement(Duration.ofSeconds(1));
    }

    public static Flux<User> userFlux(){
        return Flux.just(
                new User(1,"Jose","Moreano"),
                new User(2, "Yury", "Romero"),
                new User(3,"Fabricio","Llumiquinga"),
                new User(4, "Adid","Barbery"),
                new User(5,"Byron","Mena"),
                new User(6, "Nathy","Heredia"),
                new User(7, "Michael","Ortiz")
        ).delayElements(Duration.ofSeconds(1));
    }

    public static Mono<User> userMono(){
        return Mono.just(new User(1,"Jose","Moreano"))
                .delayElement(Duration.ofSeconds(1));
    }

    public static Mono<String> unresponsiveMono() {
        return Mono.just("HOLA NO RESPONDO")
                .delayElement(Duration.ofSeconds(6));
    }
}
