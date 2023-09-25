import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }

        for (String s : list){
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        list.forEach((String s) -> System.out.println(s));

        System.out.println("--------------------------------");
        list.forEach(System.out::println);
    }



}
