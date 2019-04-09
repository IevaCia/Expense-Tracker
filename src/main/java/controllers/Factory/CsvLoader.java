package controllers.Factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//perskaito csv faila

public class CsvLoader {

    private Scanner scan;

    public void DataLoader(String directory) {

        boolean found = false;
        int count = 0;
        int counter = 0;
        try {
            scan = new Scanner(new File("/Applications/Java Kursai/JavaProjektas/Expense-Tracker/src/main/java/controllers/Factory/failas.csv"));
            scan.useDelimiter(",");


            while (scan.hasNext()) {

                String timeStamp = "";
                String data = "";
                String sum = "";

                if (count >= 27) {
                    counter++;
                }

                if (counter == 4) {
                    timeStamp = scan.next();
                    found = true;

                }
                if (counter == 5) {
                    data = scan.next();
                    found = true;

                }
                if (counter == 7) {
                    sum = scan.next();
                    found = true;
                }
                if (counter == 13) {
                    counter = 0;
                  //  ExpenseFactory.createInstance(timeStamp,data, sum);
                }
                count++;
                if (!found) {
                    scan.next();
                }
                found = false;
            }
        } catch (Exception e) {
            String str = "nerasta";
        }
    }

}




