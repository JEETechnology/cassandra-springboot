package com.jeetechnology.springbootcassandra.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeetechnology.springbootcassandra.model.Invoice;
import com.jeetechnology.springbootcassandra.repository.InvoiceRepository;

@RestController
@RequestMapping("/invoice")
public class CassandraRestController {

	
	private static final Logger logger = LoggerFactory.getLogger(CassandraRestController.class);
	
	@Autowired
	InvoiceRepository invoiceRepository;
	
	@GetMapping("/test")
	public String testClient() {
		return "retun from testClient";
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveInvoice(@RequestBody Invoice invoice){
		logger.info("Saving Invoice {} ",invoice);
		invoiceRepository.save(invoice);
		return new ResponseEntity<Invoice>(invoice, HttpStatus.OK);
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<?> saveAllInvoice(@RequestBody List<Invoice> invoices){
		logger.info("Saving Invoices: {} ",invoices);
		invoiceRepository.saveAll(invoices);
		return new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
	}
}
