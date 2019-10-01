package com.hcl.lib;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class LibraryDAO {
	Connection connection;
	public List<Library> searchBook(String searchtype,String srchValue) {
		List<Library> lstBooks=new ArrayList<Library>();
		String sql="";
		connection=DaoConnection.getConnection();
		if(searchtype.equals("id")){
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		}			
		else if(searchtype.equals("bookname"))
		{
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		}
		else if(searchtype.equals("authorname")){
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		}
		else if(searchtype.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else sql = " SELECT * FROM Books WHERE Name != ? OR 1 = 1 " ;
		Library book=null;
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1,srchValue);		
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				book=new Library();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setDept(rs.getString("dept"));
				book.setAuthor(rs.getString("author"));
				book.setEdition(rs.getString("edition"));
				book.setTotalBooks(rs.getInt("totalBooks"));
				lstBooks.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstBooks;
	}
	
	public String issue(int bookId,String username){
		connection=DaoConnection.getConnection();
		String cmd="select count(*) cnt from tranbook where bookid=? AND username=?";
		String result="";
		try {
			PreparedStatement pst;
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, bookId);
			pst.setString(2, username);
			ResultSet rs=pst.executeQuery();
			rs.next();
			int cnt=rs.getInt("cnt");
			if(cnt==1) {
				result="You already taken the book " +bookId + "<br/>";
			} else {
				cmd="insert into tranbook(username,BookId) values(?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, bookId);
				pst.executeUpdate();
				cmd="Update books set TotalBooks=TotalBooks-1 where id=?";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, bookId);
				pst.executeUpdate();
				result="Book with Id " +bookId + " Issued Successfully...<br/>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public void returns(String username) {
		
		String sql=" ";		
		try
		{
			Connection cp = DaoConnection.getConnection();			
			sql = " SELECT * FROM TranBook WHERE Username = ? " ;			
			PreparedStatement ps = cp.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,username);						
			ResultSet rs = ps.executeQuery();
			int i = 0;
		
												
			if(rs.next())
			{
				sql="<br/><br/>Select which book you want to return :";
				rs.previous();				
				sql="<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><form action='ReturnNext'><table><tr>"+
				"<td>BookId</td><td>Fromdate</td><td>Select</td></tr>";			
			
			while(rs.next()) 
			{					
				int bookid = rs.getInt("BookId");	
				Date fromdate = rs.getDate("Fromdate");
								
				sql="<td>"+bookid+"</td><td>"+fromdate+"</td>" +
				"<td><input type='checkbox' name='bookid' value="+bookid+"></td></tr>";		
				i++;
			}	
			
			sql="</table><br/><input type='submit' value='Return Books' ></form></body></html>";			
			}	
							
			if(i == 0)
			{
				sql=("<br/><br/>No more book is available to return .");
			}	
			
		}
		catch(SQLException se)
		{se.printStackTrace();}
		catch(Exception e)
		{e.printStackTrace();}		
	}

	public String AccountDetails(String username) {
		Connection con=DaoConnection.getConnection();
		String cmd="select BookId,Fromdate from tranbook where username=?";
		String result="";
		try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setString(1,username);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
		result +=rs.getInt("BookId");
		result +=rs.getDate("Fromdate");
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return result;	

	
	}

	
	}
		
