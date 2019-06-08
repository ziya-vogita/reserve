package com.example.demo.controller;

import com.example.demo.Form.BookForm;
import com.example.demo.entity.Book;
import com.example.demo.service.ItemListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/book/register")
public class BookListController {
    private final ItemListService itemListService;

    @Autowired
    public BookListController(ItemListService itemListService) {
        this.itemListService = itemListService;
    }

    @GetMapping("/init")
    public String doInit(BookForm bookForm,Model model) {
        return "bookRegister";
    }


    @RequestMapping(value = "/confirm")
    public String bookConfirm(@ModelAttribute @Validated BookForm bookForm, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "bookRegister";
        }
return "bookRegisterConfirm";
    }

}