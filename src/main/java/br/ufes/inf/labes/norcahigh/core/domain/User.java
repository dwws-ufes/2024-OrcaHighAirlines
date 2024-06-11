package br.ufes.inf.labes.norcahigh.core.domain;

import br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport;
import jakarta.inject.Inject;
import jakarta.persistence.Entity;
import jakarta.security.enterprise.identitystore.Pbkdf2PasswordHash;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class User extends PersistentObjectSupport {

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 100)
    private String email;

    @NotNull
    @Size(max = 128)
    private String password;

    private Role role;

    public User() {

    }

    public User(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return (name + " (" + email + ")");
    }
}
