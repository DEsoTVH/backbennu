package cl.bennu.note.domain;

import cl.bennu.note.domain.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Category extends BaseDomain {

    private Long userId;
    private Long labelId;
    private String name;
    private Boolean active;
    private Long categoryId;

}
