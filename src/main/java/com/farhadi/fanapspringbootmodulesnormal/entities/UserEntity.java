package com.farhadi.fanapspringbootmodulesnormal.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user", schema = "hamzehschema")
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
