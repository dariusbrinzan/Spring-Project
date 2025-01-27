package web.javaproject.fooddeliveryapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
@Table(name = "couriers")
public class Courier extends User {
    @Setter
    private String phoneNumber;
    @Setter
    private boolean available;

    public Courier() {}

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courier")
    private List<Order> orders;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courier")
    private List<CourierReview> courierReviews;

    public Courier(String name, boolean available, String phoneNumber) {
        this.name = name;
        this.available = available;
        this.phoneNumber = phoneNumber;
    }
}