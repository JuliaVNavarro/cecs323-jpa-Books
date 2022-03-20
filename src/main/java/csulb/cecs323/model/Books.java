package csulb.cecs323.model;
import javax.persistence.*;
@Entity
public class Books {
    @Id
    @Column(nullable = false, length = 17)
    private String ISBN;

    @Column (nullable = false, length = 80)
    private String title;

    @Column (nullable = false)
    private int year_published;

    @Column (nullable = false, length = 30)
    private String authoring_entity_name;

    @Column (nullable = false, length = 80)
    private String publisher_name;

    @ManyToOne
    @JoinColumn(name = "authoring_entity_name", referencedColumnName = "name", nullable = false)
    private Authoring_Entities Authoring_Entities;

    @ManyToOne
    @JoinColumn (name = "publisher_name", referencedColumnName = "name", nullable = false)
    private Publisher Publisher;

    public Books(String ISBN, String title, int year_published, String authoring_entity_name, String publisher_name){
        this.ISBN = ISBN;
        this.title = title;
        this.year_published = year_published;
        this.authoring_entity_name = authoring_entity_name;
        this.publisher_name = publisher_name;

    }


}
