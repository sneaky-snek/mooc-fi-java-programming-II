

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LiteracyComparison {

    /* File literacy.csv, included with the exercise template, includes the literacy estimates for women and men over 15
     years of age. Each line in the file literacy.csv is as follows: "theme, age group, gender, country, year, literacy
     percent. Below are the first five lines as an example. Create a program that first reads the file literacy.csv and
     then prints the contents from the lowest to the highest ranked on the literacy rate. The output must be exactly as
     in the following example. The example shows the first five of the expected rows.*/
    /* Adult literacy rate, population 15+ years, female (%),Niger,2015,11.01572 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Estimate> estimates = new ArrayList<>();
        List<String[]> rows = new ArrayList<>();

        try {
            estimates = Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(",", 6))
                    .map(Estimate::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println(e);
        }

        estimates.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
