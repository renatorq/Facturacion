package com.facturacion.persona.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Persona")
@Setter
@Getter

public class Person {

	@Id
	@Column(name = "IdPersona")
	private Long id;

	@Column(name = "Direccion")
	private String address;
	
	@Column(name="FechaNacimiento")
	private Date birthDate;
	
	@Column(name="Telefono")
	private String phoneNumber;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "TipoPersona")
	private String personType;

	@CreatedDate
	private Date createDate;

	@LastModifiedDate
	private Date updateDate;

}
