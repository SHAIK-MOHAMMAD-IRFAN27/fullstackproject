package com.enum3rate3.studentfeeservice.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class StudentBills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int billId;
    private String studentId;
}