package controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Tag {

    private String pavadinimas;

    private List<Rule> rules = new ArrayList<Rule>();

    public Tag(String pavadinimas, Rule... rules) {
        this.pavadinimas = pavadinimas;
        this.rules.addAll(Arrays.asList(rules));
    }

    public Tag(String pavadinimas, List<Rule> rules) {
        this.pavadinimas = pavadinimas;
        this.rules.addAll(rules);
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public boolean pass(String data) {

        for (Rule rul : rules) {


            if (rul.isContains()) {
                if (data.contains(rul.getRuleString())) {

                    return true;
                }
            }
            if (!rul.isContains()) {
                if (!data.contains(rul.getRuleString()))
                    return true;
            }
        }

        return false;

    }

}
