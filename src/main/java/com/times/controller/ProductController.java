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
import com.times.dao.ProductDAO;
import com.times.model.Category;
import com.times.model.Product;

@Controller
public class ProductController
{
	@Autowired
	ProductDAO pdao;
	
	//--------------------adding the product-----------------------
	
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public ModelAndView addproduct(Model m) 
	{
		String[] s=pdao.showcategsupp();
		System.out.println(s[0]);
		m.addAttribute("catlist",s[0]);
		m.addAttribute("supplist",s[1]);		
		ModelAndView mv=new ModelAndView("addProduct","prdt",new Product());
		return mv;

	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addproduct(@ModelAttribute("prdt")Product prdt, HttpServletRequest request,RedirectAttributes attributes) 
	{
		System.out.println(prdt.getProductId());
		pdao.addProduct(prdt);
		
		String path="C:\\maven project\\TimeWaves\\src\\main\\webapp\\resources";
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
		return "Product";
	
	}
	//---------------Showing product-----------------
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView viewCatagory1(Model m)
	{
		ArrayList list=(ArrayList)pdao.showProduct();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		m.addAttribute("list",jsonInString);
		ModelAndView mv=new ModelAndView("Product","product",new Product());
		return mv;
	}

	@RequestMapping(value="/delproduct",method=RequestMethod.GET)
	public ModelAndView DeleteCatagory(@RequestParam("id")int cid,Model m)
	{
		pdao.deleteProduct(cid);
		ModelAndView mv=new ModelAndView("Product","product",new Product());
		return mv;
	}
	
	@RequestMapping(value="/editproduct",method=RequestMethod.GET)
	public ModelAndView editcategory(@RequestParam("id")int cid,Model m) 
	{
		Product s=pdao.viewProduct(cid);
		m.addAttribute("Product",s);
		ModelAndView mv=new ModelAndView("Product","Product",new Product());
		return mv;
	}
	
	@RequestMapping(value="/editproduct",method=RequestMethod.POST)
	public ModelAndView editcategory(Product typepro,Model m) 
	{
		pdao.updateCatagory(typepro);
		//m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("Product","product",new Product());
		return mv;

	}

}
