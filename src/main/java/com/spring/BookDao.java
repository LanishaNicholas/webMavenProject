package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookDao {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void InsertBook(BookModel book) {
		String query = "insert into books(category,bname,author,price)values('"+book.getCategory()+"','"+book.getBname()+"','"+book.getAuthor()+"','"+book.getPrice()+"')";
		template.update(query);
	}
	
	public List<BookModel>getAllBooks(){
		return template.query("select * from books", new RowMapper<BookModel>() {

			@Override
			public BookModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				BookModel book = new BookModel();
				book.setBookid(rs.getInt(1));
				book.setCategory(rs.getString(2));
				book.setBname(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setPrice(rs.getInt(5));
				return book;
			}
			
		});
	}
}
