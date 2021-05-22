package com.spring.market;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.market.domain.productDTO;
import com.spring.market.domain.replyDTO;
import com.spring.market.service.marketService;
import com.spring.market.service.replyService;

// Handles requests for the application home page.
@Controller
@RequestMapping("/market/")
public class MarketController {

	@Inject
	private marketService service;

	@Inject
	private replyService rservice;
	
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
		
		List<replyDTO> reply = null;
		reply = rservice.replyList(bno);
		model.addAttribute("reply", reply);
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
	
	// Users request to delete the product.
	// Call the Service to handle business logic that delete product in DB.
	// After processing business logic, the main page is printed out.
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("bno") int bno) throws Exception {

		service.delete(bno);

		return "redirect:/market/main";
	}
	
	// Request to product list with paging
	// Call the Service to handle business logic that prints a list of products with paging
	// Send the returned product list results(model) to the view.
	@RequestMapping(value = "/paging", method = RequestMethod.GET)
	public void paging(Model model, @RequestParam("num") int num) throws Exception {
		 
		// The number of products.
		 int count = service.count();
		  
		 // The number of products to print per page.
		 int cntPerPage = 3;
		  
		 // The number of pages.
		 int numPage = (int)Math.ceil((double)count/cntPerPage);
		  
		 // The first post on the current page.
		 int current = (num - 1) * cntPerPage;
		 
		 // The number of pages output at a time.
		 int numPagePrint = 5;

		 // Start page number to print out.
		 int numStartPage = num-2;
		 
		 // End page number to print out.
		 int numEndPage = num+2;
		 
		 // Check the page number is beyond the range of 1 to maximum page number.
		 if(numStartPage <= 1) {
			 numStartPage = 1;
			 numEndPage = 5;
		 }
		 if(numEndPage >= numPage) {
			 numEndPage = numPage;
			 numStartPage = numEndPage - 4;
		 }
		 if(numPage < 5) {
			 numStartPage = 1;
			 numEndPage = numPage;
		 }
		    
		 List<productDTO> list = null; 
		 list = service.paging(current, cntPerPage);
		 model.addAttribute("list", list);   
		 model.addAttribute("numPage", numPage);

		 model.addAttribute("numStartPage", numStartPage);   
		 model.addAttribute("numEndPage", numEndPage);
		 
		 model.addAttribute("select", num);
		 
	}
}
