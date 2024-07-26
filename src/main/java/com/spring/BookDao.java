package com.springonline;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
					book.setCategory(rs.getString("category"));
					book.setBname(rs.getString("bname"));
					book.setAuthor(rs.getString("author"));
					book.setPrice(rs.getInt("price"));
				
				return book;
			}
			
		});
	}
	
	public BookModel getBookById(int id) {
		String query = "select * from books where bookid=?";
		return template.queryForObject(query, new Object[] {id},new BeanPropertyRowMapper<BookModel>(BookModel.class));
	}
	
	public int deleteBookById(int id) {
		String query = "delete from books where bookid="+id+"";
		return template.update(query);
	}
	
	public int updateBookDataById(BookModel book,int id) {
		System.out.println(book.getBookid());
		String query = "update books set category='"+book.getCategory()+"',bname='"+book.getBname()+"',author='"+book.getAuthor()+"',price='"+book.getPrice()+"' where bookid="+id+"";
		return template.update(query);
	}
}
