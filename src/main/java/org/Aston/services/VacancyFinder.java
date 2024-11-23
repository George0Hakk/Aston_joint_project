package org.Aston.services;

import org.Aston.Entity.Vacancy;

import java.util.List;

public interface VacancyFinder {
    List<Vacancy> get10ByVacancyName(String jobTitle);
    List<Vacancy> get5ByVacancyName(String jobTitle);
    List<Vacancy> get10ByVacancyNameAndSalary(String jobTitle, String salary);
    List<Vacancy> get5ByVacancyNameAndSalary();
}
