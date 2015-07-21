package vn.com.fsoft.bidding.itemws.persistence;

import java.util.List;

import vn.com.fsoft.bidding.restful.dto.Item;

public interface ItemDAO {

	public void create(Item item);
	public Item read(int id);
	public void update(Item item);
	public void delete(int id);
	
	public List<Item> readAll();
	
}
