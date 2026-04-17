import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        var user = List.of(new User("Larissa", 22),new User("Vitor", 27),new User("Gabriel", 29),new User("Kalel", 1),new User("Matheus", 56));

        printStringValue(Record::toString,user);
    }

    public static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}