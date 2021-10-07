package ru.netology.SpringAndMySQL.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringAndMySQL.service.GetService;

@RestController
public class GetController {
    GetService getService;

    public GetController(GetService getService) {
        this.getService = getService;
    }

    @GetMapping("products/fetch-product")
    public String getPorductsFetchProduct(@RequestParam("name") String name) {
        String productsList = getService.getProductByUserName(name);
        return productsList;
    }
}
