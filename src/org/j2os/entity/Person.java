package org.j2os.entity;

import javax.persistence.*;

@Table(name = "person")
@Entity(name = "person")
public class Person {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String name;

    public long getId() {
        return id;
    }

    public Person setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
