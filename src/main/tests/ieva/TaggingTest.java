package ieva;

import ieva.expense.tracker.tagger.AutoTager;
import ieva.expense.tracker.tagger.Tag;
import ieva.expense.tracker.tagger.app.ExpenseTracker;
import ieva.expense.tracker.tagger.model.Expense;
import ieva.expense.tracker.tagger.parsers.ParserType;
import ieva.expense.tracker.tagger.storage.DataStorageFactory;
import ieva.expense.tracker.tagger.model.Rule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TaggingTest {


//    AutoTager autot = new AutoTager();
//
//    static final double CENT = 0.001;
//
//    @Before
//    public void init() {
//
//
//        ExpenseTracker et = new ExpenseTracker();
//
//
//        et.addNewTags(new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true), new Rule("stotele", false, true)));
//        et.addNewTags(new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true),
//                new Rule("stotele", false, true), new Rule("transportas", false, true)));
//        et.addNewTags(new Tag("Saldainiai", new Rule("maxima", false, true)));
//        et.addNewTags(new Tag("Darzoves", new Rule("norfa", false, true)));
//
//        List<Expense> listEx = new ArrayList<>();
//
//        listEx.add(new Expense("2019/12/22", "UAB Maxima", 29.2));
//        listEx.add(new Expense("2019/12/22", "UAB Maxima", 29.2));
//        listEx.add(new Expense("2019/12/23", "UAB Norfa", 2.2));
//        listEx.add(new Expense("2019/12/24", "UAB transportas", 12.2));
//        listEx.add(new Expense("2019/12/25", "UAB maxima", 20.00));
//
//
//    }
//
//    @Test
//    public void successTest() {
//
//        List<Expense> listEx= new ArrayList<>();
//        ExpenseTracker et = new ExpenseTracker();
//
//        Assert.assertEquals(31.4, autot.amountByTags(listEx, ,CENT);
//    }

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

    @Before
    public void init_1() {

        Tag maistas = new Tag("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));

        Tag butinosIslaidos = new Tag("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));


        tag = new ArrayList<>();
        tag.add(maistas);
        tag.add(butinosIslaidos);

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


        Assert.assertEquals(0.0, autot.amountByTags(ex, tag), CENT);

    }


//
//    @Test
//    public void successWhenTagFirstLetterIsCapTest() {
//
//        ExpenseFactory.createInstance("2019/12/22", "Maxima", 29.2);
//        ExpenseFactory.createInstance("2019/12/23", "Norfa", 2.2);
//
//        TagFactory.createInstance("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));
//
//        TagFactory.createInstance("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));
//
//        Assert.assertEquals(31.4, autot.expensesByTags(DataStorageFactory.readExpenses(),DataStorageFactory.getTags()),CENT);
//
//
//    }
}


