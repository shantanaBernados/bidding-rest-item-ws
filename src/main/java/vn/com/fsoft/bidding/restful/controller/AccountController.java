package vn.com.fsoft.bidding.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.fsoft.bidding.itemws.service.AccountManager;
import vn.com.fsoft.bidding.restful.dto.Account;

@Controller
public class AccountController {

	@Autowired
	private AccountManager accountManager;
	
	@RequestMapping(
			value="/account",
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE
	)
	public @ResponseBody Account get(@RequestParam String email) {
		return accountManager.get(email);
	}
}
