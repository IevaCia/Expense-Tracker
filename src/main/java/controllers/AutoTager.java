package controllers;

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

    public List<Tag> tagging(String data) {
//TODO
        List<Tag> newTags = new ArrayList();

        for (Tag tag : tags) {
            if (tag.pass(data)) {
                newTags.add(tag); // add to aplied tags list
            }
        }

        return newTags; // new list of passed tags
    }

    public double expensesByTags(Tag... tags) {
// as manau kad tai turetu buti atskira klase kurioje vyks skaiciavimai
        // TODO
        return 0;
    }

}

