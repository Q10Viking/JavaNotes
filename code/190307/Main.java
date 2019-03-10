import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        // create a list
        Stream<String> mystream = Stream.of("Hello","World");
        
        mystream.map(String::toUpperCase).forEach(System.out::println);
    }
}

/*output
HELLO
WORLD
*/