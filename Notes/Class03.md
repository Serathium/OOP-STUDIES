  
# OOP: Encapsulation, Constructors and Static Methods  

## Constructors  

- Are utilized in the initialization of a class' attributes.  
- Are invoked at the moment an instance of a class is created.  

```java  
ClassName([arguments]) {
    // command block executed by the method
}
```  

### Standard Constructor  

- Has no arguments.  

### Intialization Constructor  

- Arguments define the attributes' initial values.  

### Copy Contructor  

- Receives as an argument an object of the same class, where the attibutes' values will be copied from.  

### Constructors X Methods  

Constructors must have **exactly** the same name as the class, they **can't return any value**, can't use access modifiers.  
The programmer can't call it directly, only when the instance is initialized by *new*.  

### Method Overloading  

Java allows the creation of multiple methods with the same name, as long as the have different *signatures*.  
- Method's signature: name and arguments.  
- Return type is not considered as part of the signature.  
- The possibility of having more than one method with the same name is known as **Method Overloading**.  
- Compiler will decide which method is called, based on the signature.  

### "*this*" Reference  

- Self-reference, a reference to the instance itself.  
- To call a constructor inside another, we use *this* instead of the constructor's name.  

## Encapsulation  

- Objects must "hide" their complexity.  
- Abstraction: Hide the details of an object's functionality.  

### Access Modifiers in Java  

- **public**: The attribute or method may be accessed by any other class.  
- **private**: The attribute or method may only be accessed by methods from the same class.  
- **protected**: Works as **private** except that the child classes (or derived) will also have access to the attribute or method.  
- **package**(default): When attributes or methods are declared without access modifiers, they are called **package**. This means they can be accessed by any class in the same package.  

### Methods and Attibutes  

- What should be private and what should be public?  

- For use inside the class: private and protected attibutes and methods.  
- As an inteface for interaction with the object: public methods.  

### *get* and *set* Methods  

When something has a **private** modifier, public method can be used to modify them. These are called *getters* and *setters*.  

#### *set* Methods  

- Modifies a field or attibute of a class.  
- Are **void** and must receive an argument that will be the new value of the field or attibute.  

#### *get* Methods  

- Verifies a field or attribute of a class.  
- Always return something.  
- Has no argument.  

## Static Attibutes and Methods  

### Static Attibutes (*static*)  

- Variables declared as *static* are known as class attibutes.  
- The static variable will be the same for all instances of a class.  

### Static Methods  

- Static method can be called without the creation of instance of the classes they're from.  
- Non-static mehtod can only be called by an object from the class they're from.  

## Composition  

- A Java class can have references to objects from other classes as members. Compostion, or *has one" relation.  

