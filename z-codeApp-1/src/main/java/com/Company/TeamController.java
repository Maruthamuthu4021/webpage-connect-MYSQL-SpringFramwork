package com.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeamController {


	 @Autowired
     private teamRepository teamrepo;
	 
	 @Autowired
	 private teamService teamserv;
	 
	 @GetMapping("/")
	    public String view() {
	        return "Login";
	    }
	 @GetMapping("/index")
	    public String index() {
	        return "index";
	    }
	    @GetMapping("/view")
	    public ModelAndView viewHomePage() {
	    	ModelAndView mav=new ModelAndView("viewTeamDetails");
	    	List<Teamreport> l=teamrepo.findAll();
	    	mav.addObject("team", l);
	        return mav;
	    }
	    @GetMapping("/add")
	    public ModelAndView add(Teamreport t) {
	    	ModelAndView mav=new ModelAndView("Add");
	    	return mav;
	    }
	    @RequestMapping(value = "/added")
	    public ModelAndView added(Teamreport t) {
	    	teamrepo.save(t);
	    	ModelAndView mav=new ModelAndView("index");
	    	return mav;
	    }
	    @GetMapping(value = "/filter")
	    public String Filter(Model m,String key) {
	    	m.addAttribute("search",teamserv.getKeyword(key));
	    	return "FilterTable";
	    }
	    @RequestMapping("/delete/{id}")
	    public String deletestudent(@PathVariable(name = "id") int id) {
	    	teamserv.delete(id);
	        return "redirect:/";
	    }
}
