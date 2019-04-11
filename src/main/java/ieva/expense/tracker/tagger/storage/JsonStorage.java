package ieva.expense.tracker.tagger.storage;

import ieva.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.parsers.DataParser;

import java.util.List;

public class JsonStorage implements DataStorage {

    @Override
    public List<Expense> readExpenses() {
        return null;
    }

    @Override
    public void saveExpenses(List<Expense> listEx) {

    }
}
