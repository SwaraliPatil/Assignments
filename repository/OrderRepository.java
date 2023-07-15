@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Only users can give orders, so no additional methods required
}
