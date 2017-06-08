package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginServlet {
    @RequestMapping("/login.do")
    public String login(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
    		return "index.jsp";
	}
}
