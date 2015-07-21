package vn.com.fsoft.bidding.itemws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.fsoft.bidding.itemws.persistence.ItemDAO;
import vn.com.fsoft.bidding.restful.dto.Item;

/*
 * @Service annotation. 
 * This is where we put our business logic 
 * and manage our transactions.
 */
@Service
@Transactional
public class ItemManagerImpl implements ItemManager {

	@Autowired
	private ItemDAO itemDAO;
	
	public void create(Item item) {
		itemDAO.create(item);
	}

	public Item read(int id) {
		// TODO Auto-generated method stub
		return itemDAO.read(id);
	}

	public void update(Item item) {
		// TODO Auto-generated method stub
		itemDAO.update(item);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		itemDAO.delete(id);
	}

	public List<Item> readAll() {
		return itemDAO.readAll();
	}
}
