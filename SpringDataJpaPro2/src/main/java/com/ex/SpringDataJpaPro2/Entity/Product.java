package com.ex.SpringDataJpaPro2.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.ToString;

@Entity
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@SequenceGenerator(name = "seq",sequenceName = "seq_name")
	private Long Id;
	
	private String name;
	
	private BigDecimal price;
	
	private boolean active;
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime  dateUpdated;
	public Product() {
		super();
		
	}
	public Product(Long id, String name, BigDecimal price, boolean active, LocalDateTime dateCreated,
			LocalDateTime dateUpdated) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}
	public Product(Long id, String name, BigDecimal price, boolean active) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		
	}
	public Product( String name, BigDecimal price, boolean active) {
		super();
		
		this.name = name;
		this.price = price;
		this.active = active;
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	

}
