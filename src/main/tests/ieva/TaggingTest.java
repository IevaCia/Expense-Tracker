package ieva;

import ieva.expense.tracker.tagger.AutoTager;
import ieva.expense.tracker.tagger.storage.DataStorageFactory;
import ieva.expense.tracker.tagger.model.Rule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TaggingTest {



    AutoTager autot = null;

    static final double CENT = 0.001;

//    @Before
//    public void init() {
//
//        TagFactory.createInstance("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));
//
//        TagFactory.createInstance("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));
//
//        autot = new AutoTager(DataStorageFactory.getTags());
//
//        ExpenseFactory.createInstance("2019/12/22", "UAB maxima", 29.2);
//        ExpenseFactory.createInstance("2019/12/23", "UAB norfa", 2.2);
//
//    }
//
//    @Test
//    public void successTest() {
//        Assert.assertEquals(31.4, autot.expensesByTags(DataStorageFactory.getExpenses(), DataStorageFactory.getTags()), CENT);
//    }

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


