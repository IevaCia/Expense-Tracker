import controllers.AutoTager;
import controllers.DataStorage;
import controllers.Factory.ExpenseFactory;
import controllers.Factory.TagFactory;
import controllers.Rule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TaggingTest {



    AutoTager autot = null;

    static final double CENT = 0.001;

    @Before
    public void init() {

        TagFactory.createInstance("Maistas", new Rule("maxima", false, true), new Rule("norfa", false, true));

        TagFactory.createInstance("ButinosIslaidos", new Rule("maxima", false, true), new Rule("norfa", false, true));

        autot = new AutoTager(DataStorage.getTags());

//        ExpenseFactory.createInstance("2019/12/22", "UAB maxima", 29.2);
//        ExpenseFactory.createInstance("2019/12/23", "UAB norfa", 2.2);

    }

    @Test
    public void successTest() {
        Assert.assertEquals(31.4, autot.expensesByTags(DataStorage.getExpenses(), DataStorage.getTags()), CENT);
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
//        Assert.assertEquals(31.4, autot.expensesByTags(DataStorage.getExpenses(),DataStorage.getTags()),CENT);
//
//
//    }
    }


