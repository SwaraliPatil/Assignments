@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User user) {
        // Validation and user creation logic
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // Additional endpoints for user-related operations
}
