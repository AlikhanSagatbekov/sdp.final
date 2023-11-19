Let's take a closer look at the role of each design pattern used in this project:

1. **Singleton (Single):**
- **Role:** Ensures that the application has only one instance of the `DatabaseManager` responsible for managing the database of products and orders.
- **Application:** In this context, it is used to provide a single access point to the database and prevent the creation of duplicates.

2. **Factory Method (Factory method):**
- **Role:** Provides an interface for creating instances of `Medicine` classes of various types (for example, `Antibiotic` and `Painkiller`).
- **Application:** Used to create specific products (medicines) without linking the client to specific classes.

3. **Observer:**
- **Role:** Allows objects (observers) to react to changes in other objects (observed).
- **Application:** The client (observer) receives a notification of a change in the status of the order and takes appropriate actions.

4. **Command (Command):**
- **Role:** Isolates the operation request from the sender of the request, allowing parameterization of client objects with different requests.
- **Application:** Used to encapsulate a request to add a product to the cart as a `Command` object that can be easily passed and executed.

5. **Strategy:**
- **Role:** Defines a family of algorithms, encapsulates each of them and makes them interchangeable. Allows you to change the algorithm independently of the client that uses it.
- **Application:** Used to select a delivery strategy when placing an order, allowing you to easily add new strategies.

6. **Decorator:**
- **Role:** Dynamically adds new responsibilities to objects. Provides flexibility superior to static inheritance.
- **Application:** Allows you to add additional options (for example, gift wrapping or discount) to an order without changing its basic structure.

Each of these patterns plays an important role in creating a flexible, extensible and easily maintained system for managing an online pharmacy. They jointly provide a division of responsibility, increase the flexibility and abstraction level of the system.

