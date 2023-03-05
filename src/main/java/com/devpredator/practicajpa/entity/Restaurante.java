package com.devpredator.practicajpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author ricardo
 *
 */
@Entity
@Table(name = "restaurante")
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRestaurante;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "imagen")
	private String imagen;

	@Column(name = "slogan")
	private String slogan;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoRestaurante")
	
	@Cascade(CascadeType.REMOVE)
	private TipoRestaurante tipo_restaurante;

	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;

	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;

	@Column(name = "estatus")
	private boolean estatus;
	
	
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idMenu")
		
		@Cascade(CascadeType.REMOVE)
		private Menu menu;

		/**
		 * @return the idRestaurante
		 */
		public Long getIdRestaurante() {
			return idRestaurante;
		}

		
		public void setIdRestaurante(Long idRestaurante) {
			this.idRestaurante = idRestaurante;
		}

		
		public String getNombre() {
			return nombre;
		}

		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		public String getImagen() {
			return imagen;
		}

		
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		
		public String getSlogan() {
			return slogan;
		}

		
		public void setSlogan(String slogan) {
			this.slogan = slogan;
		}

		/**
		 * @return the tipo_restaurante
		 */
		public TipoRestaurante getTipo_restaurante() {
			return tipo_restaurante;
		}

		
		public void setTipo_restaurante(TipoRestaurante tipo_restaurante) {
			this.tipo_restaurante = tipo_restaurante;
		}

		/**
		 * @return the fechaCreacion
		 */
		public LocalDateTime getFechaCreacion() {
			return fechaCreacion;
		}

		
		public void setFechaCreacion(LocalDateTime fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}

		/**
		 * @return the fechaModificacion
		 */
		public LocalDateTime getFechaModificacion() {
			return fechaModificacion;
		}

		/**
		 *  fechaModificacion the fechaModificacion to set
		 */
		public void setFechaModificacion(LocalDateTime fechaModificacion) {
			this.fechaModificacion = fechaModificacion;
		}

		
		public boolean isEstatus() {
			return estatus;
		}

		
		public void setEstatus(boolean estatus) {
			this.estatus = estatus;
		}

		/**
		 * @return the menu
		 */
		public Menu getMenu() {
			return menu;
		}

		
		public void setMenu(Menu menu) {
			this.menu = menu;
		}
}
		
		
