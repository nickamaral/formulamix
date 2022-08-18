package br.com.formulamix.produtosmix.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTORequest {
    @NotEmpty(message = "Deve ter um titulo")
    private String title;
    private String description;
    private BigDecimal value;
    private Integer quantity;

    public ProductModel createModel() {
        return ProductModel.builder().title(title).description(description).value(value).quantity(quantity)
                .build();
    }
}
