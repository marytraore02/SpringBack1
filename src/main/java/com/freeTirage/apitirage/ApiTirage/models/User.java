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
    int id;
    String firstname;
    String lastname;
    String email;

}
