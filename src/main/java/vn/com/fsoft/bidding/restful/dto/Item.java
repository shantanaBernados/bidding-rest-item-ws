package vn.com.fsoft.bidding.restful.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
@org.hibernate.annotations.Entity (
	dynamicUpdate = true,
	dynamicInsert = true
)
public class Item {
	
	@Id
	@Column(name="ITEM_ID")
	private int item_id;
	
	@Column(name="ACCOUNT_ID")
	private int account_id;
	
	@Column(name="ITEM_NAME")
	private String item_name;
	
	@Column(name="ITEM_DESCRIPTION")
	private String item_description;
	
	@Column(name="START_BID_AMOUNT")
	private double start_bid_amount;
	
	@Column(name="START_BID_DATETIME")
	private Date start_bid_datetime;
	
	@Column(name="END_BID_DATETIME")
	private Date end_bid_datetime;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public double getStart_bid_amount() {
		return start_bid_amount;
	}

	public void setStart_bid_amount(double start_bid_amount) {
		this.start_bid_amount = start_bid_amount;
	}

	public Date getStart_bid_datetime() {
		return start_bid_datetime;
	}

	public void setStart_bid_datetime(Date start_bid_datetime) {
		this.start_bid_datetime = start_bid_datetime;
	}

	public Date getEnd_bid_datetime() {
		return end_bid_datetime;
	}

	public void setEnd_bid_datetime(Date end_bid_datetime) {
		this.end_bid_datetime = end_bid_datetime;
	}
	
	
	
}
