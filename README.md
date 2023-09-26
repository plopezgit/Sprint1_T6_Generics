# Sprint1_T6_Generics

Level 1

- Exercise 1

Create a class called NoGenericMethods that stores three objects of the same type, along with the methods to store and retrieve those objects, and a constructor to initialize all three. Check that arguments can be placed anywhere in the constructor call.

- Exercise 2

Create a class called Person with the attributes firstname, lastname, and age. It then creates a class called GenericMethods with a generic method that accepts three generic type arguments. This method should only print to the screen the arguments it received. In the main() of the main class, call the generic method with different types of parameters.

Example: an object of the Person class, a String and a primitive type.

In this way you have verified that any type of parameter can be passed to it and in any order.


Level 2

- Exercise 1

Modify the previous exercise so that one of the arguments to the generic method is not generic.

- Exercise 2

Modify the previous section so that the arguments to the generic method are an undefined variable argument list.


Level 3

- Exercise 1

To do this exercise you need an interface called Telephone and three classes: Smartphone, Generic and Principal.

The Telephone interface must have a method called call(). The Smartphone class must implement Telephone, and in addition to the call() method, it must also have the makePhotos() method.

The Generic class must have two generic methods, the first must receive an argument type limited by the Telephone interface and the second must receive an argument limited by the Smartphone class. From these two methods, call the relevant Telephone and Smartphone methods. In the main() of the Main class, an object of the Smartphone class is passed to the two generic methods of the Generic class.

Can the method bounded by the Phone interface, of the Generic class, call the makePhotos() method?


Tutorials:

https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://docs.oracle.com/javase/tutorial/extra/generics/index.html
