import controllers.AutoTager;
import controllers.Expense;
import controllers.Rule;
import controllers.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaggingTest {


    List<Tag> tag = null;

    List<Expense> ex = null;
    AutoTager autot = null;

    static final double CENT = 0.001;

    @Before
    public void init() {

        Tag maistas = new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));

        Tag butinosIslaidos = new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));

        autot = new AutoTager(maistas, butinosIslaidos);
        ex = new ArrayList<>();
        ex.add(new Expense("2019/12/22", "UAB maxima", 29.2));
        ex.add(new Expense("2019/12/23", "UAB norfa", 2.2));
        tag = new ArrayList<>();
        tag.add(maistas);
        tag.add(butinosIslaidos);

    }

    @Test
    public void successTest() {
        Assert.assertEquals(31.4, autot.expensesByTags(ex, tag), CENT);
    }

    @Test
    public void failWhenTagIsEmptyTest() {

        ex = new ArrayList<>();
        ex.add(new Expense("2019/12/22", "UAB maxima", 29.2));
        ex.add(new Expense("2019/12/23", "UAB norfa", 2.2));

        Tag maistas = new Tag("Maistas");
        Tag butinosIslaidos = new Tag("ButinosIslaidos");
        tag = new ArrayList<>();
        tag.add(maistas);
        tag.add(butinosIslaidos);


        Assert.assertEquals(0.0, autot.expensesByTags(ex, tag), CENT);

    }

    @Test
    public void successWhenTagFirstLetterIsCapTest() {

        ex = new ArrayList<>();
        ex.add(new Expense("2019/12/22", "Maxima", 29.2));
        ex.add(new Expense("2019/12/23", "Norfa", 2.2));

        Tag maistas = new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));

        Tag butinosIslaidos = new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));

        tag = new ArrayList<>();
        tag.add(maistas);
        tag.add(butinosIslaidos);

        Assert.assertEquals(31.4, autot.expensesByTags(ex, tag), CENT);


    }
    }


