package com.skcc.mbr.saga.domain.customer;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Entity
@Data
@Table(name="EVENT_CUSTOMER")
@ToString
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//회원 id 
	@Id
	@Column(name="cust_id", unique=true, nullable=false)
	private String cust_id;
	
	//고객명 
	private String cust_name; 
	
	//고객 등급 
	private String grade; 
	
	//등록 일자 
	private String reg_date;
	
	//수정 일자 
	private String upd_date; 
	
	Customer(){
		
	}
	
	@Builder
	Customer(String cust_id, String cust_name, String grade){
		this.cust_id = cust_id; 
		this.cust_name = cust_name; 
		this.grade = grade;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");
		String time =  format.format(System.currentTimeMillis()); 
		this.reg_date = time; 
		this.upd_date = time; 
	}
}
