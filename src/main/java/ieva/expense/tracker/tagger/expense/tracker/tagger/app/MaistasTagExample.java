package ieva.expense.tracker.tagger.expense.tracker.tagger.app;

import ieva.expense.tracker.tagger.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Rule;
import ieva.expense.tracker.tagger.expense.tracker.tagger.parsers.ParserType;

import java.util.List;


public class MaistasTagExample {

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


