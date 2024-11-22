package org.Aston.DAO;

import org.Aston.Entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    public void save(Vacancy vacancy);
    public void delete(Vacancy vacancy);
    public Vacancy getVacancyById(int id);
    public Vacancy getVacancyByName(String Name);
    public List<Vacancy> getAll();
}
