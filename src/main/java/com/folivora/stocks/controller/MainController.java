package com.folivora.stocks.controller;


import com.folivora.stocks.domain.Products;
import com.folivora.stocks.reps.ProductsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private ProductsRep productsRep;



    @GetMapping("/")
    public String home (Map<String, Object> model){

        Iterable<Products> products = productsRep.findAll();
        {
            products = productsRep.findAll();
        }
        model.put("products", products);
        return "home";
    }
    @PostMapping("/")
    public String add (
                       @RequestParam (name = "addDate", defaultValue = "1900-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd")Date addDate,
                       @RequestParam String product,
                       @RequestParam Long price,
                       Map<String, Object> model
    ){

        Products products = new Products(product, addDate, price);
        productsRep.save(products);
        Iterable<Products> claims = productsRep.findAll();
        model.put("products", products);


        return "home";


    }

    @GetMapping ("/product")
    public String claims (@RequestParam (required = false, defaultValue = "") String filter, Model model){
        Iterable<Products> products = productsRep.findAll();
        if (filter !=null && !filter.isEmpty()) {
            products = productsRep.findByProductLike("%" + filter + "%");
        } else {
            products = productsRep.findAll();
        }
        model.addAttribute("products", products);
        return "product";
    }
    @GetMapping("edit/{products}")
    public String getEdit(@PathVariable Products products, Model model){


        model.addAttribute("products", products);
        return "edit";
    }
    @PostMapping("{product}")
    public String productsUpdate(
            @RequestParam (name = "addDate", defaultValue = "1900-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd")Date addDate,
            @RequestParam String product,
            @RequestParam Long price,
             @RequestParam ("id") Products products

    ){

        products.setProduct(product);
        products.setAddDate(addDate);
        products.setPrice(price);
        productsRep.save(products);

        return "redirect:/product";
    }






}
