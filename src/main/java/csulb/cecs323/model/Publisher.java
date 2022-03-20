package csulb.cecs323.model;
//name: String
//phone: String
//email: String
import javax.persistence.*;
@Entity
public class Publisher {
    @Id
    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, length = 80)
    private String phone;

    @Column (nullable = false, length = 24)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Books books;

    public Publisher (Books book, String name, String phone, String email){
        this.books = book;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public Publisher(){}

    public String toString(){
        return "\n\nBook: " + books + "\nName: " + name + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
