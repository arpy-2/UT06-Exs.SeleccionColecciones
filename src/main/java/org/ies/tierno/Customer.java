package org.ies.tierno;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Customer {

    private String nif;
    private String name;
    private String surname;
    private int customerNumber;
    private int zipCode;
}

