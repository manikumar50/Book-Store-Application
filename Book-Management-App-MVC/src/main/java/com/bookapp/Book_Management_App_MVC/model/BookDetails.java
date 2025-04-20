package com.bookapp.Book_Management_App_MVC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetails
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable = false)
	private int id;
	@Column(length = 20,nullable = false)
	private String bookName;
	@Column(length = 20,nullable = false)
	private String authorName;
	@Column(length = 20,nullable = false)
	private int publishYear;
	@Column(length = 20,nullable = false)
	private int availableStock;
	@Column(length = 20,nullable = false)
	private int price;
}
