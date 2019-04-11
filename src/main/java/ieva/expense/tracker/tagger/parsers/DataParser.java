package ieva.expense.tracker.tagger.parsers;

import ieva.expense.tracker.tagger.model.Expense;

import java.util.List;

public interface DataParser {
    List<Expense> parse();
}
