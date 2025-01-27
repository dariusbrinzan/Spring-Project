package web.javaproject.fooddeliveryapp.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}