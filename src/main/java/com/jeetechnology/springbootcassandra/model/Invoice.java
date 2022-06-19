package com.jeetechnology.springbootcassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
	
	@PrimaryKey
	 private Integer id;
     private String name;
     private String number;
     private Double amount;

}
