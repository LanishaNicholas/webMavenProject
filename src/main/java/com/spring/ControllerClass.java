package com.springonline;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springonline.*;

@Controller
public class ControllerClass {
	@Autowired
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("addbook")
	public String addbook() {
		return "AddBook";
	}
	
	/*@RequestMapping("send")
	public String send(HttpServletRequest request, Model model) {
		String category = request.getParameter("category");
		String bookname = request.getParameter("bname");
		String author = request.getParameter("author");
		String price =request.getParameter("price");
		
		model.addAttribute("bookdata",category+" "+ bookname+" " +author+" "+price);
		return "details";
	}*/
	
	@RequestMapping("send")
	public String send(@RequestParam("category")String cname,@RequestParam("bname") String bname,
			 @RequestParam("author") String bauthor,@RequestParam("price") String bprice,Model model) {
		model.addAttribute("bookdata",cname+" "+ bname+" " +bauthor+" "+bprice);
		return "details";
	}
	
	@RequestMapping("addnewbook")
	public String addnewbook(Model model,BookModel book) {
		model.addAttribute("books",book);
		return "addNewBooks";
	}
	
	@RequestMapping("save")
	public String saveBook(@ModelAttribute BookModel book,Model model) {
		bookDao.InsertBook(book);
		model.addAttribute("bookdata",book);
		return "redirect:/list";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("allbook",bookDao.getAllBooks());
		return "displaylist";
	}
	
	@RequestMapping("edit/{id}")
	public String edit(@PathVariable("id")int id,Model model) {
		BookModel book = bookDao.getBookById(id);
		model.addAttribute("command",book);
		return "editBookData";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id")int id) {
		bookDao.deleteBookById(id);
		return "redirect:/list";
	}
	
	@RequestMapping(value="edit/{id}",method=RequestMethod.POST)
	public String updateBookData(@ModelAttribute("book") BookModel book,@PathVariable("id")int id) {
		//System.out.println(id);
		bookDao.updateBookDataById(book,id);
		return "redirect:/list";
	}
	
}
