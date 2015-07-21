package vn.com.fsoft.bidding.itemws.service;

import java.util.List;

import vn.com.fsoft.bidding.restful.dto.Item;

public interface ItemManager {

	public void create(Item item);
	public Item read(int id);
	public void update(Item item);	
	public void delete(int id);
	
	public List<Item> readAll();
	
}
