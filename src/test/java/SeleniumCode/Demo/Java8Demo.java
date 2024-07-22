package SeleniumCode.Demo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Java8Demo {

    @Test
    public void removespecialchar() {

        String str = "t.,/r}-y";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }

    @Test
    public void oddeven() {

        List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);

        List<Integer> evennumbers =numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println(evennumbers);
    }

    @Test
    public void flatmap() {

        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        // Using Stream flatMap(Function mapper)
        listOfLists.stream().flatMap(list -> list.stream()).forEach(System.out::println);
    }

    @Test
    public void flatmap2()
    {
        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
    }

    @Test
    public void charcount()
    {
        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        list.stream()
                .flatMap(str -> Stream.of(str.charAt(2)))
                .forEach(System.out::println);
    }
}
