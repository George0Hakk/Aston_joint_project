package org.Aston.DAO;

import org.Aston.Entity.Vacancy;
import org.hibernate.Session;
import org.Aston.Hibernate.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class VacancyDAOImpl implements VacancyDAO{
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Vacancy vacancy) {
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(vacancy);

        transaction.commit();
        session.close();
    }

    @Override
    public Vacancy findById(Long id) {
        Session session = sessionFactory.openSession();
        Vacancy vacancy=session.get(Vacancy.class, id);
        session.close();
        return vacancy;
    }

    @Override
    public Vacancy findByName(String Name) {
        Session session = sessionFactory.openSession();
        Vacancy vacancy=session.get(Vacancy.class, Name);
        session.close();
        return vacancy;
    }

    @Override
    public List<Vacancy> findAll() {
        Session session = sessionFactory.openSession();
        List<Vacancy> vacancies=session.createQuery("from Vacancy",Vacancy.class).list();
        session.close();
        return vacancies;
    }
}
