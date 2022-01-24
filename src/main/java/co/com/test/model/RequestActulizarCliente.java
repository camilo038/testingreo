package co.com.test.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestActulizarCliente {
	
	@NotNull(message = "@customerID no puede ser nulo")
    @NotEmpty(message = "@customerID no puede estar vacio")
    @Pattern(regexp = "^(-?[0-9]+)|()$", message = "El campo customerID es numerico entero")
	private String customerID;

	
    @NotNull(message = "firstName no puede ser nulo")
    @NotEmpty(message = "firstName no puede estar vacio")
    @Size(max = 4000, message = "moviCtcoCiasNego debe ser de 4000 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo firstName es un String")
	private String firstName;
    
    @NotNull(message = "lastName no puede ser nulo")
    @NotEmpty(message = "lastName no puede estar vacio")
    @Size(max = 4000, message = "lastName debe ser de 4000 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo lastName es un String")
	private String lastName;
    
    @NotNull(message = "email no puede ser nulo")
    @NotEmpty(message = "email no puede estar vacio")
    @Size(max = 4000, message = "email debe ser de 4000 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "El campo email no es un correo valido")       
    private String email;
    
          
    
    @NotNull(message = "@phoneNumber no puede ser nulo")
    @NotEmpty(message = "@phoneNumber no puede estar vacio")
    @Pattern(regexp = "^(-?[0-9]+)|()$", message = "El campo phoneNumber es numerico entero")
	private String phoneNumber;



	public String getCustomerID() {
		return customerID;
	}



	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
}
