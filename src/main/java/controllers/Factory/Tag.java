package controllers.Factory;

import controllers.Rule;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Tag {

    private String pavadinimas;

    private List<Rule> rules = new ArrayList<Rule>();

     Tag(String pavadinimas, Rule... rules) {
        this.pavadinimas = pavadinimas;
        this.rules.addAll(Arrays.asList(rules));
    }

     Tag(String pavadinimas, List<Rule> rules) {
        this.pavadinimas = pavadinimas;
        this.rules.addAll(rules);
    }

    public void setRules(Rule... rules) {
        this.rules = new ArrayList<>();
            this.rules.addAll(Arrays.asList(rules));
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public boolean pass(String data) {

        for (Rule rul : rules) {


            if (rul.isContains()) {
                if (data.toLowerCase().contains(rul.getRuleString().toLowerCase())) {

                    return true;
                }
            }
            if (!rul.isContains()) {
                if (!data.toLowerCase().contains(rul.getRuleString().toLowerCase()))
                    return true;
            }
        }

        return false;

    }

}