package com.mycorp.support;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Poliza {
	/** The Constant MAX_ARG. */
	private static final int MAX_ARG = 3;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7697433318924093934L;

	/** The compania. */
	private Integer compania;

	/** The copago. */
	private boolean copago;

	/** The desc banco. */
	private String descBanco;

	/** The id poliza. */
	private String idPoliza;

	/** The mostrar aseg post. */
	private Boolean mostrarAsegPost;

	/** The num colectivo. */
	private Integer numColectivo;

	/** The num poliza. */
	private Integer numPoliza;

	/** The num tarjeta. */
	private String numTarjeta;

	/** The perfil. */
	private String perfil;

	/** The plan info. */
	private ValueCode planInfo;

	/** The reembolso. */
	private Boolean reembolso;

	/**
	 * Deserialize.
	 *
	 * @param fieldsList
	 *            the fields list
	 */
	public final void deserialize(final List<String> fieldsList) {

		if (CollectionUtils.isNotEmpty(fieldsList) && fieldsList.size() == MAX_ARG) {
			this.compania = NumberUtils.toInt(fieldsList.get(0));
			this.numPoliza = NumberUtils.toInt(fieldsList.get(1));
			this.numColectivo = NumberUtils.toInt(fieldsList.get(2));
		} else {
			throw new IllegalArgumentException("El identificador de la Poliza no es correcto");
		}

	}

	/**
	 * Gets the compania.
	 *
	 * @return the compania
	 */
	public final Integer getCompania() {
		return compania;
	}

	/**
	 * Gets the desc banco.
	 *
	 * @return the desc banco
	 */
	public final String getDescBanco() {
		return descBanco;
	}

	/**
	 * Gets the id poliza.
	 *
	 * @return the id poliza
	 */
	public final String getIdPoliza() {
		return idPoliza;
	}

	/**
	 * Gets the mostrar aseg post.
	 *
	 * @return the mostrar aseg post
	 */
	public final Boolean getMostrarAsegPost() {
		return mostrarAsegPost;
	}

	/**
	 * Gets the num colectivo.
	 *
	 * @return the num colectivo
	 */
	public final Integer getNumColectivo() {
		return numColectivo;
	}

	/**
	 * Gets the num poliza.
	 *
	 * @return the num poliza
	 */
	public final Integer getNumPoliza() {
		return numPoliza;
	}

	/**
	 * Gets the num tarjeta.
	 *
	 * @return the num tarjeta
	 */
	public final String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * Gets the perfil.
	 *
	 * @return the perfil
	 */
	public final String getPerfil() {
		return perfil;
	}

	/**
	 * Gets the plan info.
	 *
	 * @return the plan info
	 */
	public final ValueCode getPlanInfo() {
		return planInfo;
	}

	/**
	 * Gets the reembolso.
	 *
	 * @return the reembolso
	 */
	public final Boolean getReembolso() {
		return reembolso;
	}

	/**
	 * @return the copago
	 */
	public boolean isCopago() {
		return this.copago;
	}

	/**
	 * Sets the compania.
	 *
	 * @param compania
	 *            the new compania
	 */
	public final void setCompania(Integer compania) {
		this.compania = compania;
	}

	/**
	 * @param copago
	 *            the copago to set
	 */
	public void setCopago(boolean copago) {
		this.copago = copago;
	}

	/**
	 * Sets the desc banco.
	 *
	 * @param descBanco
	 *            the new desc banco
	 */
	public final void setDescBanco(String descBanco) {
		this.descBanco = descBanco;
	}

	/**
	 * Sets the id poliza.
	 *
	 * @param idPoliza
	 *            the new id poliza
	 */
	public final void setIdPoliza(String idPoliza) {
		this.idPoliza = idPoliza;
	}

	/**
	 * Sets the mostrar aseg post.
	 *
	 * @param mostrarAsegPost
	 *            the new mostrar aseg post
	 */
	public final void setMostrarAsegPost(Boolean mostrarAsegPost) {
		this.mostrarAsegPost = mostrarAsegPost;
	}

	/**
	 * Sets the num colectivo.
	 *
	 * @param numColectivo
	 *            the new num colectivo
	 */
	public final void setNumColectivo(Integer numColectivo) {
		this.numColectivo = numColectivo;
	}

	/**
	 * Sets the num poliza.
	 *
	 * @param numPoliza
	 *            the new num poliza
	 */
	public final void setNumPoliza(Integer numPoliza) {
		this.numPoliza = numPoliza;
	}

	/**
	 * Sets the num tarjeta.
	 *
	 * @param numTarjeta
	 *            the new num tarjeta
	 */
	public final void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Sets the perfil.
	 *
	 * @param perfil
	 *            the new perfil
	 */
	public final void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	/**
	 * Sets the plan info.
	 *
	 * @param planInfo
	 *            the new plan info
	 */
	public final void setPlanInfo(ValueCode planInfo) {
		this.planInfo = planInfo;
	}

	/**
	 * Sets the reembolso.
	 *
	 * @param reembolso
	 *            the new reembolso
	 */
	public final void setReembolso(Boolean reembolso) {
		this.reembolso = reembolso;
	}
}
