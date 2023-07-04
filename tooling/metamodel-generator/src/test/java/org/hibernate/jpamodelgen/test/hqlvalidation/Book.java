package org.hibernate.jpamodelgen.test.hqlvalidation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id String isbn;
    String title;
    String text;
}
