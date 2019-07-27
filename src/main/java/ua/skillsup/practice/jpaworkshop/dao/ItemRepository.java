package ua.skillsup.practice.jpaworkshop.dao;

import ua.skillsup.practice.jpaworkshop.dao.entity.Item;

import java.util.List;

public interface ItemRepository {

	long create(Item item);
	void update(Item item);
	Item getOne(long id);
	List<Item> findAll();
	Item findByTitle(String title);

}