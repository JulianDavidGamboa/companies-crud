package com.curso.app.companiescrud.services;

import com.curso.app.companiescrud.entities.Company;

public interface CompanyService {
    Company create(Company company);
    Company readByName(String name);
    Company update(Company company, String name);
    void delete(String name);
}
