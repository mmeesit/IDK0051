import student.Student;
import travel.Destination;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    String fileName = "/home/ets/Kool/JOOP/HW09/src/states.csv";

    void playWithStudentStreams() {
        List<Student> students = Arrays.asList(
                new Student("martin", 4),
                new Student("eesel", 2),
                new Student("lol", 1),
                new Student("elisabeth", 4),
                new Student("malcolm", 2)
        );

        students.stream()
                .filter(s -> s.getName().contains("e") || s.getName().contains("i"))
                //.peek(System.out::println)
                .filter(s -> s.getGrade() >= 3)
                .forEach(s -> System.out.println(s));
                // sama mis .forEach(s -> System.out::println);
    }

    void europeanUnionCountriesStream() {
        List<String> countryStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
            // countriesStream.forEach(System.out::println);
            countryStrings = bufferedReader.lines().skip(1).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        countryStrings.forEach(System.out::println);
        //List<Destination> destinations = countryStrings.stream();
    }

    void secondTest() throws IOException {
        Stream<String> destinationLines = Files.lines(Paths.get(fileName)).skip(1);
        Map<String, String> resultMap =
                destinationLines.map(destinationLine -> destinationLine.split(","))
                                .collect(Collectors.toMap(destinationLine -> destinationLine[0], destinationLine -> destinationLine[1]));

        destinationLines.close();

        System.out.println(resultMap);
    }

    void destinationStreaming() throws IOException {
        Stream<String> destinationLines = Files.lines(Paths.get(fileName)).skip(1);

        List<Destination> destinations = destinationLines.map(temp -> {
            String[] destinationValues = temp.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            Destination destination = new Destination(destinationValues[0], 0);
            destination.setCurrency(destinationValues[8]);
            destination.setCurrencyCode(destinationValues[9]);

            if (destinationValues[12] != null && !destinationValues[12].isEmpty()) {
                destination.setGdpPerCapita(Double.parseDouble(destinationValues[12]));
            } else {
                destination.setGdpPerCapita(0);
            }

            if (destinationValues[16] != null && !destinationValues[16].isEmpty()) {
                destination.setArea(Double.parseDouble(destinationValues[16]));
            } else {
                destination.setArea(0);
            }


            return destination;
        }).collect(Collectors.toList());

        DoubleSummaryStatistics gdpAllDestinations = destinations.stream()
                .collect(Collectors.summarizingDouble(Destination::getGdpPerCapita));

        destinations.forEach(d -> System.out.println(d.getGdpPerCapita()));

        System.out.println(gdpAllDestinations);

    }

    public static void main(String[] args) throws IOException{
        // new Demo().playWithStudentStreams();
        // new Demo().europeanUnionCountriesStream();
        //new Demo().secondTest();
        new Demo().destinationStreaming();


    }
}
