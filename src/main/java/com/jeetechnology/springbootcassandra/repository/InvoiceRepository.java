package com.jeetechnology.springbootcassandra.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.jeetechnology.springbootcassandra.model.Invoice;

public interface InvoiceRepository extends CassandraRepository<Invoice, Integer>{
	
	@AllowFiltering
	List<Invoice> findByName(String name);
	
}
