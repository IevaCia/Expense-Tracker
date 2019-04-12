package ieva.expense.tracker.tagger.expense.tracker.tagger;

import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.expense.tracker.utils.EqUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AutoTager {

    private List<Tag> tags = new ArrayList<>();

    public AutoTager(List<Tag> tags) {
        this.tags.addAll(tags);
    }

    public AutoTager(Tag... tags) {
        addTags(tags);
    }

    public void addTags(Tag... tags) {
        this.tags.addAll(new ArrayList<>(Arrays.asList(tags)));
    }

    public List<Tag> taggingOne(String data) {// pagal paduota data metodas patikrina ar atitinka data rulsus

        List<Tag> newTags = new ArrayList<>();

        for (Tag tag : tags) {
            if (tag.pass(data)) {
                newTags.add(tag); // add to aplied tags list
            }
        }

        return newTags; // new list of passed tags
    }

    public void taggingAll(List<Expense> expenses) {
        for (Expense exp : expenses) {

            List<Tag> tags = taggingOne(exp.getData());

            for (Tag tag : tags) {
                exp.getTagNames().add(tag.getPavadinimas());
            }

        }
    }

    public double amountByTags(List<Expense> exp, List<String> tagNames) {
        double suma = 0;
        for (Expense ex : exp) {
            if (ex.containsIgnoreCaseOneOrMore(tagNames)) {
                suma += ex.getSum();
            }
        }
        return suma;
    }

    public double amountByTags(List<Expense> exp, String... tagNames) {
        return amountByTags(exp, Arrays.asList(tagNames));
    }

    public List<Expense> expensesByTags(List<Expense> exp, String... tagName) {

        List<Expense> newExpenses = new ArrayList<>();
        for (Expense ex : exp) {
            if (ex.containsIgnoreCaseOneOrMore(tagName)) {
                newExpenses.add(ex);
            }
        }
        return newExpenses;
    }

}
