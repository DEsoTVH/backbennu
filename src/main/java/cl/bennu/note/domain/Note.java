package cl.bennu.note.domain;

import cl.bennu.note.domain.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Note extends BaseDomain {
    private Long categoryId;
    private Long noteTypeid;
//    private NoteType noteType;
    private Long labelId;
    private Long statusId;
    private String code;
    private String shortName;
    private String name;
    private boolean deleted;
    private boolean active;
}
