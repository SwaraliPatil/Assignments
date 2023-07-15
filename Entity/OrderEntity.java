@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long foodItemId;
    private Long userId;
    private int quantity;

    // Date and time on each entity
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    // Status: created, dispatched, delivered
    private String status;

    // Constructors, getters, and setters
}
