package ieva.expense.tracker.tagger.expense.tracker.tagger.parsers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;
import org.apache.commons.io.FileUtils;


public class CsvLoader implements DataParser {

    private String path;

    public CsvLoader(String path) {
        this.path = path;
    }

    @Override
    public List<Expense> parse() {
        List<Expense> ex = new ArrayList<>();
        File f = new File(path);
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
                Expense expense = new Expense(colums[2], colums[3], Double.parseDouble(colums[5]));

                ex.add(expense);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ex;
    }

}

