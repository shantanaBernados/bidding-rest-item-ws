package vn.com.fsoft.bidding.itemws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.fsoft.bidding.itemws.persistence.AccountDAO;
import vn.com.fsoft.bidding.restful.dto.Account;

@Service
@Transactional
public class AccountManagerImpl implements AccountManager {

	@Autowired
	private AccountDAO accountDAO;
	
	public Account get(String email) {
		return accountDAO.get(email);
	}
}
