package pl.javastart.filmueb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javastart.filmueb.model.userRelated.Role;
import pl.javastart.filmueb.model.userRelated.User;
import pl.javastart.filmueb.model.userRelated.UserRole;
import pl.javastart.filmueb.repositories.UserRepository;
import pl.javastart.filmueb.repositories.UserRoleRepository;

@Controller
public class RoleController {

    private UserRoleRepository roleRepository;
    private UserRepository userRepository;

    @GetMapping("/admin")
    public String login() {
        return "admin";
    }

    @PostMapping("/admin")
    public String addRole(long id, Role role) {
        UserRole userRole = new UserRole();
        User user = userRepository.findOne(id);
        userRole.setUsername(user.getUsername());
        userRole.setRole(role);
        roleRepository.save(userRole);
        return "Dodano!";
    }
}
