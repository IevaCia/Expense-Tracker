package ieva.expense.tracker.tagger;

import ieva.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.utils.EqUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AutoTager {

    private List<Tag> tags  = new ArrayList<>();

    public AutoTager(List<Tag> tags) {
        this.tags.addAll(tags);
    }


    public AutoTager(Tag... tags) {
        addTags(tags);
    }

    public void addTags(Tag... tags) {
        this.tags.addAll(new ArrayList<>(Arrays.asList(tags)));
    }

    public List<Tag> tagging(String data) {//pagal paduota data metodas patikrina ar atitinka data rulsus

        List<Tag> newTags = new ArrayList<>();

        for (Tag tag : tags) {
            if (tag.pass(data)) {
                newTags.add(tag); // add to aplied tags list
            }
        }

        return newTags; // new list of passed tags
    }

    public void expensesTagging(List<Expense> expenses){
        for (Expense exp:expenses) {
          exp.setTagList( tagging(exp.getData()));
        }
    }

    public double amountByTags(List<Expense> exp, List<Tag> tags) {

        double suma = 0;

        for (Expense ex : exp) {

            if (ex.getTagList().containsAll(tags)) {
                suma += ex.getSum();
            }

        }

        return suma;
    }

    public List<Expense> expensesByTags(List<Expense> exp, String tagName) {

        List<Expense> newExpenses = new ArrayList<>();

        for (Expense ex : exp) {

            for (Tag tag: ex.getTagList()) {
                if (EqUtils.eqIgnCase(tag.getPavadinimas(),tagName)) {
                    newExpenses.add(ex);
                }
            }
        }

        return newExpenses;
    }



}

