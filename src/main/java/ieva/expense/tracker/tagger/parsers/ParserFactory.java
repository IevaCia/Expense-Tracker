package ieva.expense.tracker.tagger.parsers;

public class ParserFactory {
    public static DataParser getInstance(ParserType pt, String path) {
        switch (pt) {
            case SEB:
                return new XmlLoader(path);
            case SWEDBANK:
                return new CsvLoader(path);
            default:
                throw new RuntimeException("" + pt);
        }
    }
}
