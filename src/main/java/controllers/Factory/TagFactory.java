package controllers.Factory;

import controllers.DataStorage;
import controllers.Rule;


public class TagFactory {


    public static void createInstance(String pavadinimas, Rule... rules) {
        // sukurti taga
        //prideti jam taggus
        // returninti taga

        for (Tag t : DataStorage.getTags()) {

            if (t.getPavadinimas().equals(pavadinimas)) {
               t.setRules(rules);
               return;
            }

        }
        DataStorage.addTag(new Tag(pavadinimas, rules));
    }
}
