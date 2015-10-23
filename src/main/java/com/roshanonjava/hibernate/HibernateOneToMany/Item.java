package com.roshanonjava.hibernate.HibernateOneToMany;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class Item {
	
	@Id
	@Column(name="item_id")
	@GeneratedValue
	private Long itemId;
	@Column(name="name")
	private String itemName;
	@Column(name="description")
	private String itemDescription;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="amount")
	private Long amount;
	
	@ManyToOne
	@JoinColumn(name="transaction_id")
	private Transaction transaction;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	

}
