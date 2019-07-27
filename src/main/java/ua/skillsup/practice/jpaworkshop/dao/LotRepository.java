package ua.skillsup.practice.jpaworkshop.dao;

import ua.skillsup.practice.jpaworkshop.dao.entity.Lot;

import java.time.LocalDate;
import java.util.List;

public interface LotRepository {

	long create(Lot lot);
	void update(Lot lot);
	Lot getOne(long id);
	List<Lot> findAll();
	List<Lot> findByUserNameAndUpdateDate(String username, LocalDate from, LocalDate to);

}
