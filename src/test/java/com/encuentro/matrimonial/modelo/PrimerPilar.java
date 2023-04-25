package com.encuentro.matrimonial.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "primer_pilar")
public class PrimerPilar {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private Date fechaCreacion;

	@Column
	private int numFDS;

	@Column
	private int numMatrinoniosVivieron;

	@Column
	private int numSacerdotesVivieron;

	@Column
	private int numReligiososVivieron;
	
	@ManyToOne
	@JoinColumn(name = "ciudad_id")
	private Ciudad ciudad;


}
