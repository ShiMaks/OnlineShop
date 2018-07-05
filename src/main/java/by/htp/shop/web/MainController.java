package by.htp.shop.web;

import by.htp.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static sun.security.jgss.GSSUtil.login;

@Controller
public class MainController {

//	@RequestMapping(value = "/admin", method = RequestMethod.GET)
//	public String adminPage() {
//		return "";
//	}
//
//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	public String userPage() {
//		return "user-main";
//	}
//
//	@RequestMapping(value = "/error", method = RequestMethod.GET)
//	public String accessDeniedPage() {
//		return "error";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String loginPage() {
//		return "login";
//	}
//
//	@RequestMapping(value="/logout", method = RequestMethod.GET)
//	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		if (auth != null){
//			new SecurityContextLogoutHandler().logout(request, response, auth);
//		}
//		return "login";
//	}

}
