package com.times.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.times.model.Product;

@Repository

public class ProductDAO {
	List<Product> proList=new ArrayList<Product>();
	public String disp_product()
	{
		Gson gson=new Gson();
		proList.add(new Product("Ti01","Titan","Sp01",25,2000,"Leather watch","Strap type"));
		proList.add(new Product("So01","Sonata","Sp02",50,2000,"Fossil klein watch","bracelet type"));
		proList.add(new Product("Ro01","Rollex","Sp03",25,2000,"Jwel statinless steel","Strap type"));
		proList.add(new Product("Qu01","Quartz","Sp04",25,2000,"stella","Strap type"));
		String jsonToString=gson.toJson(proList);
		return jsonToString;
	}
	
	

}
