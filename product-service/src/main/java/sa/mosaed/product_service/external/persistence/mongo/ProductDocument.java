package sa.mosaed.product_service.external.persistence.mongo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author MOSAED ALOTAIBI
 * @created 5/29/2024 at 04:14
 */

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductDocument {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
