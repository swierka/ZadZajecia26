package pl.javastart.filmueb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.javastart.filmueb.model.userRelated.Role;
import pl.javastart.filmueb.model.userRelated.User;
import pl.javastart.filmueb.model.userRelated.UserRole;
import pl.javastart.filmueb.repositories.UserRepository;
import pl.javastart.filmueb.repositories.UserRoleRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository roleRepository;

    @GetMapping("/registrationForm")
    public String registerUser(Model model){
        User newUser = new User();
        model.addAttribute("user",newUser);
        return "registration";
    }

    @PostMapping("/rejestracja")
    public String addUser(User user) {
        user.setEnabled(true);
        userRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setUsername(user.getUsername());
        userRole.setRole(Role.USER);
        roleRepository.save(userRole);
        return "redirect:/";
    }
}
