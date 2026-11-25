package pl.edu.vistula.firstrestapispring.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest r) { return new Product(r.getName()); }
    public Product toProduct(Product product, UpdateProductRequest r) {
        product.setName(r.getName());
        return product;
    }
    public ProductResponse toProductResponse(Product p) {
        return new ProductResponse(p.getId(), p.getName());
    }
}

