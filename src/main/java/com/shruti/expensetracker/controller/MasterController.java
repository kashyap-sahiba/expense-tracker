package com.shruti.expensetracker.controller;

import com.shruti.expensetracker.model.Expense;
import com.shruti.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MasterController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "List of expenses");
        List<Expense> expenses = expenseService.findAll();
        mav.addObject("expenses", expenses);
        return mav;
    }

    @RequestMapping("/expense")
    public ModelAndView addExpense() {
        ModelAndView mav = new ModelAndView("expense");
        mav.addObject("expense", new Expense());
        return mav;
    }

    @RequestMapping(value = "/expense", method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expense expense) {
        expenseService.save(expense);
        return "redirect:/";
    }

}
