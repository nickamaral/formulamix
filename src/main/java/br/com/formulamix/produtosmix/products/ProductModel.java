package br.com.formulamix.produtosmix.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder
@Table(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "description",length = 500)
    private String description;
    private BigDecimal value;
    private Integer quantity;
}
