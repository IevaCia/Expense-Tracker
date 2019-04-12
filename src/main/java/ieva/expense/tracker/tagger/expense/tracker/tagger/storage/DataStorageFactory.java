package ieva.expense.tracker.tagger.expense.tracker.tagger.storage;

public class DataStorageFactory {

    private static DataStorage ds;

    public static DataStorage getInstance() {

        if (ds == null) {

            ds = new FakeStorage();

        }
        return ds;
    }


}