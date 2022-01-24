package co.com.test.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import co.com.test.model.RequestActulizarCliente;
import co.com.test.model.RequestConsulatarCliente;
import co.com.test.model.RequestCrearCliente;
import co.com.test.model.RequestEliminarCliente;

/**
 * 
 * @author Camilo Camargo
 *
 */
@Path("/")
public interface Client {

	@GET
	@Path("/consultarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void consultarCliente(@Body RequestConsulatarCliente body);

	@POST
	@Path("/crearCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void crearCliente(@Body RequestCrearCliente body);

	@PUT
	@Path("/actulizarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void actulizarCliente(@Body RequestActulizarCliente body);

	@DELETE
	@Path("/eliminarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void eliminarCliente(@Body RequestEliminarCliente body);

}