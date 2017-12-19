package pl.javastart.filmueb.model.userRelated;

import javax.persistence.*;

@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    public UserRole() {
    }

    public UserRole(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
