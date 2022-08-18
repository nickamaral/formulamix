package br.com.formulamix.produtosmix.products;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTOResponse> findAll() {
        return productRepository.findAll().stream().map(ProductDTOResponse::of).collect(Collectors.toList());
    }

    public void create(ProductDTORequest productDTORequest) {
ProductModel productModel= productDTORequest.createModel();
productRepository.save(productModel);
    }
}
