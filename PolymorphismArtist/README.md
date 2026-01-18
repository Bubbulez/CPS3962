## PolymorphismArtist – Project Reflection

### What this project does
This project demonstrates polymorphism in Java through the use of an abstract base class called `Shape` and three concrete subclasses: `Square`, `Circle`, and `Triangle`. Each subclass overrides the `drawYourself()` method to provide its own specific behavior. While the method name remains the same across all classes, the output differs depending on which object is being referenced. The `PolymorphismArtist` class acts as the main driver of the program, where each shape is created using the parent `Shape` type and then tested by calling `drawYourself()` on each object.

The structure of this project reflects how polymorphism works in practice. Even though the variables are declared using the same parent type, Java determines which version of the method to execute at runtime based on the actual object being instantiated. This allows the program to treat all shapes uniformly while still producing different behavior. When the program runs, each shape prints a unique message to the console, confirming that the correct overridden method is being executed.

### Explanation of each class
The `Shape` class is an abstract class that defines the method `drawYourself()` without providing an implementation. Its purpose is to establish a common contract that all shape subclasses must follow. The `Square`, `Circle`, and `Triangle` classes each extend `Shape` and provide their own implementation of `drawYourself()`, which outputs a message indicating which shape is being drawn. The `PolymorphismArtist` class contains the `main` method, where objects of each shape type are created using the `Shape` reference and tested. Together, these classes demonstrate the relationship between abstraction, inheritance, and polymorphism in Java.

### What I learned
Through this project, I gained a clearer understanding of how polymorphism functions beyond just theory. I learned that using the parent class as the reference type is essential to demonstrating polymorphism correctly, since it allows multiple objects to be handled in a consistent way while still maintaining distinct behaviors. I also developed a stronger understanding of abstract classes and why they are useful when designing a system that enforces shared behavior across multiple subclasses. Additionally, I learned the importance of method overriding and how annotations like `@Override` help ensure that methods are implemented correctly and intentionally.

This project also helped reinforce how Java makes decisions at runtime. Seeing the same method call produce different outputs depending on the object helped solidify my understanding of dynamic method dispatch, which was something I previously found abstract and difficult to visualize.

### What was confusing at first
At the beginning of this project, several aspects were confusing. One of the biggest challenges was understanding why objects were being declared using the `Shape` type instead of their specific class types, such as `Square` or `Circle`. It initially felt counterintuitive to reference an object as something more general rather than its exact type. Abstract methods were also difficult to grasp, especially because they contain no executable code and rely entirely on subclasses for implementation. The purpose of the `@Override` annotation was another point of confusion, as it seemed optional at first, but I later realized how valuable it is for preventing subtle errors and clarifying developer intent.

Relearning Java itself was also challenging. A significant portion of the semester was focused on hardware concepts and operating systems rather than writing object-oriented code. Transitioning back into Java programming required me to slow down and revisit foundational concepts that I had not practiced consistently. This made the project take longer than expected, as I wanted to understand how everything worked together rather than simply completing the task mechanically.

Overall, this project took me some time to complete, largely because I spent time reviewing concepts, asking questions, and working through points of confusion. By the end of the assignment, the relationships between the classes and the purpose of polymorphism became much clearer. Completing this project helped rebuild my confidence in Java and reinforced the importance of understanding core object-oriented principles!


Delali Doe
Computer Science (Kean University)
1/18/2026
