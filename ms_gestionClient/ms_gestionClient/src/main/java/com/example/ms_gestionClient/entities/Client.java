package com.example.ms_gestionClient.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	
@Getter
@Setter
@NoArgsConstructor
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date  dateNaissance;
	private String email;
	private String password;

	public Client(String nom, String prenom , String mail){
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
	}
	
}
