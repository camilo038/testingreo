package co.com.test.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest {

    @NotNull(message = "moviCtcoNegocio no puede ser nulo")
    @NotEmpty(message = "moviCtcoNegocio no puede estar vacio")
    @Size(max = 4000, message = "moviCtcoNegocio debe ser de 4000 caracteres")
	private String moviCtcoNegocio;
    
    @NotNull(message = "moviCtcoCiasNego no puede ser nulo")
    @NotEmpty(message = "moviCtcoCiasNego no puede estar vacio")
    @Size(max = 4000, message = "moviCtcoCiasNego debe ser de 4000 caracteres")
	private String moviCtcoCiasNego;
    
	@NotNull(message = "moviEncargo no puede ser nulo")
    @NotEmpty(message = "moviEncargo no puede estar vacio")
	@Size(max = 4000, message = "moviEncargo debe ser de 4000 caracteres")
	private String moviEncargo;

	public String getMoviCtcoNegocio() {
		return moviCtcoNegocio;
	}

	public void setMoviCtcoNegocio(String moviCtcoNegocio) {
		this.moviCtcoNegocio = moviCtcoNegocio;
	}

	public String getMoviCtcoCiasNego() {
		return moviCtcoCiasNego;
	}

	public void setMoviCtcoCiasNego(String moviCtcoCiasNego) {
		this.moviCtcoCiasNego = moviCtcoCiasNego;
	}

	public String getMoviEncargo() {
		return moviEncargo;
	}

	public void setMoviEncargo(String moviEncargo) {
		this.moviEncargo = moviEncargo;
	}
}
