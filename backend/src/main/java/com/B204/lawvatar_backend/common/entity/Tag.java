package com.B204.lawvatar_backend.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Tag {

    // Field
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long Id;

    @OneToMany(mappedBy = "tag")
    private List<LawyerTag> lawyers = new ArrayList<>();



}
