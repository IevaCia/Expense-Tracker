package controllers;

import controllers.Factory.Expense;
import controllers.Factory.Tag;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AutoTager {

    private List<Tag> tags;

    public AutoTager(List<Tag> tags) {
        this.tags = tags;
    }

    public AutoTager(Tag... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
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

    public double expensesByTags(List<Expense> exp, List<Tag> tags) {

        double suma = 0;

        for (Expense ex : exp) {

            if (ex.getTagList().containsAll(tags)) {
                suma += ex.getSum();
            }

        }

        return suma;
    }

}

