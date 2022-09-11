package com.farhadi.fanapspringbootmodulesnormal.entities;

import com.farhadi.fanapspringbootmodulesnormal.repositories.listeners.AddressListener;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address" , schema = "cool_schema")
@EntityListeners(AddressListener.class)
@Setter
@Getter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address_type")
    private String address_type;

    @Column(name = "address_name")
    private String address_name;

    @ManyToOne(fetch = FetchType.LAZY /*, cascade = CascadeType.REMOVE*/)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;
}
