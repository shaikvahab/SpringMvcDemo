package com.example.springMvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //(controller)
public class HomeController {

	
	@ModelAttribute("course")
	public String courseName()
	{
		return "Java";
	}
	
    @RequestMapping("/")
    public String home ()
    {
    	System.out.println("the home method called..!");
        return "home";
    }

//    @RequestMapping("add")
    //(MVC example.)
    //servlet way.
//       public String add(HttpServletRequest req , HttpSession session){
//       System.out.println("the add method is calling");
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//       int num2 = Integer.parseInt(req.getParameter("num2"));
//       int result = num1 +num2;

//      System.out.println("the result is:"+ result);
//      session.setAttribute("result", result);
//      return "Result.jsp"; (view)
//    }

    // springBoot way.
//    public String add(int num1 , int  num2,  Model model) // (model)
//    {
//         int result = num1 + num2;
//         model.addAttribute("result", result);
//         return "Result.jsp";
//    }

    //modelAndView.
//    public ModelAndView add (int num1, int num2, ModelAndView mv) {
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }

//    public String alien (Alien alien, Model model)
//    {
//        model.addAttribute("alien", alien);
//        return "Result.jsp";
//    }

    
    @RequestMapping("addAlien")
    public String alien (Alien alien)
    {
        return "result";
    }
}
