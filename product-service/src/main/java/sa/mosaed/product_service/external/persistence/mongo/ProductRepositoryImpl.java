package sa.mosaed.product_service.external.persistence.mongo;

import sa.mosaed.product_service.core.domain.Product;
import sa.mosaed.product_service.core.repositories.ProductRepository;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 * @created 6/2/2024 at 01:43
 */
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Product findProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        return List.of();
    }

    @Override
    public void save(Product product) {

    }
}
