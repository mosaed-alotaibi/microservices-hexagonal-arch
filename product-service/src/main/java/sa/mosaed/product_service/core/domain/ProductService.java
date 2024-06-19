package sa.mosaed.product_service.core.domain;

import sa.mosaed.product_service.core.repositories.ProductRepository;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 * @created 6/2/2024 at 01:47
 */
public interface ProductService {

    void addProduct(Product product);

    Product getProductById(Long productId);

    List<Product> getAllProducts();
}
