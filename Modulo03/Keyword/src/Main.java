import static model.Client.getStaticName;
import static model.Client.setStaticName;

public class Main {
    public static void main(String[] args) {
        setStaticName("test");
        System.out.println(getStaticName());
    }
}