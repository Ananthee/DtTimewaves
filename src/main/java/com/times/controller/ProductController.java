package com.times.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.times.dao.CategoryDAO;
import com.times.dao.ProductDAO;
import com.times.dao.SupplierDAO;
import com.times.model.Category;
import com.times.model.Product;

@Controller
public class ProductController
{
	@Autowired
	ProductDAO pdao;
	
    @Autowired
    CategoryDAO cdao;
    
    @Autowired
    SupplierDAO sdao;
	
	
	public String getdata()
	{
		ArrayList list=(ArrayList)pdao.showProduct();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		return jsonInString;
	}
	
	//Adding a product
	
	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public ModelAndView addProduct(Model m) 
	{
		Gson gson = new Gson();
		String catlist=gson.toJson(cdao.DisplayCategory());
		String supplist=gson.toJson(sdao.showSupplier());
		m.addAttribute("catlist",catlist);
		m.addAttribute("supplist",supplist);		
		ModelAndView mv=new ModelAndView("addProduct","prdt",new Product());
		return mv;

	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView  addproduct(@ModelAttribute("prdt")Product prdt, HttpServletRequest request,RedirectAttributes attributes,Model m) 
	{
		System.out.println("Controller called");
		System.out.println(prdt.getProductId());
		
		pdao.addProduct(prdt);
		
		String path="C:\\maven project\\TimeWaves\\src\\main\\webapp\\resources\\";
		path=path+String.valueOf(prdt.getProductId())+".jpg";
		System.out.println(path);
		File f=new File(path);
		MultipartFile filedet=prdt.getPimage();
		
		if(!filedet.isEmpty())
		{
			try
			{
			  byte[] bytes=filedet.getBytes();
			  System.out.println(bytes.length);
			  FileOutputStream fos=new FileOutputStream(f);
              BufferedOutputStream bs=new BufferedOutputStream(fos);
              bs.write(bytes);
              bs.close();
              System.out.println("File Uploaded Successfully");
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised"+e);
			}
		}
		else
		{
			System.out.println("File is Empty not Uploaded");
			
		}
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewProduct","product",new Product());
		return mv;
	
	}
	//Display the product
	
	@RequestMapping(value="/viewProduct",method=RequestMethod.GET)
	public ModelAndView viewProduct(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewProduct","product",new Product());
		return mv;
	}

	@RequestMapping(value="/deleteProduct",method=RequestMethod.GET)
	public ModelAndView DeleteProduct(@RequestParam("id")String productId,Model m)
	{
		pdao.deleteProduct(productId);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewProduct","showProduct",new Product());
		return mv;
	}
	
	@RequestMapping(value="/editProduct",method=RequestMethod.GET)
	public ModelAndView editProduct(@RequestParam("id")String productId,Model m) 
	{
		Product s=pdao.showProduct(productId);
		Gson gson = new Gson();
		String catlist=gson.toJson(cdao.DisplayCategory());
		String supplist=gson.toJson(sdao.showSupplier());
		m.addAttribute("catlist",catlist);
		m.addAttribute("supplist",supplist);		
		ModelAndView mv=new ModelAndView("editProduct","product",s);
		return mv;

	}
	
	@RequestMapping(value="/UpdateProduct",method=RequestMethod.POST)
	public ModelAndView UpdateProduct(Product product,Model m) 
	{
		System.out.println("Controller called");
		System.out.println(product.getProductId());
		pdao.editProduct(product);
		String path="C:\\maven project\\TimeWaves\\src\\main\\webapp\\resources\\";
		path=path+String.valueOf(product.getProductId())+".jpg";
		System.out.println(path);
		File f=new File(path);
		MultipartFile filedet=product.getPimage();
		
		if(!filedet.isEmpty())
		{
			try
			{
			  byte[] bytes=filedet.getBytes();
			  System.out.println(bytes.length);
			  FileOutputStream fos=new FileOutputStream(f);
              BufferedOutputStream bs=new BufferedOutputStream(fos);
              bs.write(bytes);
              bs.close();
              System.out.println("File Uploaded Successfully");
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised"+e);
			}
		}
		else
		{
			System.out.println("File is Empty not Uploaded");
			
		}
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewProduct","product",new Product());
		return mv;
	

	}
	
	/*@SuppressWarnings("unchecked")
	@RequestMapping(value="/ppage")
	public String productPage(Model m)
	{
		ArrayList<Product> list=(ArrayList<Product>)pdao.showProduct();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		m.addAttribute("list",jsonInString);
		return "productPage";
		
	}*/
	
	@RequestMapping(value="/ProductDescription",method=RequestMethod.GET)
	public ModelAndView deleteSeller(@RequestParam("id")String categoryId,Model m)
	{
		System.out.println(categoryId);
		Product p=pdao.getproductdata(categoryId);
		Gson gson = new Gson();
		String list=gson.toJson(p);
		System.out.println(list);
		m.addAttribute("list1",list);
		ModelAndView mv=new ModelAndView("ProductDescription","product",new Product());
		return mv;
	}


}
