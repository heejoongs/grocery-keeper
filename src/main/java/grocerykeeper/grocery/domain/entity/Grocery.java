package grocerykeeper.grocery.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
public class Grocery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String manufacturer;

    @Column
    private Integer availableDays = 0;

    @Column
    private Boolean entered = false;

    @Column
    private LocalDateTime enteredAt = LocalDateTime.of(2022, 1, 1, 0, 0);

    private LocalDateTime createdAt;
    protected Grocery() {}

    public Grocery(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.createdAt = LocalDateTime.now();
    }
}