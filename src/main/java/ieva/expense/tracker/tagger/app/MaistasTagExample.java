package ieva.expense.tracker.tagger.app;

import ieva.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.model.Rule;
import ieva.expense.tracker.tagger.parsers.ParserType;

import java.util.List;


public class MaistasTagExample {

//    public static void main(String[] args) {
//
//        TagFactory.createInstance("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true));
//
//        TagFactory.createInstance("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
//                new Rule("stotele", false, true), new Rule("transportas", false, true));
//
//        TagFactory.createInstance("Saldainiai", new Rule("maxima", false, true));
//        TagFactory.createInstance("Darzoves", new Rule("norfa", false, true));
//
//        AutoTager autot = new AutoTager(DataStorageFactory.getTags());
//
////        ExpenseFactory.createInstance("2019/12/22", "UAB Maxima", 29.2);
////        ExpenseFactory.createInstance("2019/12/23", "UAB Norfa", 2.2);
////         ExpenseFactory.createInstance("2019/12/24", "UAB transportas", 12.2));
////         ExpenseFactory.createInstance("2019/12/25", "UAB maxima", 20.00));
//
//        System.out.println(autot.expensesByTags(DataStorageFactory.readExpenses(), DataStorageFactory.getTags()));
//
//        Loader l = new Loader();
//        l.loadingFile("/Applications/Java Kursai/JavaProjektas/Expense-Tracker/src/main/resources/failas.csv",true);
//
//
//    }

    public static void main(String[] args) {

        ExpenseTracker et = new ExpenseTracker();
        et.addNewTags(new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true)));
        et.addNewTags(new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
                new Rule("stotele", false, true), new Rule("transportas", false, true)));
        et.addNewTags(new Tag("Saldainiai", new Rule("maxima", false, true)));
        et.addNewTags(new Tag("Darzoves", new Rule("norfa", false, true)));


        et.addNewExpenses(ParserType.SWEDBANK, "/Applications/Java Kursai/JavaProjektas/Expense-Tracker/src/main/resources/failas.csv");
        et.showExpensesByTags("Maistas");


        List<Expense> expensesByTags = et.showExpensesByTags("Maistas");

        for (Expense expense : expensesByTags) {
            System.out.println(expense.getTimeStamp() + " " + expense.getData() + " " + expense.getSum() + " " + expense.getTagList().toString());
        }
    }


}


