package org.Aston.DAO;

import org.Aston.Entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    void save(Vacancy vacancy);
    void delete(Vacancy vacancy);
    Vacancy getVacancyById(int id);
    Vacancy getVacancyByName(String Name);
    List<Vacancy> getAll();
}
