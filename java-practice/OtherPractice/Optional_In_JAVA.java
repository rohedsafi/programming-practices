import java.util.Optional;
public class Optional_In_JAVA {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = testOptional("Tom" , 3);
       // optionalCat.get();// This line will throw a NullPointerException because optionalCat is empty
       // System.out.println("Cat's age: " + optionalCat.get().getAge());

        // if(optionalCat.isPresent()){
        //     System.out.println("Cat's age: " + optionalCat.get().getAge());
        // }else{
        //     System.out.println(0);
        // }

        // Cat myCat = optionalCat.orElse(new Cat("Default Cat", 0));
        // System.out.println("Cat's age: " + myCat.getAge());

       String catAge = optionalCat.map(Cat::getAge).orElse("0");
        System.out.println("Cat's age: " + catAge);
       
    }

    public static Optional<Cat> testOptional(String name , int age) {
        Cat cat = new Cat(name , age);
        return Optional.ofNullable(null);
        
    }
    
}

// // ---------- Pattern 1: Pass Optional through (controller decides) ----------
//     public Optional<User> getUserById(Long id) {
//         return userRepository.findById(id);
//     }

//     // ---------- Pattern 2: Unwrap + throw (⭐ RECOMMENDED for production) ----------
//     public User getUserOrThrow(Long id) {
//         return userRepository.findById(id)
//                 .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
//     }

//     // ---------- Pattern 3: Transform with map() ----------
//     public String getUserEmail(Long id) {
//         return userRepository.findById(id)
//                 .map(User::getEmail)                    // Optional<String>
//                 .orElse("unknown@email.com");           // default if missing
//     }