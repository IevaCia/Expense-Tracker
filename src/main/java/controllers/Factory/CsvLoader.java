package controllers.Factory;

import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


//perskaito csv faila

public class CsvLoader {


    public List<Expense> load() {
        List<Expense> ex = new ArrayList<>();
        File f = new File("/Applications/Java Kursai/JavaProjektas/Expense-Tracker/src/main/java/controllers/Factory/failas.csv");
        try {
            List<String> lines = FileUtils.readLines(f, java.nio.charset.StandardCharsets.UTF_8);

            lines.remove(0);
            lines.remove(0);
            lines.remove(lines.size() - 1);
            lines.remove(lines.size() - 1);
            lines.remove(lines.size() - 1);

            for (String line : lines) {

                String[] colums = line.split("\",");

                for (int i = 0; i < colums.length; i++) {

                    if (colums[i] != null && !colums[i].isEmpty()) {
                        colums[i] = colums[i].substring(1);
                    }

                }
                ExpenseFactory ef = new ExpenseFactory();
                ex.add(ef.createInstance(colums[2], colums[3], Double.parseDouble(colums[5])));

            }
            return ex;
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        return ex;
    }
}

