package sa.mosaed.product_service.core.domain;

import java.math.BigDecimal;

/**
 * @author MOSAED ALOTAIBI
 * @created 6/2/2024 at 01:47
 */
public class Product {
    private final long productId;
    private final String name;
    private final String description;
    private final BigDecimal price;


    public Product(long productId, String name, String description, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
