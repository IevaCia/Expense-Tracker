package controllers;
import java.util.List;

public class MaistasTagExample {

        public static void main(String[] args) {

            Tag maistas = new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true));

            Tag butinosIslaidos = new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
                    new Rule("stotele", false, true), new Rule("transportas", false, true));

            Tag saldainiai = new Tag("Saldainiai", new Rule("maxima", false, true));
            Tag darzoves = new Tag("Darzoves", new Rule("norfa", false, true));

            AutoTager autot = new AutoTager(maistas, butinosIslaidos, saldainiai, darzoves);

            List<Tag> result = autot.tagging("UAB norfa");

        }
    }

