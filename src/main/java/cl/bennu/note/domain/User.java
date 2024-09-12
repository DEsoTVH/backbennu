package cl.bennu.note.domain;

import cl.bennu.note.domain.base.BaseDomain;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class User extends BaseDomain {

    private String username;
    private String password;
    private boolean active;
    private Timestamp lastLogin;
    private Timestamp lastPassword;

}
