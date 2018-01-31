package edu.carleton.comp4601.simple;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/bank")
public class Bank {
	
	@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHello() {
	return "Welcome to Comp4601 Bank";
}
	
	/*@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		return "<?xml version=\"1.0\"?>" + "<bank> Welcome to COMP4601 Bank" + "<\\bank>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		return "<html><title>COMP 4601 Bank<\\title><\\html>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		return "{Welcome to COMP4601 Bank}";
	}*/
}

