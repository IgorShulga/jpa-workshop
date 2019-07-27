package ua.skillsup.practice.jpaworkshop.service;

import org.springframework.stereotype.Service;
import ua.skillsup.practice.jpaworkshop.dao.ItemRepository;
import ua.skillsup.practice.jpaworkshop.dao.LotRepository;
import ua.skillsup.practice.jpaworkshop.dao.UserRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.Item;
import ua.skillsup.practice.jpaworkshop.dao.entity.Lot;
import ua.skillsup.practice.jpaworkshop.dao.entity.LotHistory;
import ua.skillsup.practice.jpaworkshop.dao.entity.User;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    private final LotRepository lotRepository;
    private final ItemRepository itemRepository;
    private final UserRepository userRepository;

    public AuctionServiceImpl(LotRepository lotRepository, ItemRepository itemRepository, UserRepository userRepository) {
        this.lotRepository = lotRepository;
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public User getUser(String login) {
        return null;
    }

    @Override
    public List<Lot> getUserLots(String login, LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public List<Lot> getAllLots() {
        return null;
    }

    @Override
    @Transactional
    public Lot createLot(String login, String item, BigDecimal startPrice, int period) {
        Lot lot = new Lot();
        lot.setStartPrice(startPrice);
        lot.setCurrentPrice(startPrice);
        lot.setLastUpdate(LocalDate.now());
        lot.setDateEnd(LocalDate.now().plusDays(period));
        lot.setItem(itemRepository.findByTitle(item));
        lot.setOwner(userRepository.findByLogin(login));
        lotRepository.create(lot);
        return lot;
    }

    @Override
    public void makeBid(String login, long lotId, BigDecimal newPrice) {

    }

    @Override
    public List<LotHistory> getLotHistory(long lotId) {
        return null;
    }

    @Override
    public List<Item> getItemByCategory(String category) {
        return itemRepository.findByCategory(category);
    }


}
