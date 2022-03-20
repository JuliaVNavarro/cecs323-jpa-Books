package csulb.cecs323.model;
import javax.persistence.*;

@Entity
public class Writing_Group {
    @Id
    @Column (nullable = false, length = 80)
    private String head_writer;

    @Column(nullable = false)
    private int year_formed;
}
