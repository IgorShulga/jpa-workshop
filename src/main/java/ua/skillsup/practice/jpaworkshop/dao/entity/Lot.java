package ua.skillsup.practice.jpaworkshop.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Lot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OWNER_ID")
	private User owner;

	@Column(name = "LAST_UPDATE")
	private LocalDate lastUpdate;
	@Column(name = "START_PRICE")
	private BigDecimal startPrice;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BUYER_ID")
	private User buyer;
	@Column(name = "CURRENT_PRICE")
	private BigDecimal currentPrice;
	@Column(name = "DATE_END")
	private LocalDate dateEnd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public LocalDate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lot lot = (Lot) o;
		return Objects.equals(id, lot.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Lot{" +
				"id=" + id +
				", item=" + item +
				", owner=" + owner +
				", lastUpdate=" + lastUpdate +
				", startPrice=" + startPrice +
				", buyer=" + buyer +
				", currentPrice=" + currentPrice +
				", dateEnd=" + dateEnd +
				'}';
	}
}