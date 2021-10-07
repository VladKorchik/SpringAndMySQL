package ru.netology.SpringAndMySQL.service;

import ru.netology.SpringAndMySQL.repository.Repository;

public class GetService {
    Repository repository;

    public GetService(Repository repository) {
        this.repository = repository;
    }

    public String  getProductByUserName (String name) {
        String result = repository.getProductName(name);

        return result;
    }

}
