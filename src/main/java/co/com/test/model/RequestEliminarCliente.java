package co.com.test.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestEliminarCliente {


    @NotNull(message = "@CustomerID no puede ser nulo")
    @NotEmpty(message = "@CustomerID no puede estar vacio")
    @Pattern(regexp = "^(-?[0-9]+)|()$", message = "El campo CustomerID es numerico entero")
	private String customerID;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	
	
    
    
    
}
