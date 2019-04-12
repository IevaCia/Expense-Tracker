package ieva.expense.tracker.tagger.expense.tracker.tagger.app;

import ieva.expense.tracker.tagger.expense.tracker.tagger.AutoTager;
import ieva.expense.tracker.tagger.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.expense.tracker.tagger.parsers.DataParser;
import ieva.expense.tracker.tagger.expense.tracker.tagger.parsers.ParserFactory;
import ieva.expense.tracker.tagger.expense.tracker.tagger.parsers.ParserType;
import ieva.expense.tracker.tagger.expense.tracker.tagger.storage.DataStorage;
import ieva.expense.tracker.tagger.expense.tracker.tagger.storage.DataStorageFactory;

import java.util.List;

public class ExpenseTracker {


    private DataStorage ds;
    private List<Expense> expenses;
    private List<Tag> tags;
    private AutoTager at;

    public ExpenseTracker() {
        ds = DataStorageFactory.getInstance();
        expenses = ds.readExpenses();
        at = new AutoTager();
        autotagging(expenses);


    }

    private void autotagging(List<Expense> expenses) {

        at.taggingAll(expenses);
    }

    public List<Expense> showExpensesByTags(String tag) {
        return at.expensesByTags(expenses,tag);
    }

    public double amountByTags(List<Expense> ex,List<String> tags) {

        return at.amountByTags(ex,tags);
    }

//    public String showExpensesByTimeStamp(String time) {
//        return null;
//    }

    public void addNewExpenses(ParserType pt, String path) {
        DataParser dp = ParserFactory.getInstance(pt, path);

        ds.saveExpenses(dp.parse());

        autotagging(expenses);

    }

    public void addNewTags(Tag... tags) {

        at.addTags(tags);
    }
}
