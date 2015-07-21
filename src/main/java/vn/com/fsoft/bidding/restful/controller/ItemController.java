package vn.com.fsoft.bidding.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.fsoft.bidding.itemws.service.ItemManager;
import vn.com.fsoft.bidding.restful.dto.Item;

@Controller
@RequestMapping(value = "/item")
public class ItemController {

	@Autowired
	private ItemManager itemManager;
	
	@RequestMapping(value = "/all")
	public @ResponseBody List<Item> readAll() {
	
		List<Item> items = itemManager.readAll();
		
		return items;
	}
	
	@RequestMapping(
			method = RequestMethod.POST
	)
	public @ResponseBody Item create(@RequestBody Item item) {
	
		itemManager.create(item);
		return item;
		
	}
	
	@RequestMapping(value = "/{id}")
	public @ResponseBody Item read(@PathVariable int id) {
	
		return itemManager.read(id);
		
	}
	
	@RequestMapping(
			value = "/{id}",
			method = RequestMethod.DELETE
	)
	public @ResponseBody void delete(@PathVariable int id) {
		itemManager.delete(id);
	}
	
	@RequestMapping(
			method = RequestMethod.PUT
	)
	public @ResponseBody void update(@RequestBody Item item) {
		itemManager.update(item);
	}
}
