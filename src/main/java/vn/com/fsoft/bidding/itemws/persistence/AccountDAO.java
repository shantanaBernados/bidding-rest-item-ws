package vn.com.fsoft.bidding.itemws.persistence;

import vn.com.fsoft.bidding.restful.dto.Account;

public interface AccountDAO {

	public Account get(String email);

}
