package com.enesbyc;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Url kısmına /rest/send geldiğinde yapılacakları belirtiyoruz.
@Path("send")
public class Service {
	
	//Url kısmına /rest/send geldiğinde post işleminde yapılacakları belirtiyoruz.
	//ProductName ve ProductPrice değerlerini FormParam etiketi ile alıyoruz.
	//Burada formdan gönderdiğimiz name değerleri ile alıyoruz.
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response sendService(@FormParam("productName") String productName,
								@FormParam("productPrice") int productPrice){
		
		String result="Product Name:"+productName+" Product Price:"+productPrice;
		
		return Response.status(200).entity(result).build();
		
	}
	
}
