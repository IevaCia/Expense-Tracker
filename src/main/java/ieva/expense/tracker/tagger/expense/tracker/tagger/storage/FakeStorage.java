package ieva.expense.tracker.tagger.expense.tracker.tagger.storage;

import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;

import java.util.ArrayList;
import java.util.List;

public class FakeStorage implements DataStorage {

    private List<Expense> listEx = new ArrayList<>();

    {

        listEx.add(new Expense("2019/12/22", "UAB Maxima", 29.2));
        listEx.add(new Expense("2019/12/22", "UAB Maxima", 29.2));
        listEx.add(new Expense("2019/12/23", "UAB Norfa", 2.2));
        listEx.add(new Expense("2019/12/24", "UAB transportas", 12.2));
        listEx.add(new Expense("2019/12/25", "UAB maxima", 20.00));
    }

    @Override
    public List<Expense> readExpenses() {
        return listEx;
    }

    @Override
    public void saveExpenses(List<Expense> listEx) {
        this.listEx.addAll(listEx);
    }
}
