package com.example.demo.service;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Path(value = "/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.MULTIPART_FORM_DATA)
@Component
public interface TestService {
	@POST
	@Path("/image1")
	public String upload(@FormDataParam("file") InputStream fileInputStream,
						 @FormDataParam("file") FormDataContentDisposition disposition, @Context ServletContext ctx) ;

	@POST
	@Path("/image2")
	public String upload2(@FormDataParam("file") FormDataBodyPart bp, @Context ServletContext ctx) ;
}
