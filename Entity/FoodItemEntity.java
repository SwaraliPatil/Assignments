@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double price;

    // Date and time on each entity
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    // Dummy image URL
    private String dummyImageUrl;

    // Constructors, getters, and setters
}
