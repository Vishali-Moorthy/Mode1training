package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HotelCRUD {
	
	public String generateRoomid() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q= s.createQuery("select max(roomId) from RoomStatus");
		String roomId="R001";
		List<String> lst=q.list();
		String fb="";
		int id;
		if(lst.get(0)==null){
			roomId="R001";
		} else {
			fb=lst.get(0);
		id = Integer.parseInt(fb.substring(1));
		id++;
		String formatted = String.format("%03d", id);
		roomId = "R" + formatted;
		}
		return roomId;
	}
	}


