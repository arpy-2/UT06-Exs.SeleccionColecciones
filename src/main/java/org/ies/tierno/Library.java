package org.ies.tierno;

import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Library {

    private String name;
    private Map<String, Book> booksByIsbn;
    private List<Customer> customers;
    private List<BookLend> bookLends;
}
























