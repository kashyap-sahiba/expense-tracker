package com.shruti.expensetracker.service;

import com.shruti.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    void save(Expense expense);
}
