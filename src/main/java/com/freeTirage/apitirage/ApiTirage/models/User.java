package com.freeTirage.apitirage.ApiTirage.models;

import javax.persistence.*;

import lombok.*;

@Data
@Table(name = "users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstname;
    String lastname;
    String email;

}
