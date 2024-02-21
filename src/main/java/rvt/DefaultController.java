package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import ch.qos.logback.core.model.Model;
import javax.validation.Valid;
    

@Controller
public class DefaultController {
String index(@RequestParam(name = "name", required = false, defaultValue = "null") String name, Model model){
return "index";
}

@GetMapping(value = "/hello")
String hello(){
return "hello";
}

@GetMapping(value = "/about")
ModelAndView about(){
ModelAndView modelAndView = new ModelAndView("about");

//Metode priekš koda testēšanas

return modelAndView;
}
@GetMapping(value = "/Links")
String Links(){
return "Links";
}
@GetMapping(value = "/Experiment")
String Experiment(){
return "Experiment";
}
@GetMapping(value = "/test")
public ModelAndView testAction(){
ModelAndView modelAndView = new ModelAndView("test");
return modelAndView;
}
@GetMapping(value = "/registration")
public ModelAndView RegistartionPage(){
ModelAndView modelAndView = new ModelAndView("registration");
return modelAndView;
}

@PostMapping(value = "/registration")
public String registration(
@Valid @ModelAttribute("sudent") Student student,
BindingResult bindingResult
) {
if (bindingResult.hasErrors()){
return "registration/registration-page";
}
return "redirect:/register?succcess";
}
}