package com.leandrorocha.wk.backend;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/")
public class MyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Conectado ao projeto wk.banckend";
	}
}
