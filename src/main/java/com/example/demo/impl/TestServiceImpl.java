package com.example.demo.impl;

import com.example.demo.service.TestService;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public String upload(@FormDataParam("file") InputStream fileInputStream,
						 @FormDataParam("file") FormDataContentDisposition disposition, @Context ServletContext ctx) {
		return "success";
	}

	@POST
	@Path("image2")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String upload2(@FormDataParam("file") FormDataBodyPart bp, @Context ServletContext ctx)
	{
		return "success";
	}


}
