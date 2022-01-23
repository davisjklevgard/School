package edu.cvtc;

import edu.cvtc.model.Person;
import edu.cvtc.utility.WorkbookUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        final String INPUT_FILE = "src/main/webapp/assets/JavaWebProgramming.xlsx";

        File inputFile = new File(INPUT_FILE);
        try {
            List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            for (Person person: people){
                if (person.getFavoriteColor().equals("Green")) {
                    System.out.println(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
