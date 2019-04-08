package controllers;

import controllers.Factory.Expense;
import controllers.Factory.ExpenseFactory;
import controllers.Factory.Tag;
import controllers.Factory.TagFactory;

import java.util.ArrayList;
import java.util.List;

public class MaistasTagExample {

    public static void main(String[] args) {

        TagFactory.createInstance("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true));

        TagFactory.createInstance("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
                new Rule("stotele", false, true), new Rule("transportas", false, true));

        TagFactory.createInstance("Saldainiai", new Rule("maxima", false, true));
        TagFactory.createInstance("Darzoves", new Rule("norfa", false, true));

        AutoTager autot = new AutoTager(DataStorage.getTags());

        ExpenseFactory.createInstance("2019/12/22", "UAB Maxima", 29.2);
        ExpenseFactory.createInstance("2019/12/23", "UAB Norfa", 2.2);
//        ex.add(new Expense("2019/12/24", "UAB transportas", 12.2));
//        ex.add(new Expense("2019/12/25", "UAB maxima", 20.00));

        System.out.println(autot.expensesByTags(DataStorage.getExpenses(), DataStorage.getTags()));

    }
}

