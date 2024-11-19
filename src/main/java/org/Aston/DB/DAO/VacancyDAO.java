package org.Aston.DB.DAO;

import org.Aston.DB.Entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    public void save();
    public void delete();
    public Vacancy getVacancyById(int id);
    public List<Vacancy> getAll();


}
