package com.project.FoodWasteManagementProject.repository;

import com.project.FoodWasteManagementProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

  User findByUsername(String usenameString);
}
