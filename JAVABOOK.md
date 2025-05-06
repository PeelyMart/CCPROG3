# Java: A beginners' guide, 9th edition (First link of her syllabus)

*note-2-self*: Name the markdown files, JAVABOOK-#.md for easy tracking and archiving in GITHUB

## 1.1 The history and Philosophy of Java 
#### The origins
  It was headed by four people working at a micro systems company. Microsystems involve putting CPUs in appliances, **embedded systems**---these are usually small in size and use vastly different CPU's

  Compilers are expensive and time consuming to be made for every different CPU. The current languages of the time were compiled directly to a specific CPU which needs to be compiled in a specific way for that processor 

  Because of this, they made Java-- used to be "Oak", was developed to be light and portable and could be run on any system. At the same time the internet was becoming a thing, the internet was on vastly different devices and computer architecture due to this, Java became closely related to the internet which is now today's correlation with the Java programming language 
#### Lineage: C and C++ 

  Java's ancestors could be traced back to **C** and **C++**, it inherits its syntax from C and its object model from C++. Java was easily adapted by programmers of the time since C/C++ was very popular, It built on top of the C/C++ and further improves a lot of C++'s features

  Java along with C/C++ was refined through the first hand experiences of the programmers who thoroughly used it and found places in which it could be improved upon which made it a very stable and good language

  Java is not made to replace or be a better version of C++, although they are both object oriented programming languages, they are made to solve different sets of complex problems, the book says they will coexist for the rest of the near future

#### Java and the internet
  Java and The Internet developed closely together,  The internet needed a portable and secure programming language. Java became popular and became widely used. It made the internet to be easily programmed. 

  Java also introduced **Applets** the book says it changed the way we used and looked at the internet forever 

##### Simplification
  - It simplified it due to the ability of java to be used in different platforms
  - Built in support for networking
  - Made it easy for programs to be delivered over the internet
##### Applets
  A special kind of **Java program** that could be available and transferred over the internet and executed a java ready browser

  When the user clicks on the link, it get downloaded then locally executed by the java ready browser

##### Security
  Everytime a piece of code is executed you run the risk of running malware, using Java, it is executed in a very confined Java environment. In this environment the code is ran strictly, and could not access other parts of the computer that malware needs to have access to

#### What makes Java special: **BYTECODE**
In C/C++ and similar languages, your code is compiled directly into machine code that the CPU on your computer understands. This means if you want to run the program on a colleague’s machine with a different setup, you’ll need to recompile it for their system.
Java, on the other hand, uses a different approach: it compiles code into bytecode, a platform-independent intermediate form. This bytecode runs on the Java Virtual Machine (JVM), which acts as a virtual environment. Since the JVM is part of the Java runtime and is available on many platforms, this removes the dependency on specific processors or operating systems, making Java programs portable
  
