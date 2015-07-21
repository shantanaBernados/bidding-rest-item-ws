package vn.com.fsoft.bidding.itemws.service;

import vn.com.fsoft.bidding.restful.dto.Account;

public interface AccountManager {
	
	public Account get(String email);
}
