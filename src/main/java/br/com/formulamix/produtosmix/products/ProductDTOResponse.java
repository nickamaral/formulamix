package br.com.formulamix.produtosmix.products;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTOResponse {
    private Long id;
    private String title;
    private String description;
    private BigDecimal value;
    private Integer quantity;

    public static ProductDTOResponse of(ProductModel productModel) {
        return new ProductDTOResponseBuilder().id(productModel.getId())
                .description(productModel.getDescription())
                .title(productModel.getTitle())
                //.tittle("xxxxx")
                .quantity(productModel.getQuantity())
                .value(productModel.getValue()).build();

    }
}
