package ec.com.yury.javastreams.exercise;

public class Exercise1 {

    public static void main(String []args){

        // print all numbers in int number streams
        System.out.println("print all numbers in int number streams");
        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));
        // method reference -> StreamSources.intNumbersStream().forEach(System.out::println);

        //Print numbers from intNumbersStream that are less than 5
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        //StreamSources.intNumbersStream().forEach(e-> {
        //     if(e<5){
        //         System.out.println(e);
        //     }
        // });
        StreamSources.intNumbersStream().filter(number ->number<5).forEach(System.out::println);

        //Print the second and third num,bers in intNumberStream that are greater than 5
        System.out.println("Print the second and third num,bers in intNumberStream that are greater than 5");
        StreamSources.intNumbersStream().filter(number ->number>5).skip(1).limit(2).forEach(System.out::println);

        //Print the first number in intNumbers Stream that is greater than 5, if nothing its found print -1
        System.out.println("Print the first number in intNumbers Stream that is greater than 5, if nothing its found print -1");
        System.out.println(StreamSources.intNumbersStream().filter(number -> number>5).findFirst().orElse(-1));

        //Print first names of all user in userStream
        System.out.println("Print first names of all user in userStream");
        StreamSources.usersStream().forEach(user -> System.out.println(user.userName));
        StreamSources.usersStream().map(user->user.userName).forEach(userName -> System.out.println(userName));


        //Print first names in userStreams for users that have IDs from intNumberStreams
        System.out.println("Print first names in userStreams for users that have IDs from intNumberStreams");
        StreamSources.intNumbersStream().flatMap(id ->StreamSources.usersStream().filter(user-> user.getNumber() == id))
                .map(user -> user.getUserName())
                .forEach(System.out::println);

    }
}
