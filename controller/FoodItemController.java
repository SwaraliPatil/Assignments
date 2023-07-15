@RestController
@RequestMapping("/api/food-items")
public class FoodItemController {
    private final FoodItemService foodItemService;

    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping
    public ResponseEntity<FoodItem> createFoodItem(@RequestBody FoodItem foodItem) {
        // Validation and food item creation logic (only for admin)
        FoodItem savedFoodItem = foodItemService.saveFoodItem(foodItem);
        return ResponseEntity.ok(savedFoodItem);
    }

    @GetMapping
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        return ResponseEntity.ok(foodItems);
    }

    // Additional endpoints for food item-related operations
}
