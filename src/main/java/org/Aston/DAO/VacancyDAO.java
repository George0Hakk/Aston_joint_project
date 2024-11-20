package org.Aston.DAO;

import org.Aston.Entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    public void save();
    public void delete();
    public Vacancy getVacancyById(int id);
    public List<Vacancy> getAll();


}
