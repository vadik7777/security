package my.example.springsecurityjpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private Boolean active;
    private String roles;
}
