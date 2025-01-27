package web.javaproject.fooddeliveryapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends User {

    @Setter
    @Getter
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    @Column(unique = true)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Order> orders;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<CourierReview> courierReviews;

    @Setter
    @Getter
    @NotBlank(message = "Address cannot be blank")
    private String address;

    // inject moment of bean init
    @Transient
    @Getter
    @Value("#{T(java.time.LocalDateTime).now()}")
    private LocalDateTime createdTime;

    public Client() {}

    public Client(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
