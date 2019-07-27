package ua.skillsup.practice.jpaworkshop.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.jpaworkshop.dao.ItemRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private final EntityManager entityManager;

    public ItemRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public long create(Item item) {
        return 0;
    }

    @Override
    public void update(Item item) {

    }

    @Override
    public Item getOne(long id) {
        return null;
    }

    @Override
    public List<Item> findAll() {
        return entityManager.createQuery("from Item", Item.class).getResultList();
    }

    @Override
    public Item findByTitle(String title) {
        return null;
    }
}
