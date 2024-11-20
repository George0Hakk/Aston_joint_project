package org.Aston.DAO;

import org.Aston.Entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    void save(Vacancy vacancy);
    Vacancy findById(Long id);
    Vacancy findByName(String Name);
    List<Vacancy> findAll();
}
