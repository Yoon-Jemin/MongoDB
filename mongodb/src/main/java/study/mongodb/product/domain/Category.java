package study.mongodb.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@Builder
public class Category {

    @Id
    private String id;
    private String name;
    private String description;

}
