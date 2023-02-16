package ru.geekbrains.spring1.lesson3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.spring1.lesson3.repositories.ProductRepository;


@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public String getProducts(Model model){
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
