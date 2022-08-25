package br.com.formulamix.produtosmix.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<ProductDTOResponse> findAll(){
        return productService.findAll();
    }
    @PostMapping
    public void create(@RequestBody @Valid ProductDTORequest productDTORequest) {
        productService.create(productDTORequest);
    }
    @GetMapping("/{id}")
    public ProductDTOResponse findById(@PathVariable Long id){
        return productService.findById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);

    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody @Valid ProductDTORequest productDTORequest){
        productService.updateById(id, productDTORequest);

    }

    @PatchMapping("/{id}")
    public void patchById(@PathVariable Long id, @RequestBody @Valid UpdateProductDTORequest updateProductDTORequest){
        productService.updateById(id, updateProductDTORequest);
    }

}
