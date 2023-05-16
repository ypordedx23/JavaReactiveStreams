package ec.com.yury.javastreams.exercise;

import java.io.IOException;

public class Exercise7 {
    public static void main(String [] args) throws IOException {
        //TODO ReactiveSources.intNumberMono();
        //Print all values from intNumberFlux that ares greater than 5
        ReactiveSources.intNumberFlux()
               .filter(e -> e>5)
               .log()
               .subscribe(System.out::println);

        //Print 10 multiplied by each value from intNUmberFlux thats greater than 5
        ReactiveSources.intNumberFlux()
                        .filter(e->e>5)
                                .map(e->e*10)
                                        .subscribe(System.out::println);

        //Print multiplied by each value from intNumberFlux for the fistd 3 numbers that are greater than 5
        ReactiveSources.intNumberFlux()
                .filter(e->e>5)
                .map(e->e*10)
                .take(3)
                .subscribe(System.out::println);

        //Print each value from intNumberFlux thas greater that 20, print -1 else  not element is found
        ReactiveSources.intNumberFlux()
                        .filter(e->e>20)
                                .defaultIfEmpty(-1)
                                        .subscribe(System.out::println);


        //Switch inst from intNumberFlux to the rigth user of the userFlux
        ReactiveSources.intNumberFlux()
                        .flatMap(e->ReactiveSources.userFlux().filter(user->user.getNumber()==e))
                .subscribe(System.out::println);


        //Print on,y distinct numbres from intNumbersFluxWithRepeat
        ReactiveSources.intNumberFluxWithRepeat()
                        .distinct()
                                .subscribe(System.out::println);

        //Print from intNumbersFluxWithRepeat excluding imediantly repeating
        ReactiveSources.intNumberFluxWithRepeat()
                .distinctUntilChanged()
                .subscribe(System.out::println);


        System.out.println("Press Any Key to end");
        System.in.read();

    }
}
