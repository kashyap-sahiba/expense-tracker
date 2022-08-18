package com.shruti.expensetracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Data
@Table(name="expense")
public class Expense {

    @Id
    private Long id;

    private Instant expensedate;

    private String description;

    private String location;

    @ManyToOne
    private Category category;

    @JsonIgnore
    @ManyToOne
    private User user;


}