package csulb.cecs323.model;

import javax.persistence.*;

@Entity
public class Authoring_Entities {
    @Id
    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 31)
    private String authoring_entity_type;

    @Column (nullable = false, length = 80)
    private String name;

    @Column (nullable = false, length = 80)
    private String head_writer;

    @Column(nullable = false)
    private int year_formed;


}
