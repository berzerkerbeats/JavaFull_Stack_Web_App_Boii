package com.springwebtemp.entities;



import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import com.springwebtemp.entities.Users;



import javax.validation.constraints.NotNull;

@Entity
@NamedQueries({
	@NamedQuery(query = "SELECT e FROM Messages e WHERE e.id = :id",name = "Messages.id"),
	
	})


@Table(name="Messages")
public class Messages {

//	@ManyToOne
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Basic
	@Column(unique = false)// the unique attribute allows the column to either be unique or not
	private String message;
	@Basic
	@Column(unique = false)
	private int userid;
	@Basic
	@Column
	@NotNull
	private Timestamp date;
	
	
	@ManyToOne(targetEntity = Users.class)
	List<Users> listofUsers;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int i) {
		this.userid = i;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp sqlDate) {
		this.date = sqlDate;
	}


	
	public Messages(int id, String message, int userid, Timestamp date) {
		super();
		this.id = id;
		this.message = message;
		this.userid = userid;
		this.date = date;
	}


	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Messages [id=" + id + ", message=" + message + ", userid=" + userid + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
