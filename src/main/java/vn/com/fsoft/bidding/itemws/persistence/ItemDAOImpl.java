package vn.com.fsoft.bidding.itemws.persistence;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.bidding.restful.dto.Item;

/*
 * @Repository annotation to indicate 
 * that this class or classes contains 
 * our database access logic. 
 */
@Repository
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void create(Item item) {
		this.sessionFactory.getCurrentSession().save(item);
	}

	public Item read(int id) {
		return (Item)this.sessionFactory.getCurrentSession().get(Item.class, id);
	}

	public void update(Item item) {
		this.sessionFactory.getCurrentSession().update(item);
	}

	public void delete(int id) {
		this.sessionFactory.getCurrentSession().createQuery("Delete from Item where item_id = " + id).executeUpdate();
	}

	public List<Item> readAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Item").list();
	}

}
