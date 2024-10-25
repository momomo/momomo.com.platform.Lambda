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
    <version>5.0.2</version>
</dependency>                                                      
```                         
##### Repository
```xml
<repository>
    <id>maven-central</id>
    <url>http://repo1.maven.org/maven2</url>
</repository>
```

##### Our other, highlighted [repositories](https://github.com/momomo?tab=repositories)                          

* **[`momomo.com.platform.Core`](https://github.com/momomo/momomo.com.platform.Core)** Is essentially what makes the our the core of several of momomo.com's public releases and contains a bunch of Java utility.

* **[`momomo.com.platform.Obj`](https://github.com/momomo/momomo.com.platform.Obj)** Intuitive library that makes it easier for you to return multiple, fully defined objects on the fly from any method, any time rather than being limited to the default maximum of one. 

* **[`momomo.com.platform.Nanotime`](https://github.com/momomo/momomo.com.platform.Nanotime)** Allows for nanosecond time resolution when asking for time from Java Runtime in contrast with **`System.currentTimeMillis()`**.

* **[`momomo.com.platform.DB.transactional.Hibernate`](https://github.com/momomo/momomo.com.platform.DB.transactional.Hibernate)** A library to execute database commands in transactions without  having to use annotations based on Hibernate libraries. No Spring!

* **[`momomo.com.platform.DB.transactional.Spring`](https://github.com/momomo/momomo.com.platform.DB.transactional.Spring)** A library to execute database commands in transactions without  having to use annotations based on Spring libraries.

### Background
 
Ever confused by names like `Supplier`, `Function`, `BiFunction`, `Consumer`, ... and so forth?  *Do you find them limiting?* 

Are you easily **able** to keep track of them? Can your brain **parse** them quickly enough when scanning method signatures?  

Can you easily **convert** and/or go from one method to another?   

With this ***intuitive*** **`interface`** based ***naming strategy*** you can use: 
* **`Lambda.R`** &nbsp;&nbsp; for a **`return`** lambda with defined **`return`** type that takes **`0`** defined parameters. Implements *`Supplier<Return>`*.
* **`Lambda.R1`** &nbsp; for a **`return`** lambda with defined **`return`** type that takes **`1`** defined parameter. Implements *`Function<Param1, Return>`*.
* **`Lambda.R2`** &nbsp; for a **`return`** lambda with defined **`return`** type that takes **`2`** defined parameter. Implements *`BiFunction<Param1, Param2, Return>`*.
* **`Lambda.R2E`**&nbsp; for a **`return`** lambda with defined **`return`** type that takes **`2`** defined parameters, *and* allows you to **define** the **thrown exception type** as well.
* ...
* **`Lambda.V`** &nbsp;&nbsp; for a **`void`** lambda that takes **`0`** defined parameters. Implements *`Runnable`*.
* **`Lambda.V1`** &nbsp; for a **`void`** lambda that takes **`1`** defined parameter. Implements *`Consumer<Param1>`*.
* **`Lambda.V2`** &nbsp; for a **`void`** lambda that takes **`2`** defined parameters. Implements *`BiConsumer<Param1>`*.
* **`Lambda.V2E`** for a **`void`** lambda that takes **`2`** defined parameters, *and* allows you to **define** the **thrown exception type** as well.
* ...
* Also take a look at less common use `varargs` based  
&nbsp; &nbsp; &nbsp; &nbsp; **[`Lambda.RP`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L943)**, **[`Lambda.RPE`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L959)**, **[`Lambda.RO`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L999)**, **[`Lambda.ROE`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L1013)**, **[`Lambda.OO`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L1036)**, **[`Lambda.OOE`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L1045)**   
&nbsp; &nbsp; &nbsp; &nbsp; **[`Lambda.VP`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L2379)**, **[`Lambda.VPE`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L2401)**, **[`Lambda.VO`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L2442)**, **[`Lambda.VOE`](https://github.com/momomo/momomo.com.platform.Lambda/blob/master/src/momomo/com/Lambda.java#L2464)**  
 which are commented in the source code of **[`Lambda.java`](src/momomo/com/Lambda.java)**.
 
 With this library you can also safely: 
 * Go from **`Lambda.R1E`** to a **`Lambda.V1E`** by simply calling **`lambda.V1E()`** where we ignore making use of the **`return`** value for the desired `void` lambda.  
 * Go from **`Lambda.V1E`** to a **`Lambda.R1E`** by also simply calling **`lambda.R1E()`** but comes with a small caveat where we **`return null`** instead which is fine as long as the invoker of the **`lambda.call()`** handles **`return null`** properly. 
 * Go from **`R`** to **`R1`**, **`R1E`**, **`R2`**, **`R2E`**, **`R3`**, **`R3E`**, **`R4`**, **`R4E`**, **`R5`**, **`R5E`** by simply calling the method with the same name, such as **`lambda.R4E()`**.
 * ... 

Documentation is provided through comments within the class itself and we recommend you start try to use it, and you will immediately figure out its use. 

* Nice compact, partial view over signatures from Intellij over **[`Lambda.java`](src/momomo/com/Lambda.java)**: 
  
  [![Lambda.java](https://github.com/momomo/momomo.com.yz.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.signatures.2021.04.18.v1.jpg?raw=true)](src/momomo/com/Lambda.java)

### Examples   

* ***[`examples/IO.java`](test/momomo/com/platform/Lambda/examples/IO.java)***

  [![IO.java](https://github.com/momomo/momomo.com.yz.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.io.2021.04.07.V1.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/IO.java)

* ***[`examples/Lists.java`](test/momomo/com/platform/Lambda/examples/Lists.java)***

    [![Lists.java](https://github.com/momomo/momomo.com.yz.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.lists.2021.04.07.V1.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/Lists.java)

### Recommendation
* Since a **`Lambda.V extends Lambda.VE<RuntimeException>`**, **`Lambda.R extends Lambda.RE<RuntimeException>`**, **`Lambda.V1<P1> extends Lambda.V1E<P1, RuntimeException>`** we recommend that you always try to use a **`throw`** capable Lambda for your declared methods which ultimately depends on intetions like if you want **`lambda.call()`** to **bubble** non **`RuntimeExceptions`** or if you want to force the handlement of **`exception`** inside the lambda body (think `Runnable` and `Thread`)? This way, you have the option to handle any exception in the Lambda body, as well as being able to simply throw it. 

  Take the  the `Runnable` interface as an example where you normally, if you say read from a file which would throw an **`IOException`** by default you would be forced to handle that exception. 
 However, using the **`Lambda`** interface, and calling a method that expects a throw capable **`Lambda`**, that lambda will automatically throw **`E`** if there are any by the caller of **`lambda.call()`**.     
  
* For your base methods, try to use an **`R`** lambda with **`E`** whenever possible, such as **`Lambda.R[1-5]E`**. This is versitale and would allow you to add delegating methods of most flavours more easily. 

### Keep in mind
* A **`Lambda.R`** can automatically and safely be converted to to any **`Lambda.R1`** -**`Lambda.R5`** as well as **`Lambda.V`** - **`Lambda.V5`** and there are **util methods** for these things. A **`Lambda.R5`** can not be safely converted to a **`Lambda.R4`** since the body in **`Lambda.R5`** expects 5 params and converting it to **`Lambda.R4`** would leave at least one **`null`**.   
  To make conversions from **`Lambda.R5`** to **`Lambda.R4`** or **`Lambda.V4`** you would have to do it manually.
  
  On a similar note, **`Lambda.V1`** can be converted to a **`Lambda.R1`** and there are **util methods** for that. This is achieved by simply returning null, which is always possible even when supplying a **`Lambda.R1`** to begin with. Therefore the **`lambda.call()`** should handle **`return null`**.      

* Whenever possible, the interfaces implement equivalent interfaces such as `Runnable`, `Consumer`, `BiConsumer`, `Function`, `BiFunction`, `Supplier` and can thus be used and fed to methods expecting those allowing you to stick with using this consistent naming pattern.
  
  As an example, **`Lambda.V`** **`extends`** `Runnable` with `run()` implemented to delegate to **`call()`**, **`Lambda.R<R>`** **`extends`** `Supplier<R>` with `get()` implemented to delegate to **`return call()`**, **`Lambda.R1<R,P>`** **`extends`** `Function<P, R>`with `apply(P param)` implemented to delegate to **`return call(param)`** and so forth. This means you can opt to supply a **`Lambda.V`** to anything that accepts a `Runnable`, **`Lambda.R`** to anything that accepts a `Supplier` making it possible to use as a standard for everything.  

* We have two namespaces, **`Lambda`** and **`Closure`** and can be used interoperable. The default namespace is **`Lambda`** so you could do **`Lambda.V1<String>`**, or **`Lambda.R1<Boolean, String>`**. But since the Lambda namespace is sometimes difficult to complete (*intellij*) due to its wide use, you could instead do **`Closure.V1`**.  
**`Closure.V1`** == **`Lambda.V1`**, **`Closure.R2E`** is the same as **`Lambda.R2E`**, it just access to it is provided though another class.         

### License
The full license can be found here [`MoL9`](https://raw.githubusercontent.com/momomo/momomo.com.yz.licenses/master/MoL9?raw=true?raw=true)

### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and/or ideas on things to improve.

### Pipeline
* Add **`E[2-5]`** as well to allow for more defined exception types, in cases where multiple exception types are thrown from **`Lambda`**. Normally this would be handled by throwing the least common **`Exception`** denominator but this is not always ideal to do.

* Add **`V[6-10]`**, **`VE[6-10]`**, **`R[6-10]`**, **`RE[6-10]`** as well to cover all sceptics out there thinking they will ever need more than **`5`**.       