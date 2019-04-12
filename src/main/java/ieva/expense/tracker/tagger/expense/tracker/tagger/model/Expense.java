package ieva.expense.tracker.tagger.expense.tracker.tagger.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expense {

    private String timeStamp;
    private String data;
    private double sum;
    private List<String> tagNames = new ArrayList<>();

    public Expense(String timeStamp, String data, double sum) {
        this.timeStamp = timeStamp;
        this.data = data;
        this.sum = sum;

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getData() {
        return data;
    }

    public double getSum() {
        return sum;
    }

    public List<String> getTagNames() {
        return tagNames;
    }

    public boolean containsIgnoreCaseOneOrMore(List<String> tagNames) {

        for (String tagEx : this.tagNames) {
            for (String tagUser : tagNames) {
                if (tagEx.equalsIgnoreCase(tagUser)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsIgnoreCaseOneOrMore(String... tagNames) {
        return containsIgnoreCaseOneOrMore(Arrays.asList(tagNames));
    }

}
