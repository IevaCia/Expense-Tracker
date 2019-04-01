package models;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private List<Expense> expenses;
    private List<Category> categories;
    private List<Beneficiary> beneficiaries;

    public DataStorage() {
        expenses = new ArrayList<Expense>();
        categories = new ArrayList<Category>();
        beneficiaries = new ArrayList<Beneficiary>();

    }

    public void dataSaving(String[][] data) {

        for (int i = 0; i < data.length; i++) {
            Expense exp = new Expense(data[i][0], beneficiaryLoader(data[i][1], "Unknown"), Double.parseDouble(data[i][2]));
            expenses.add(exp);
        }
    }

    /**
     * @param benText
     * @return
     */

    public Beneficiary beneficiaryLoader(String benText, String categoryName) {

        for (Beneficiary ben : beneficiaries) {
            if (ben.getName().equals(benText)) {
                return ben;
            }
        }

        Beneficiary bene = new Beneficiary(benText, categoryLoader(categoryName));
        beneficiaries.add(bene);
        return bene;
    }

    private Category categoryLoader(String categoryName) {

        for (Category categ : categories) {
            if (categ.getName().equals(categoryName)) {
                return categ;
            }
        }

        Category cat = new Category(categoryName);
        categories.add(cat);
        return cat;
    }

    public Beneficiary getUnknownCategory() {

        for (Beneficiary ben : beneficiaries) {
            if (ben.getCategory().getName().equals("Unknown")) {
                return ben;
            }
        }
        return null;
    }

    public List<String> getCategoryList() {

        List<String> categoryList = new ArrayList<>();
        for (Category cate : categories) {
            categoryList.add(cate.getName());
        }
        return categoryList;
    }
    public void changeCategory(String benText, String catName){
        Beneficiary ben = beneficiaryLoader(benText,catName);
        ben.setCategory(categoryLoader(catName));
    }
}
