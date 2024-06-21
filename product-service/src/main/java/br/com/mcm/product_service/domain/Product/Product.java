package br.com.mcm.product_service.domain.Product;

import br.com.mcm.product_service.domain.category.Category;
import br.com.mcm.product_service.domain.productsupplier.ProductSupplier;

import java.time.LocalDate;

public class Product {
    private String id;
    private String name;
    private String description;
    private boolean active;
    private double price;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private ProductSupplier productSupplier;
    private Category category;
}
