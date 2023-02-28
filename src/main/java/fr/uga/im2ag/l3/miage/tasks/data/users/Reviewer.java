package fr.uga.im2ag.l3.miage.tasks.data.users;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Reviewer extends User {

    private Role role;

    public enum Role {
        MANAGER,
        CONTRIBUTOR,
        VIEWER
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviewer reviewer = (Reviewer) o;
        return role == reviewer.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
}
