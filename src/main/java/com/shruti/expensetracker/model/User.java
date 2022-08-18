package com.shruti.expensetracker.model;

import java.util.Set;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expenseUser")
public class User {

    @Id
    private String id;

    private String  name;

    private String email;

}