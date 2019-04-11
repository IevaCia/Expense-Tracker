package ieva.expense.tracker.tagger.storage;

import ieva.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.model.Expense;

import java.util.List;

public interface DataStorage {


    List<Expense> readExpenses();

    void saveExpenses(List<Expense> listEx);


}
