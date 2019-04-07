package controllers;

import java.util.ArrayList;
import java.util.List;

public class MaistasTagExample {

    public static void main(String[] args) {

        Tag maistas = new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true));

        Tag butinosIslaidos = new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
                new Rule("stotele", false, true), new Rule("transportas", false, true));

        Tag saldainiai = new Tag("Saldainiai", new Rule("maxima", false, true));
        Tag darzoves = new Tag("Darzoves", new Rule("norfa", false, true));

        AutoTager autot = new AutoTager(maistas, butinosIslaidos, saldainiai, darzoves);

        List<Tag> tag = new ArrayList<>();

        List<Expense> ex = new ArrayList<>();

        ex.add(new Expense("2019/12/22", "UAB Maxima", 29.2));
        ex.add(new Expense("2019/12/23", "UAB Norfa", 2.2));
//        ex.add(new Expense("2019/12/24", "UAB transportas", 12.2));
//        ex.add(new Expense("2019/12/25", "UAB maxima", 20.00));

        tag.add(maistas);
        tag.add(butinosIslaidos);


        System.out.println(autot.expensesByTags(ex, tag));

    }
}

