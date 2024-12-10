package org.sid.chatbotrag.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 4, max = 50)
    private String name;

    @Email
    private String email;

    // Constructeur privé pour le Builder
    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
    }

    public Person() {

    }

    // Méthode statique pour créer un Builder
    public static Builder builder() {
        return new Builder();
    }

    // Getter et Setter si nécessaire (sinon uniquement accessibles via le Builder)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Classe interne Builder
    public static class Builder {
        private Long id;
        private String name;
        private String email;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
