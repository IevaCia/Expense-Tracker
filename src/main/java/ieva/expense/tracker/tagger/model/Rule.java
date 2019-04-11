package ieva.expense.tracker.tagger.model;

public class Rule {

    private String ruleString;
    private boolean logicalAnd; // true - &&; false - ||
    private boolean contains; // true - contains; false NOTcontains

    public Rule(String ruleString, boolean logicalAnd, boolean contains) {
        this.ruleString = ruleString;
        this.logicalAnd = logicalAnd;
        this.contains = contains;
    }

    public String getRuleString() {
        return ruleString;
    }

    public void setRuleString(String ruleString) {
        this.ruleString = ruleString;
    }

    public boolean isLogicalAnd() {
        return logicalAnd;
    }

    public void setLogicalAnd(boolean logicalAnd) {
        this.logicalAnd = logicalAnd;
    }

    public boolean isContains() {
        return contains;
    }

    public void setContains(boolean contains) {
        this.contains = contains;
    }

}
