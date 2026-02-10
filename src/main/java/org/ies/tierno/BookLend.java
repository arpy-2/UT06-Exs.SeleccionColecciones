package org.ies.tierno;

import java.time.LocalDate;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class BookLend {

    private String isbn;
    private LocalDate date;
    private String nif;
}
