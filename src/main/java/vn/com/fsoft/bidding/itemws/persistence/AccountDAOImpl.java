package vn.com.fsoft.bidding.itemws.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.bidding.restful.dto.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Account get(String email) {
		return (Account) this.sessionFactory.getCurrentSession().createQuery("from Account where email_address=:email").setParameter("email", email).uniqueResult();
	}
}
