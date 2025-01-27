package web.javaproject.fooddeliveryapp.service;

import org.springframework.scheduling.annotation.Async;
import web.javaproject.fooddeliveryapp.dto.RestaurantDTO;
import web.javaproject.fooddeliveryapp.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<RestaurantDTO> findAll();
    RestaurantDTO findById(Long id);
    public Restaurant getRestaurant(Long restaurantId);
    public Restaurant getRestaurantByEmail(String email);
    public Restaurant createRestaurant(Restaurant restaurant);
    RestaurantDTO save(RestaurantDTO restaurant);
    void deleteById(Long id);

    @Async
    void notifyRestaurantUpdate(Long restaurantId);
//    void update(RestaurantDTO restaurantDTO);
}
