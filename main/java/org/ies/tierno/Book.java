package org.ies.tierno;

import java.util.Set;
import lombok.Data;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
public class Book {

    private String isbn;
    private String title;
    private String author;
    private Set<String> genres;
}
