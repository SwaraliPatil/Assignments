@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Only admin can create food items, so no additional methods required
}
