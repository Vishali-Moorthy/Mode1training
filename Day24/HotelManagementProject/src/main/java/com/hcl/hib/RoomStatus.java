package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Room")
public class RoomStatus {
	private String roomId;
	private String status;
	private String type;
	private int costperday;
	@Id
	@Column (name="RoomId")
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	@Column (name="Status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column (name="Type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column (name="CostPerDay")
	public int getCostperday() {
		return costperday;
	}
	public void setCostperday(int costperday) {
		this.costperday = costperday;
	}
	
	

}
