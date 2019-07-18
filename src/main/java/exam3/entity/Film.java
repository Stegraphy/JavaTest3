package exam3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {
    private static final  long serializable = 1L;

    private String title;
    private String description;
    private Integer languageId;
}
