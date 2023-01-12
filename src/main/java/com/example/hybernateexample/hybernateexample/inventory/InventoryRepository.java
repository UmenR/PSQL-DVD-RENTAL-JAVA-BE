package com.example.hybernateexample.hybernateexample.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Inventory> {
}
