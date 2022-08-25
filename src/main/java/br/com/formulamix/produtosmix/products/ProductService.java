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

    public ProductDTOResponse findById(Long id) {
        ProductModel productModel = getById(id);
        return ProductDTOResponse.of(productModel);
    }

    public void deleteById(Long id) {
        ProductModel productModel = getById(id);
        productRepository.delete(productModel);

    }
    private ProductModel getById(Long id){
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }
}
