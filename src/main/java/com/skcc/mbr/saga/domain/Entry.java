//package com.skcc.mbr.saga.domain;
//import java.util.Collections;
//
//import javax.persistence.Access;
//import javax.persistence.AccessType;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.networknt.tram.event.ResultWithEvents;
//import com.skcc.mbr.saga.vo.EntryDetail;
//
//@Entity
//@Table(name="EVENT_ENTRY")
//@Access(AccessType.FIELD)
//public class Entry {
//	
//	@Id
//	@GeneratedValue
//	private Long id; 
//	
//	private EntryState state; 
//	
//	@Embedded
//	private EntryDetail entryDetail;
//	
//	public Entry() {
//		
//	}
//	
//	public Entry(EntryDetail entryDetail) {
//		this.entryDetail = entryDetail;
//		this.state = EntryState.PENDING;
//	}
//	
//	public static ResultWithEvents<Entry> createEntry(EntryDetail entryDetail){
//			return new ResultWithEvents<Entry>(new Entry(entryDetail), Collections.emptyList());
//	}
//}
