package com.enum3rate3.studentfeeservice.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "bills")
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String description;
    private int amount;
    private String billDate;
    private String deadline;


}
