package controllers;

import controllers.Factory.Expense;
import controllers.Factory.Tag;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

   private static List<Tag> tags = new ArrayList<>();
   private static List<Expense> expenses = new ArrayList<>();

    public static List<Expense> getExpenses() {
        return expenses;
    }

    public static void addExpense(Expense expense) {

        expenses.add(expense);

    }

    public static void addTag(Tag tag) {

        tags.add(tag);

    }

    public static List<Tag> getTags() {
        return tags;
    }
}