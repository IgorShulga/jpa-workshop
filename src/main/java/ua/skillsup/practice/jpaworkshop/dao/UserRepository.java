package ua.skillsup.practice.jpaworkshop.dao;

import ua.skillsup.practice.jpaworkshop.dao.entity.User;

import java.util.List;

public interface UserRepository {

	long create(User user);
	void update(User user);
	User getOne(long id);
	List<User> findAll();
	User findByLogin(String login);

}