package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.DemoService;

@RestController
public class DemoController {
	@Autowired 
	DemoService service = new DemoService();
	
	public DemoController() {
		// TODO Auto-generated constructor stub
	System.out.println(service.getInti());
	}
	
	@RequestMapping("organization")
	public String functionTCS()
	{
		//System.out.println("TCS");
		return "organization.jsp";
	}
	
	@RequestMapping("project")
	public String functionFCA()
	{
		//System.out.println("FCA");
		return "project.jsp";
	}
	
	@PostMapping("organization/add")
	public String addOrg(@RequestBody String name)
	{
		return name;
	}
}
