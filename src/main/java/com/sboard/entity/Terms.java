package com.sboard.entity;


import com.sboard.dto.TermsDTO;
import com.sboard.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "terms")
public class Terms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;
    @Column(columnDefinition = "TEXT")
    private String terms;
    @Column(columnDefinition = "TEXT")
    private String privacy;

    public TermsDTO toDTO(){
        return TermsDTO.builder()
                .seq(seq)
                .terms(terms)
                .privacy(privacy)
                .build();
    }
}
