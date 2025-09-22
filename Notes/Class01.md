  
# Introduction To Basic Object Oriented Programming (OOP) Concepts  

## What Are Programs?  

Programs are a set of commands and rules a programmer must know to be able to manipulate the resources of a computer.  

- Programs process **data**:  
Values in a bank account, characters sent by a keyboard, points in an image, numerical values for calculations.  

- The OOP programming paradigm considers that *the data* and *the mecanisms* of processing that data must be considered jointly.  

- **Models** are created to represent, together, data and operations on these data (???).  

## What are Models?  

- Models are simplified **representations** of objects, people, itens, tasks, etc. used by people in their day-to-day.  

- A model represents **data**  or informations, and contains **operations** or **routines** associated to it.  

- It's also possible to create models that contain only data or only operations.  

- Models can contain **submodels** and be part of other models.  

## What is Object Oriented Programming?  

The Object Oriented Programming is a computer programming paradigm that utilizes the concepts of ***Objects*** and ***Classes*** as central elements to represent and process data using programs.  

# OO Concepts  

## Classes  

- Overview:  
Programmers that use the OO paradigm create **objects** from **classes**, that are related to models.  

- Classes are programming language structures of OO to contain, for a set model, the data that must be represented and the operations that must be done with the data.  
1. Data = **Attributes**, must be of a `<type>` and have a `<name>`.  
2. Operations = **Methods** (the term *messages*, when we execute said method, we'd be sending a *message* to the method).  

- Each class must have a name that is easily associated with the model the class represents.  
Examples:  Class BankClient
1. **Attributes**: Account Nº, Name, Profession, phone number...  
2. **Methods**: InformsAccountNumber, InformsAgency, InformsDesiredOperation...  

- Represent the model.  

## Objects  

- An **Object** or **Instance** is a class materialization.  

- Used to represent data and execute operations.  

- So that the objects or instance may be manipulated, it's necessary to create **references** to these objects, that are basically variables from the class "type".  

- Example: still about the *BankClient* class, we can have the following clients:  
Name: I; Account: 0001; Teacher; Phone: 5555-5555  

## Classes vs Objects  

![figure01](/Notes/Figures/Class01Figure01.png)  

## Attributes  

- The data contained in a class are known as *fields* or *attibutes* of that class.  

- This field must have a name and type, that'll be either a type of a language native data type or an existing class in the language or defined by the programmer.  

- If the class is used so that many instances are created from it, each one of those instances will have a set of those fields defined in the class.  

## Methods  

- Operations contained in a class are called methods.  

- Methods are generally called or executed explicitly from other sections of code in the class that contains it or from other classes.  

- Messages = method calls.  

- For an operation to be executed, there must be a stimulus sent to that object.  

- The objects of a system exchange messages.  

- Methods may optionally receive *arguments* to *methods*.  

- Methods may optionally return values or class instances.  

## Other Concepts  

- The **principle of abstraction** is the capacity to abstract the complexity of a system and concentrate it only in parts of that system.  

- OOP is sedimented over 4 pillars derived from the principle of abstraction, they are:  
1. Encapsulation  
2. Inheritance  
3. Compostion  
4. Polymorphism  

![figure02](/Notes/Figures/Class01Figure02.png)  

### Encapsulation  

- Is the OO characteristic capable of concealing parts (data and details) of internal implementation of classes from the external world.  

- We don't visualize how the method is implemented internally in the class.  

- In practice: **JAVA access modificators!**  
public, private, protected, package.  

- Objects have behaviour.  

- The term behaviour is about the operations executed by an object and also the way by which these operations are executed.  

- The encapsulation mechanism is way of restricting access to the internal behaviour of an object.  

- An object that needs collaboration from another object to execute a task, simply sends a message to the latter.  

#### Interface  

- A requesting object must know what tasks an object can execute or what information it knows.  

- An object has an *interface*.  

- An object interface is what he knows and what he is able to do, whithout describing how the object knows what it does.  

- An interface defines the services it can execute and, consequetially (?), the messages it can receive.  

### Encapsulation (Returned)  

- The only thing that an object needs to know to ask for the collaboration from another object is that object's interface.  

- Each object sends messages to other objects to execute certain tasks, without worrying about how they are executed.  

- Data and behaviour specified in a same module.  

- Abstraction: conceal details of an object's functionality.  

![figure03](/Notes/Figures/Class01Figure03.png)  

### Composition or Aggregation  

- Is mechanism of **re-use of classes** utilized by OOP to increase **productivity** and the **quality** in software development.  

![figure04](/Notes/Figures/Class01Figure04.png)  

### Inheritance  

- Is a mechanism that allows a class to inherit all the attributes and methods from another class.  

![figure05](/Notes/Figures/Class01Figure05.png)  

- **Multiple Inheritance:** is the capacity of a class to have more than one superclass and inherit all the attributes and methods of all superclasses.  
*Iterfaces* are used to simulate Multiple Inheritance in JAVA.  

- **Simple Inheritance:** Each class can have only one supeclasse.  
In the JAVA language, the word *extends* is reserved to declare that one class inherits from another.  

### Polymorphism  

- Many forms.  

- Allows different objects (plane, boat, automobile) to respond to the same method (move) in different ways (fly, sail, drive).  

- Allows references from more abstract types of classes to represent the behaviour of concrete classes that reference it.  

#### Types of Polymorphism  

- Overloading Polymorphism  
Allows a method of a determined name to have distinct behaviours, from different parameters it receives. Each method differs in the **number**  and in the **type** of **parameters**. E.g. Constructor Overloading.

- Overwiting Polymorphism  
Is the redefinition of methods in descendant classes. That is, a method from a child class with the same name of a method from a parent class will overwrite the latter.  

![figure06](/Notes/Figures/Class01Figure06.png)  

- Inclusion Polymorphism  
The capacity of an object from class "A" to receive any object of subclasses of class "A" is what characterizes **Inclusion Polymorphism**.  

## UML - Unified Modeling Language  

- Standard Language to elaborate the structure of a SW project.  

- Modeling Language that allows better comprehension of a system.  

![figure07](/Notes/Figures/Class01Figure07.png)  