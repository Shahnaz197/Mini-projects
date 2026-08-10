# Java Fundamentals & OOP Practice

A collection of small Java exercises and mini-projects created while learning and practicing core Java programming concepts.

This repository focuses on building a strong understanding of **Java fundamentals, object-oriented programming, collections, and basic class design** through practical examples.

## 📚 Topics Covered

* Java classes and objects
* Constructors
* Encapsulation
* Getters and setters
* `static` members
* Method overloading
* Method overriding
* Inheritance
* Polymorphism
* Interfaces
* Abstraction
* `ArrayList`
* `HashMap`
* Nested collections
* Searching and sorting collections
* Basic object management
* Iteration and collection traversal

## 📁 Project Structure

```text
Mini-projects/
└── src/
    ├── ArrayList/
    │   ├── Main.java
    │   ├── ProductManager.java
    │   ├── ShoppingCart.java
    │   └── StudentList.java
    │
    ├── ArrayNHashmix/
    │   └── Library.java
    │
    ├── Hashmap/
    │   └── GradeBook.java
    │
    ├── Inheritance/
    │   ├── Bike.java
    │   ├── Car.java
    │   ├── Main.java
    │   └── Vehicle.java
    │
    ├── interfNabs/
    │   ├── Calculator.java
    │   ├── Designer.java
    │   ├── Developer.java
    │   ├── Main.java
    │   └── Workable.java
    │
    ├── Calculator.java
    ├── GymMembership.java
    ├── Hotel.java
    ├── Printer.java
    ├── Product.java
    ├── School.java
    ├── Shop.java
    └── Student.java
```

## 🧩 Examples Included

### ArrayList

The `ArrayList` package contains several exercises focused on storing and manipulating collections of objects or values.

#### Product Manager

Demonstrates:

* Adding products
* Returning a list of products
* Filtering products by their starting letter
* Counting products

#### Shopping Cart

A simple shopping-cart example demonstrating:

* Adding items
* Removing items
* Displaying items
* Counting items

#### Student List

Demonstrates common `ArrayList` operations including:

* Adding students
* Removing students
* Sorting students
* Searching for a student
* Displaying the collection

---

### HashMap

#### Grade Book

A simple grade-management example using:

```java
HashMap<String, Double>
```

The student's name is used as the key and their grade is stored as the value.

Operations include:

* Adding grades
* Retrieving a student's grade
* Removing students
* Displaying all grades
* Calculating the average grade

---

### ArrayList + HashMap

#### Library

Demonstrates a nested collection:

```java
HashMap<String, ArrayList<String>>
```

The structure represents:

```text
Genre → Books
```

For example:

```text
Fiction
    Harry Potter
    Narnia

Science
    Brief History of Time
    A Short History of Nearly Everything
```

The example supports:

* Adding books to genres
* Displaying books from a specific genre
* Displaying all genres and their books
* Counting the total number of books

---

### Inheritance & Polymorphism

The `Inheritance` package demonstrates a simple class hierarchy:

```text
Vehicle
├── Car
└── Bike
```

`Vehicle` provides common properties and behaviour, while `Car` and `Bike` extend the class with their own functionality.

The examples demonstrate:

* Inheritance using `extends`
* Calling a superclass constructor using `super`
* Method overriding using `@Override`
* Runtime polymorphism
* Encapsulation of the `speed` field

---

### Interfaces & Abstraction

The `interfNabs` package contains examples involving interfaces and abstract behaviour.

It includes:

* `Workable`
* `Developer`
* `Designer`
* `Calculator`
* `Main`

These examples are used to practice designing classes around shared behaviour and implementing interfaces.

---

### Encapsulation & Static Members

Several standalone classes demonstrate object-oriented concepts through simple real-world examples.

#### `GymMembership`

Demonstrates:

* Private instance fields
* Getters and setters
* Static fields
* Controlling shared state through methods

#### `Hotel`

Demonstrates:

* Constructors
* Encapsulation
* Static shared data
* Room booking and room count management

#### `Product`

A simple product class demonstrating:

* Constructors
* Private fields
* Getters and setters

#### `School`

Demonstrates managing shared student counts and revenue using static and instance fields.

---

### Method Overloading

#### `Printer`

Demonstrates method overloading by providing multiple `message()` methods with different parameter lists.

Examples include:

```java
message(String msg)
message(String msg, int times)
message(boolean uppercase, String msg)
```

This shows how Java selects overloaded methods based on their arguments.

---

### Basic Java Methods

#### `Calculator`

Contains simple examples of:

* Addition
* Multiplication
* Checking whether a number is even
* Finding the maximum of two numbers

The class is intended as a basic exercise for practicing methods, parameters, return values, and conditional logic.

## 🛠️ Technologies

* **Java**
* Java Collections Framework
* Object-Oriented Programming (OOP)

## ▶️ How to Run

### Option 1 — IntelliJ IDEA

1. Clone the repository:

```bash
git clone https://github.com/Shahnaz197/Mini-projects.git
```

2. Open the project in IntelliJ IDEA.
3. Mark the `src` directory as a Sources Root if necessary.
4. Open the class containing the `main()` method for the example you want to run.
5. Run the class.

### Option 2 — Command Line

Individual classes can be compiled and executed using the Java compiler where their package structure permits.

```bash
javac ClassName.java
java ClassName
```

For the packaged examples, compile and run them according to their package structure.

## 🎯 Purpose

This repository is primarily a **learning and practice repository**.

The exercises were created to strengthen understanding of Java before progressing toward larger applications and frameworks such as **Spring Boot**.

Rather than focusing on large applications, the repository breaks Java concepts into smaller examples that make it easier to understand how individual language features work.

## 🚀 Learning Progression

The exercises roughly cover the progression from basic Java concepts to more structured object-oriented programming:

```text
Java Basics
     ↓
Classes & Objects
     ↓
Constructors
     ↓
Encapsulation
     ↓
Collections
     ↓
HashMap & ArrayList
     ↓
Nested Collections
     ↓
Inheritance
     ↓
Polymorphism
     ↓
Interfaces & Abstraction
```

## 📌 Future Improvements

Possible improvements as the repository develops:

* Add more complex collection problems
* Introduce exception handling
* Add Java Streams and Lambda expressions
* Improve input validation
* Add unit tests
* Refactor repeated examples into more reusable designs
* Introduce Maven or Gradle for project management
* Add larger Java/Spring Boot projects

## 👩‍💻 Author

**Shahnaz197**

This repository documents my ongoing practice with Java and object-oriented programming.
