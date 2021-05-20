package com.spring.market;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.market.domain.productDTO;
import com.spring.market.service.marketService;

// Handles requests for the application home page.
@Controller
@RequestMapping("/market/")
public class MarketController {

	@Inject
	marketService service;

	// Users request to output the main page.
	// Call the Service to handle business logic that prints a list of products on
	// the main page.
	// Send the returned product list results(model) to the view.
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainpage(Model model) throws Exception {

		List<productDTO> list = null;
		list = service.getList();

		model.addAttribute("list", list);

	}

	// Users request to output the write page.
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void write() throws Exception {

	}

	// Users request to write the products.
	// Call the Service to handle business logic that write product to DB.
	// After processing business logic, the main page is printed out.
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(productDTO dto) throws Exception {

		service.write(dto);

		return "redirect:/market/main";
	}

	// Users request to view the product.
	// Call the Service to handle business logic that get information of the product corresponding to bno.
	// Send the result to view.
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void view(@RequestParam("bno") int bno, Model model) throws Exception {
		productDTO dto = service.view(bno);
		model.addAttribute("view", dto);
	}

	// Users request to output the write page.
	// Call the Service to handle business logic that modify information of the product corresponding to bno.
	// Send the result to view.
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modify(@RequestParam("bno") int bno, Model model) throws Exception {
		productDTO dto = service.view(bno);
		model.addAttribute("view", dto);
	}
	
	// Users request to modify the product.
	// Call the Service to handle business logic that modify product in DB.
	// After processing business logic, the view page is printed out.
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(productDTO dto) throws Exception {

		service.modify(dto);

		return "redirect:/market/view?bno="+dto.getBno();
	}
}
