package sa.mosaed.product_service.core.repositories;

import sa.mosaed.product_service.core.domain.Product;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 * @created 6/2/2024 at 01:48
 */
public interface ProductRepository {

    Product findProductById(Long id);

    List<Product> findAllProducts();

    void save(Product product);
}
