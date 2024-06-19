package sa.mosaed.product_service.presentation;

import org.springframework.web.bind.annotation.*;
import sa.mosaed.product_service.core.domain.Product;
import sa.mosaed.product_service.core.domain.ProductService;

import java.util.List;

/**
 * @author MOSAED ALOTAIBI
 * @created 5/29/2024 at 04:18
 */

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addNewProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
