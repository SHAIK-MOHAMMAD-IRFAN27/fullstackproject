package com.enum3rate3.studentfeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name ="domains")
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dominId;

    private String program;
}
