package ec.com.yury.javastreams.exercise;

import java.util.stream.Stream;

public class StreamSources {
    public static Stream<String> stringNumbersStream(){
        return Stream.of("one","two","three","four","five","six","seven","eight","nine","ten");
    }

    public static Stream<Integer> intNumbersStream(){
        return Stream.iterate(0, i->i+2).limit(10);
    }

    public static Stream<User> usersStream(){
        return Stream.of(
                new User(1,"Jose","Moreano"),
                new User(2, "Yury", "Romero"),
                new User(3,"Fabricio","Llumiquinga"),
                new User(4, "Adid","Barbery"),
                new User(5,"Byron","Mena"),
                new User(6, "Nathy","Heredia"),
                new User(7, "Michael","Ortiz")
        );
    }
}
