package com.dao;

import java.util.List;

import com.model.Restaurant;

public interface RestaurantDao {

	void addRestaurant(Restaurant restaurant);

	Restaurant getRestaurant(int restaurantId);

	void updateRestaurant(Restaurant restaurant);

	void deleteRestaurant(int restaurantId);

	List<Restaurant> getAll();

	int getRestaurantId(int restaurantOwnerId);
}