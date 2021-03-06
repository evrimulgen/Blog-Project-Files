package com.enesbyc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Url kısmına /rest/product geldiğinde yapılacakları belirtiyoruz.
@Path("product")
public class ProductService {
	
	//Url kısmına /rest/product/info geldiğinde yapılacakları belirtiyoruz.
	//XML tipinde verilerle işlemler yapacağımızı belirtiyoruz.
	@GET
	@Path("info")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductInfo(){
		
		Product product=new Product();
		product.setProductName("Bottle");
		product.setProductPrice("15");
		
		return product;
		
	}
	
}





