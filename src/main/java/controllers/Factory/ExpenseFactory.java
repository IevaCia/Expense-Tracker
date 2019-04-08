package controllers.Factory;

import controllers.AutoTager;
import controllers.DataStorage;

public class ExpenseFactory {

    public static void createInstance(String timeStamp, String data, double sum) {
        // sukurti expensa
        //prideti jam taggus
        // returninti expensa


        Expense ex = new Expense(timeStamp, data, sum);

        ex.setTagList(new AutoTager().tagging(ex.getData()));

        DataStorage.addExpense(ex);
    }

}
