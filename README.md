## momomo.com.plaform.Lambda

##### Intuitive generics based functional interfaces with support for void, returns, multiple params & exceptions
 
Ever confused by names like `Supplier`, `Function`, `BiFunction`, and so forth? Do you find them limiting? Can you keep track of them? Can you easily convert one to another?   

With this library, you can refer to: 
* `Lambda.V1` &nbsp; for a void lambda that takes *1* generic parameter.
* `Lambda.V2` &nbsp; for a void lambda that takes *2* generic parameters.
* `Lambda.R1` &nbsp; for a returning lambda that has a defined `return` type and takes *1* generic parameter.
* `Lambda.R2E`&nbsp;for a returning lambda that has a defined `return` type and takes *2* generic parameters, and allows you to define the `thrown exception` type as well.
* ... ***many more*** ... 
 
Also, going from `Lambda.R2E` to a `Lambda.V2E`, is as easy as calling `lambda.V2E()` by ignoring the return value. 
Going from `Lambda.V2E` to `Lambda.R2E` is also possible with a small caveat, returning null instead which is fine if `lambda.call()` handles null returns properly. 

A great number of libraries has been built on top of this intuitive naming strategy.

#### Maven dependency available on maven central (search.maven.org)
##### Dependency   
```
<dependency>
  <groupId>com.momomo</groupId>
  <artifactId>momomo.com.platform.Lambda</artifactId>
  <version>2.0.6</version>
</dependency>                                                      
```                         
##### Repository
```
<repository>
    <id>maven-central</id>
    <url>http://repo1.maven.org/maven2</url>
</repository>
```

#### [Lambda.java](src/momomo/com/platform/Lambda/Lambda.java)
Documentation through comments are provided within the class itself. 

#### Examples:  

* [Lists.java](test/momomo/com/platform/Lambda/examples/Lists.java)

    [![Lists.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.lists.2021.03.04.v2.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/Lists.java)

* [IO.java](test/momomo/com/platform/Lambda/examples/IO.java)

  [![Lists.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/example.io.2021.03.04.v2.jpg?raw=true)](test/momomo/com/platform/Lambda/examples/IO.java)

#### Recommendation
* Since a `Lambda.V extends Lambda.VE<RuntimeException>` we recommend that you always try to use a `throw` capable Lambda for your declared methods which ultimately depends on intetions like if you want `lambda.call()` to **bubble** non `RuntimeExceptions` or if you want to force the handlement of `exception` inside the lambda body (think `Runnable` and `Thread`)?  
This way, you have the option to handle any exception in the Lambda body, as well as being able to simply throw it. 

  Take the  the `Runnable` interface as an example where you normally, if you say read from a file which would throw an IO`Exception` by default you would be forced to handle that exception. 
 However, using the `Lambda` interface, and calling a method that expects a throw capable `Lambda`, that lambda will automatically throw `E` if there are any by the caller of `lambda.call()`.     
  
* For your base methods, try to use an `R` lambda with `E` whenever possible, such as `Lambda.R[1-5]E`. This is versitale and would allow you to add delegating methods of most flavours more easily.

#### Other
* A `Lambda.R1` can be automatically and safely converted to to any `Lambda.R2` -`Lambda.R5` as well as `Lambda.V1` - `Lambda.V5` and there are **util methods** for these things. A `Lambda.R5` can not be safely converted to a `Lambda.R4` since the body in `Lambda.R5` expects 5 params and converting it to `Lambda.R4` would leave at least one `null`. 
  To make conversions from `Lambda.R5` to `Lambda.R4` or `Lambda.V4` you would have to do it manually.
  
  On a similar note, `Lambda.V1` can be converted to a `Lambda.R1` and there are **util methods** for that. This is achieved by simply returning null, which is always possible even when supplying a `Lambda.R1` to begin with. Therefore the `lambda.call()` should be able to handle `null` `return`.      

* Whenever possible, the interfaces implement equivalent interfaces such as `Consumer`, `BiConsumer`, `Function`, `BiFunction`, `Supplier`, `Runnable` and can thus be used and fed to methods expecting those allowing you to stick with using this consistent naming pattern.
  
  As an example, `Lambda.V extends Runnable` with `run()` implemented to delegate to `call()`, `Lambda.R<R> extends Supplier<R>` with `get()` implemented to delegate to `return call()`, `Lambda.R1<R,P> extends Function<P, R>` with `apply(P param)` implemented to delegate to `return call(param)` and so forth.

* We have two namespaces, `Lambda` and `Closure` and can be used interoperable. The default namespace is `Lambda` so you could do `Lambda.V1<String>`, or `Lambda.R1<Boolean, String>`. But since the Lambda namespace is sometimes difficult to complete (*intellij*) due to its wide use, you could instead do `Closure.V1`       

#### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and ideas on things to improve.

#### Pipeline
Adding `E[2-5]` as well, to allow for more defined exception types, in cases where multiple exceptions are thrown from Lambda. Normally this would be handled by throwing the least common `Exception` denominator but this is not always ideal.      

#### Coming soon
* ###### momomo.com.platform.IO
* ###### momomo.com.platform.Stateful
* ###### momomo.com.platform.Jedison
* ###### momomo.com.platform.Transactional
* ###### momomo.com.platform.Transactional.Hibernate
* ###### momomo.com.platform.Transactional.Spring
* ###### momomo.com.platform.MoEV
* ###### m.bash.sh     
* ###### MoVC.js