<!---
-->

##### Intuitive generics based functional interfaces with support for void, returns, multiple params and exceptions.

##### Dependencies 
* Zero. **JDK8** compatible. Tested on **JDK15**.

##### Maven dependencies available on maven central [search.maven.org](https://search.maven.org/search?q=com.momomo)
##### Dependency   
```xml
<dependency>
  <groupId>com.momomo</groupId>
  <artifactId>momomo.com.platform.Lambda</artifactId>
  <version>3.1.8</version>
</dependency>                                                      
```                         
##### Repository
```xml
<repository>
    <id>maven-central</id>
    <url>http://repo1.maven.org/maven2</url>
</repository>
```

##### Our highlighted repositories                          

* **[`momomo.com.platform.Core`](https://github.com/momomo/momomo.com.platform.Core)**  
Is essentially what makes the our the core of several of momomo.com's public releases and contains a bunch of Java utility.

* **[`momomo.com.platform.Return`](https://github.com/momomo/momomo.com.platform.Return)**  
An intuitive library that allows you to return multiple return values with defined types on the fly from any method rather than being limited to the default maximum of one.

* **[`momomo.com.platform.Nanotime`](https://github.com/momomo/momomo.com.platform.Nanotime)**  
Allows for nanosecond time resolution when asking for time from Java Runtime in contrast with `System.currentTimeMillis()`.

* **[`momomo.com.platform.db.transactional.Hibernate`](https://github.com/momomo/momomo.com.platform.db.transactional.Hibernate)**  
A library to execute database command in transactions without having to use annotations based on Hibernate libraries. No Spring!

* **[`momomo.com.platform.db.transactional.Spring`](https://github.com/momomo/momomo.com.platform.db.transactional.Spring)**  
A library to execute database command in transactions without having to use annotations based on Spring libraries.

### Background
 
Ever confused by names like `Supplier`, `Function`, `BiFunction`, and so forth? Do you find them limiting? **Able** to keep track of them? Can your brain really **map** them quickly enough when scanning method signatures? Can you easily **convert** or go from one method to another?   

With this **`interface`** based library, you can use: 
* **`Lambda.V`** &nbsp; &nbsp;for a *`void`* &nbsp;&nbsp;&nbsp;lambda that takes **`0`** defined parameters. Implements **`Runnable`**.
* **`Lambda.V1`** &nbsp; for a *`void`* &nbsp;&nbsp;&nbsp;lambda that takes **`1`** defined parameter.
* **`Lambda.V2`** &nbsp; for a *`void`* &nbsp;&nbsp;&nbsp;lambda that takes **`2`** defined parameters.
* **`Lambda.R`** &nbsp;&nbsp; for a *`return`* lambda with defined **`return`** type that takes **`0`** defined parameters. Implements **`Supplier<Return>`**.
* **`Lambda.R1`** &nbsp; for a *`return`* lambda with defined **`return`** type that takes **`1`** defined parameter. Implements **`Function<Param, Return>`**.
* **`Lambda.R2E`**&nbsp; for a *`return`* lambda with defined **`return`** type that takes **`2`** defined parameters, *and* allows you to **define** the **thrown exception type** as well. 
* *... and so on ...* 
 
Furthermore. 

Going from **`Lambda.R2E`** to a **`Lambda.V2E`** is as easy as calling **`lambda.V2E()`** where we ignore making use of **return** value.  
Going from **`Lambda.V2E`** to a **`Lambda.R2E`** is also possible using **`lambda.R2E()`** and comes with a small caveat where we **`return null`** instead which is fine as long as invoker of **`lambda.call()`** handles **`null`** return values properly. 

A great number of libraries has been built on top of this intuitive naming strategy.

### Guide

#### [`Lambda.java`](src/momomo/com/Lambda.java)
Documentation is provided through comments within the class itself. We recommend you start try to use it, and you will immediately figure out its use. 

* Nice compact, partial view over signatures from Intellij: 
  
  [![Lambda.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.signatures.2021.04.18.v1.jpg?raw=true)](src/momomo/com/Lambda.java)

### Example   

* ***[`examples/IO.java`](test/momomo/com/platform/Lambda/examples/IO.java)***

  [![IO.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.io.2021.04.07.V1.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/IO.java)

* ***[`examples/Lists.java`](test/momomo/com/platform/Lambda/examples/Lists.java)***

    [![Lists.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.lists.2021.03.04.v2.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/Lists.java)

### Recommendation
* Since a **`Lambda.V extends Lambda.VE<RuntimeException>`** we recommend that you always try to use a **`throw`** capable Lambda for your declared methods which ultimately depends on intetions like if you want **`lambda.call()`** to **bubble** non **`RuntimeExceptions`** or if you want to force the handlement of **`exception`** inside the lambda body (think **`Runnable`** and **`Thread`**)?  
This way, you have the option to handle any exception in the Lambda body, as well as being able to simply throw it. 

  Take the  the **`Runnable`** interface as an example where you normally, if you say read from a file which would throw an IO**`Exception`** by default you would be forced to handle that exception. 
 However, using the **`Lambda`** interface, and calling a method that expects a throw capable **`Lambda`**, that lambda will automatically throw **`E`** if there are any by the caller of **`lambda.call()`**.     
  
* For your base methods, try to use an **`R`** lambda with **`E`** whenever possible, such as **`Lambda.R[1-5]E`**. This is versitale and would allow you to add delegating methods of most flavours more easily.

### Keep in mind
* A **`Lambda.R1`** can be automatically and safely converted to to any **`Lambda.R2`** -**`Lambda.R5`** as well as **`Lambda.V1`** - **`Lambda.V5`** and there are **util methods** for these things. A **`Lambda.R5`** can not be safely converted to a **`Lambda.R4`** since the body in **`Lambda.R5`** expects 5 params and converting it to **`Lambda.R4`** would leave at least one **`null`**. 
  To make conversions from **`Lambda.R5`** to **`Lambda.R4`** or **`Lambda.V4`** you would have to do it manually.
  
  On a similar note, **`Lambda.V1`** can be converted to a **`Lambda.R1`** and there are **util methods** for that. This is achieved by simply returning null, which is always possible even when supplying a **`Lambda.R1`** to begin with. Therefore the **`lambda.call()`** should be able to handle **`null`** **`return`**.      

* Whenever possible, the interfaces implement equivalent interfaces such as `Consumer`, `BiConsumer`, `Function`, `BiFunction`, `Supplier`, `Runnable` and can thus be used and fed to methods expecting those allowing you to stick with using this consistent naming pattern.
  
  As an example, **`Lambda.V extends Runnable`** with **`run()`** implemented to delegate to **`call()`**, **`Lambda.R<R> extends Supplier<R>`** with **`get()`** implemented to delegate to **`return call()`**, **`Lambda.R1<R,P> extends Function<P, R>`** with **`apply(P param)`** implemented to delegate to **`return call(param)`** and so forth. This means you can opt to supply a Lambda.V

* We have two namespaces, **`Lambda`** and **`Closure`** and can be used interoperable. The default namespace is **`Lambda`** so you could do **`Lambda.V1<String>`**, or **`Lambda.R1<Boolean, String>`**. But since the Lambda namespace is sometimes difficult to complete (*intellij*) due to its wide use, you could instead do **`Closure.V1`**.  
**`Closure.V1`** == **`Lambda.V1`**, **`Closure.R2E`** is the same as **`Lambda.R2E`**, it just access to it is provided though another class.         

### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and/or ideas on things to improve.

### Pipeline
* Add **`E[2-5]`** as well to allow for more defined exception types, in cases where multiple exception types are thrown from **`Lambda`**. Normally this would be handled by throwing the least common **`Exception`** denominator but this is not always ideal to do.

* Add **`V[6-10]`**, **`VE[6-10]`**, **`R[6-10]`**, **`RE[6-10]`** as well to cover all sceptics out there thinking they will ever need more than **`5`**.       