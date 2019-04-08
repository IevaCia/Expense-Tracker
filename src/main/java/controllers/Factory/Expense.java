package controllers.Factory;

import java.util.List;

public class Expense {

    private String timeStamp;
    private String data;
    private double sum;
    private List<Tag> tagList;


     Expense(String timeStamp, String data, double sum) {
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

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }
}

