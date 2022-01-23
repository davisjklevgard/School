package edu.cvtc.utility;

import edu.cvtc.model.Person;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkbookUtility {

    public static List<Person> retrievePeopleFromWorkbook(File inputFile) throws IOException, InvalidFormatException {
        List<Person> people = new ArrayList<>();

        Workbook workbook = WorkbookFactory.create(inputFile);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row: sheet){
            Cell firstNameCell = row.getCell(0);
            Cell lastNameCell = row.getCell(1);
            Cell ageCell = row.getCell(2);
            Cell favoriteColorCell = row.getCell(3);

            Person person = new Person(firstNameCell.getStringCellValue(),
                    lastNameCell.getStringCellValue(),
                    (int) ageCell.getNumericCellValue(),
                    favoriteColorCell.getStringCellValue());
            people.add(person);
        }
        return people;
    }
}
