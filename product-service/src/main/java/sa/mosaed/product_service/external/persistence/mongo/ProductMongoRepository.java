package sa.mosaed.product_service.external.persistence.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author MOSAED ALOTAIBI
 * @created 5/29/2024 at 04:17
 */
public interface ProductMongoRepository extends MongoRepository<ProductDocument, String> {
}
