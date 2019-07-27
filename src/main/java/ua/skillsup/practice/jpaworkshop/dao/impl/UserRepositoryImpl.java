package ua.skillsup.practice.jpaworkshop.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.jpaworkshop.dao.UserRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public long create(User user) {
        return 0;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public User getOne(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User findByLogin(String login) {
        return entityManager.createQuery("from User where login = :login", User.class)
                .setParameter("login", login)
                .getSingleResult();
    }
}
