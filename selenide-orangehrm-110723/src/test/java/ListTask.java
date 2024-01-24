import java.util.ArrayList;
import java.util.List;

public class ListTask {
    //1. Create List of String
    // {"String", "Toronto", "Berlin","Fghhdshfdskssdfds"}

    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        country.add("String");
        country.add("Toronto");
        country.add("Berlin");
        country.add("Fghhdshfdskssdfds");
        //2. Find the longest

        System.out.println(country);
        System.out.println(country.get(0).length());
        String maxLengthString = country.get(0);
        //3. Print that string and length of the string
        for (String element : country) {
            if (element.length() > maxLengthString.length()) {
                maxLengthString = element;
            }
        }
        System.out.println(maxLengthString + ", " + maxLengthString.length());
    }
}