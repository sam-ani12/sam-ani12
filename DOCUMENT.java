1)Introduction to java:

java is a high level programming language used for creating desktop,web and mobile applications
ex:1)desktop application:open office,sql developer.
   2)Web Applications.
   3)Mobile: Android.

2)What is high level and low level programming language?

->Programmers can easily understand or interpret or compile the high level language in comparison of machine.
->Machine can easily understand the low level language in comparison of human beings.

3)What is JDK?

->It is platform independent.
->JDK stands for Java Development Kit.
->The JDK includes tools useful for developing and testing programs written in the Java
programming language and running on the Java platform.

4)What does JDK contains?

->JVM (JAVA VIRTUAL MACHINE)
->JRE (JAVA RUN TIME ENVIRONMENT)

5)What is JVM?

->JVM stands for Java virtual machina.
->It is a execution system.
->It will take class file.
->we run our java program on JVM.

6)What is class?
 
->A class is a user defined blueprint or prototype from which objects are created.  
->It represents the set of properties or methods that are common to all objects of one type.
Eg:            Class       Objects
               --------------------------------
               Student     Name,Roll No,Mail ID
-> Student class consists of number of objects.

7)Object?

->Object is a real world entity.
->It consists of properties
->It performs task.
Eg:            Human:Name   |
                     Color  |----}Properties
                     Height |

               Run()   |
               Read()  |----}Task performs
               Write() |

8)Data Fields

->Java fields and methods are core components of the programming language and each one plays a major role in Java classes.
->At its most basic, a Java field is a variable. This means that it represents a value, such as a numerical value or a text.
Eg:    public class Book {
       String isbn;
       String title;
       int pageCount;
       double price;
       }

9)Method

->A Java method is a function. It's a block of code that carries out an operation. Like Java fields, Java methods must be declared inside classes. 
->A Java method can accept values from and return results back to other parts of the program.

Eg:     public void printNotice() {
        System.out.println("I'm a Book!");
        }

10)Reading and printing from/to console

->In Java, there are four different ways for reading input from the user in the command line environment.

           1.Using Buffered Reader Class
           2.Using Scanner Class
           3.Using Console Class
           4.Using Command line argument

11)Primitive data types and ranges

        Type	    Description	               Default		Size		Example Literals
        boolean	    true or false              false	        1 bit	        true, false
	byte	    twos complement integer    0	        8 bits	        (none)
	char	    Unicode character	       \u0000	        16 bits	        'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
	short	    twos complement integer	0	        16 bits	        (none)
	int	    twos complement integer	0	        32 bits	        -2, -1, 0, 1, 2
	long	    twos complement integer	0	        64 bits	        -2L, -1L, 0L, 1L, 2L
	float	    IEEE 754 floating point	0.0	        32 bits  	1.23e100f, -1.23e-100f, .3f, 3.14F
	double	    IEEE 754 floating point	0.0	        64 bits	        1.23456e300d, -1.23456e-300d, 1e1d

12)Conditions, loops, ternary operator

Loops:Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
      1)while loop: 
           A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.The while loop can be thought of as a repeating if statement.

       System: while (boolean condition)
               {
               loop statements...
               }
      2)for loop: 
           For loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping

      System: for (initialization condition; testing condition; 
                              increment/decrement)
              {
              statement(s)
              }
      3)do while: 
            do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.  
      System: do
              {
              statements..
              }
              while (condition);
Conditions: In java there are 4 types of conditions.They are
            1)if
            2)else
            3)else if
            4)switch
        1)if Statement:
             Use the if statement to specify a block of Java code to be executed if a condition is true.
 
        System:  if (condition) {
                 // block of code 
                 }
        2)else Statement:
              Use the else statement to specify a block of code to be executed if the condition is false.     

        System:  if (condition) {
                 // block of code 
                 } else {
                 // block of code 
                 }
        3)else if Statement:
               Use the else if statement to specify a new condition if the first condition is false.
        System:  if (condition1) {
                 // block of code 
                 } else if (condition2) {
                 // block of code 
                 } else {
                 // block of code 
                 }
Ternary operator:-->Operators constitute the basic building block to any programming language. 
                 -->Java too provides many types of operators which can be used according to the need to perform various calculation and functions be it logical, arithmetic, relational etc. 
                 -->They are classified based on the functionality they provide. Here are a few types: 
 

                           1) Arithmetic Operators
                           2) Unary Operators
                           3) Assignment Operator
                           4) Relational Operators
                           5) Logical Operators
                           6) Ternary Operator
                           7) Bitwise Operators
                           8) Shift Operators
13)Constructor:
     
-->constructor is a block of codes similar to the method. 
-->It is called when an instance of the class is created. 
-->At the time of calling constructor, memory for the object is allocated in the memory.
-->It is a special type of method which is used to initialize the object.
-->Every time an object is created using the new() keyword, at least one constructor is called.
-->It calls a default constructor if there is no constructor available in the class. 
-->In such case, Java compiler provides a default constructor by default.  
Types of Java constructors:
         1)Default constructor
         2)Parameterized constructor

int tyres;
boolean isCarReady;
char ch;
int gears = 10;
void run() {
System.out.println("running");
}
Car(){
}
public Car(int tyres, boolean isCarReady, char ch, int gears) {
this.tyres = tyres;
this.isCarReady = isCarReady;
this.ch = ch;
this.gears = gears;
}
public static void main(String[] args) {
Car maruti = new Car();
System.out.println("-------Maruti Car--------");
System.out.println(maruti.tyres);
System.out.println(maruti.isCarReady);
System.out.println("------------------");
System.out.println(maruti.ch);
System.out.println("------------------");
System.out.println(maruti.gears);
// parameterised constructor
Car tata = new Car(10, true, 'Y', 18);
System.out.println("-------Tata Car--------");
System.out.println(tata.tyres);
System.out.println(tata.isCarReady);
System.out.println("------------------");
System.out.println(tata.ch);
System.out.println("------------------");
System.out.println(tata.gears);
} 

14)Interface:

-->An interface in Java is a blueprint of a class. It has static constants and abstract methods.
-->The interface in Java is a mechanism to achieve abstraction. 
-->There can be only abstract methods in the Java interface, not method body.It is used to achieve abstraction and multiple inheritance in Java.

Syntax: interface <interface_name>{  
      
        // declare constant fields  
        // declare methods that abstract   
        // by default.  
        }  

15)String:

     Strings in Java are Objects that are backed internally by a char array.Since arrays are immutable,Strings are immutable as well.Whenever a change to a String is made,an entirely new String is created.
Syntax: <String_Type> <string_variable> = "<sequence_of_string>";
Eg 1:       String str = "YAMINI";

Eg 2:       public class StringExample{    
            public static void main(String args[]){    
            String s1="java";//creating string by Java string literal    
            char ch[]={'s','t','r','i','n','g','s'};    
            String s2=new String(ch);//converting char array to string    
            String s3=new String("example");//creating Java string by new keyword    
            System.out.println(s1);    
            System.out.println(s2);    
            System.out.println(s3);    
            }}   

16)Oops(Object oriented Programming System):

       Object-Oriented Programming is a paradigm that provides many concepts,such as inheritance,encapsulation,abstraction,polymorphism,etc. 
      
       1)Inheritance:
            -->When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
            -->It provides code reusability. It is used to achieve runtime polymorphism.
       Syntax: class Subclass-name extends Superclass-name  
               {  
               //methods and fields  
               } 
       Eg: class Employee{  
           float salary=40000;  
           }  
           class Programmer extends Employee{  
           int bonus=10000;  
           public static void main(String args[]){  
           Programmer p=new Programmer();  
           System.out.println("Programmer salary is:"+p.salary);  
           System.out.println("Bonus of Programmer is:"+p.bonus);  
           }  
           }   

       2)Polymorphism:
           -->If one task is performed in different ways, it is known as polymorphism. 
              For example: 
                   to convince the customer differently, to draw something,for example, shape, triangle, rectangle, etc.
           -->In Java,we use method overloading and method overriding to achieve polymorphism.
       Eg:  class Bike{  
            void run(){System.out.println("running");}  
            }  
            class Splendor extends Bike{  
            void run(){System.out.println("running safely with 60km");}  
            public static void main(String args[]){  
            Bike b = new Splendor();//upcasting  
            b.run();  
            }  
            }   
  
       3)Abstraction:
           -->Hiding internal details and showing functionality is known as abstraction. 
           -->For example phone call, we don't know the internal processing.
           -->In Java, we use abstract class and interface to achieve abstraction.
       Eg:  abstract class Bike{  
            abstract void run();  
            }  
            class Honda4 extends Bike{  
            void run(){System.out.println("running safely");}  
            public static void main(String args[]){  
            Bike obj = new Honda4();  
            obj.run();  
            }  
            }  

       4)Encapsulation:
           -->Binding code and data together into a single unit are known as encapsulation. 
           -->For example, a capsule, it is wrapped with different medicines.
       Eg:  package com.javatpoint;  
            class Test{  
            public static void main(String[] args){  
            Student s=new Student();   
            s.setName("vijay");    
            System.out.println(s.getName());  
            }  
            } 

17)Packages:

-->A java package is a group of similar types of classes, interfaces and sub-packages.
-->Package in java can be categorized in two forms, built-in package and user-defined package.
-->There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
Eg:   package mypack;  
      public class Simple{  
      public static void main(String args[]){  
      System.out.println("Welcome to package");  
      }  
      }   

18)Access Specifiers:

-->The access specifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
-->We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
There are four types of Java access specifiers:
       1)Private: 
             The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
       2)Default: 
             The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
       3)Protected: 
             The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
       4)Public: 
             The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

19)Static Variable:

-->Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution. 
-->It is a variable which belongs to the class and not to object.
-->Static variables are initialized only once,at the start of the execution. 
-->These variables will be initialized first, before the initialization of any instance variables.
Eg:
import java.io.*;
public class Employee {
   private static double salary;
   public static final String DEPARTMENT = "Development ";

   public static void main(String args[]) {
      salary = 1000;
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}
20)Local Variables:

-->Local variables are declared in methods, constructors, or blocks.
-->Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the constructor,or block.
-->Access modifiers cannot be used for local variables.
-->Local variables are visible only within the declared method, constructor, or block.
-->Local variables are implemented at stack level internally.
-->There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.
Eg:
public class Test {
   public void pupAge() {
      int age = 0;
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.pupAge();
   }
}

21)Abstract Class:

-->A class which is declared with the abstract keyword is known as an abstract class in Java.
-->It can have abstract and non-abstract methods.
-->An abstract class must be declared with an abstract keyword.
-->It can have abstract and non-abstract methods.
-->It cannot be instantiated.
-->It can have constructors and static methods also.
-->It can have final methods which will force the subclass not to change the body of the method.

22)Exceptions

-->Exception is an abnormal condition.
-->An exception is an event that disrupts the normal flow of the program. 
-->It is an object which is thrown at runtime. 
There are mainly two types of exceptions: checked and unchecked.An error is considered as the unchecked exception.
                1)Checked Exception
                2)Unchecked Exception
                3)Error
Java Exception Keywords:
      Java provides five keywords that are used to handle the exception.
       Keyword	   Description
       -----------------------------------------------------------
       try	   The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
       catch	   The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
       finally	   The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
       throw	   The "throw" keyword is used to throw an exception.
       throws	   The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.
Eg:
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{   
      int data=100/0;  
   }
   catch(ArithmeticException e){System.out.println(e);
   }    
   System.out.println("rest of the code...");  
  }  
}  