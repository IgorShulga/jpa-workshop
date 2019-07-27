package ua.skillsup.practice.jpaworkshop.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.jpaworkshop.dao.LotRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.Lot;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

@Repository
public class LotRepositoryImpl implements LotRepository {

    private final EntityManager entityManager;

    public LotRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public long create(Lot lot) {
        entityManager.persist(lot);
        return lot.getId();
    }

    @Override
    public void update(Lot lot) {

    }

    @Override
    public Lot getOne(long id) {
        return null;
    }

    @Override
    public List<Lot> findAll() {
        return entityManager.createQuery("from Lot", Lot.class).getResultList();
    }

    @Override
    public List<Lot> findByUserNameAndUpdateDate(String username, LocalDate from, LocalDate to) {
        return entityManager.createQuery("select l from Lot l " +
                "LEFT JOIN l.owner o " +
                "where o.login=:username " +
                "and l.lastUpdate between  :from and :to", Lot.class)
                .setParameter("username", username)
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();
    }
}

