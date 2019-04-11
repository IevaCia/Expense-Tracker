package ieva.expense.tracker.tagger.storage;

import ieva.expense.tracker.tagger.storage.DataStorage;

public class DataStorageFactory {

    private static DataStorage ds;

    public static DataStorage getInstance() {

        if (ds == null) {

            ds = new FakeStorage();

        }
        return ds;
    }


}