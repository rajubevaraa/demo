package com.micro.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.micro.inventoryservice.model.Inventory;
import com.micro.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_13");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone_13_red");
            inventory1.setQuantity(0);
            
            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("redmi10");
            inventory2.setQuantity(10);

            Inventory inventory3 = new Inventory();
            inventory3.setSkuCode("redmi11");
            inventory3.setQuantity(0);
            
            
            
            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
            inventoryRepository.save(inventory3);
        };
    }
}
