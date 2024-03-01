package com.example.customerorm.service;

import com.example.customerorm.model.Customers;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
@Service
public class CustomerService implements ICustomerService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Customers> findAll() {
        return null;
    }

    @Override
    public void save(Customers customer) {

    }

    @Override
    public Customers findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

}
