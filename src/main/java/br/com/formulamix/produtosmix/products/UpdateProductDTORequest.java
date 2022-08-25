package br.com.formulamix.produtosmix.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductDTORequest {


    private BigDecimal value;
    private Integer quantity;

    public ProductModel createModel() {
        return ProductModel.builder().value(value).quantity(quantity)
                .build();
    }
}
