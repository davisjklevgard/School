package com.example.utility;
import com.example.model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkbookUtility {

    public static List<Movie> retrieveMoviesFromWorkbook(File inputFile) throws IOException, InvalidFormatException {
        List<Movie> movies = new ArrayList<>();

        Workbook workbook = WorkbookFactory.create(inputFile);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row: sheet){
            Cell titleCell = row.getCell(0);
            Cell directorCell = row.getCell(1);
            Cell lengthInMinutesCell = row.getCell(2);


            Movie movie = new Movie(titleCell.getStringCellValue(),
                    directorCell.getStringCellValue(),
                    (int) lengthInMinutesCell.getNumericCellValue());
            movies.add(movie);
        }
        return movies;
    }
}
