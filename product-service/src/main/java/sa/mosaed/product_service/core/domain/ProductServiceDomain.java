package sa.mosaed.product_service.core.domain;

import sa.mosaed.product_service.core.repositories.ProductRepository;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 * @created 6/2/2024 at 03:44
 */
public class ProductServiceDomain implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceDomain(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(Long productId) {
        return productRepository.findProductById(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAllProducts();
    }
}
