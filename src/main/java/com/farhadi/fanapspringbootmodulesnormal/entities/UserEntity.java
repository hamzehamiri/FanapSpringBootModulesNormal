package com.farhadi.fanapspringbootmodulesnormal.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user", schema = "cool_schema")
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "ISBN_NUMBER")
    private String isbn;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL/*,
            orphanRemoval = true*/)
    private List<AddressEntity> addressEntities;
}
