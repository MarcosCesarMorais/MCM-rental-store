package br.com.mcm.product_service.domain.category;

import br.com.mcm.product_service.domain.enumerations.CategoryType;
import br.com.mcm.product_service.domain.productsupplier.ProductSupplier;

import java.time.LocalDate;

public class Category {

    private String id;
    private String name;
    private String description;
    private boolean active;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Enum<CategoryType> categoryType;

}
