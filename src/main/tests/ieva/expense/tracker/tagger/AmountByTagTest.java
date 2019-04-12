package ieva.expense.tracker.tagger;

import ieva.expense.tracker.tagger.expense.tracker.tagger.AutoTager;
import ieva.expense.tracker.tagger.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.expense.tracker.tagger.model.Rule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AmountByTagTest {


    private List<Tag> tag = null;

    private List<Expense> ex = null;
    private AutoTager autot = null;

    private static final double CENT = 0.001;

    @Before
    public void init() {

        ex = new ArrayList<>();
        ex.add(new Expense("2019/12/22", "UAB maxima", 29.2));
        ex.add(new Expense("2019/12/23", "UAB norfa", 2.2));
        tag = new ArrayList<>();
        tag.add(new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true)));
        tag.add(new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true)));
        autot = new AutoTager(tag);
        autot.taggingAll(ex);


    }

    @Test
    public void successTest() {

        Assert.assertEquals(31.4, autot.amountByTags(ex, tag), CENT);
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

        autot.taggingAll(ex);


        Assert.assertEquals(0.0, autot.amountByTags(ex, tag), CENT);

    }

}


