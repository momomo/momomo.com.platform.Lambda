## momomo.com.plaform.Lambda

##### Intuitive generics based functional interfaces
###### Support for void, returns, multiple params & exceptions
 
Ever confused by names like `Supplier`, `Function`, `BiFunction`, and so forth? Do you find them limiting? Can you keep track of them? Can you easily convert one to another?   

With this library, you can refer to: 
* `Lambda.V1` &nbsp; for a void lambda that takes one generic parameter.
* `Lambda.V2` &nbsp; for a void lambda that takes two generic parameters.
* `Lambda.R1` &nbsp; for a returning lambda that has a defined return type and takes one generic parameter.
* `Lambda.R2E` for a returning lambda that has a defined return type and takes two generic parameters, and allows you to define the `thrown exception` type as well.
* ... many more ... 
 
Also, going from `Lambda.R2E` to a `Lambda.V2E`, is as easy as calling `lambda.V2E()` by ignoring the return value. 
Going from `Lambda.V2E` to `Lambda.R2E` is also possible with a small caveat, returning null instead.

A great number of libraries has been built on top of this intuitive naming strategy.

#### Maven dependency available on maven central (search.maven.org)
##### Dependency   
```
<dependency>
  <groupId>com.momomo</groupId>
  <artifactId>momomo.com.platform.Lambda</artifactId>
  <version>2.0.5</version>
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

#### Other
Note that whenever possible, the interfaces implement equivalent interfaces such as `Consumer`, `BiConsumer`, `Function`, `BiFunction`, `Supplier`, `Runnable` and can thus be used and fed to methods expecting those allowing you to stick with using this consistent naming pattern.

As an example, `Lambda.V extends Runnable` with `run()` implemented to delegate to `call()`, `Lambda.R<R> extends Supplier<R>` with `get()` implemented to delegate to `return call()`, `Lambda.R1<R,P> extends Function<P, R>` with `apply(P param)` implemented to delegate to `return call(param)` and so forth.     

#### Recommendation
* For your base methods, always use a returning lambda with a thrown `Exception` possible, such as `Lambda.R[1-5]E` version since this is most versitale. Then you could add delegating methods `Lambda.V[1-5]E`. 

* Since a `Lambda.V extends Lambda.VE<RuntimeException>` we recommend that you always try to use a `throw` capable Lambda which ultimately depends on intetions like if you want to lambda.call() to **bubble** a non `RuntimeExceptions`. 
This way, you have the option to handle any exception in the Lambda body, as well as being able to throw an exception should you not desire to handle it in the lambda. Think of the `Runnable` interface. In that body, normally, if you say read from a file, which normally would throw an IO`Exception` you would be forced to handle it, however, using the Lambda interfaces, and calling a method that expcets a throw capable `Lambda`, that lambda will automatically be thrown by the caller `lambda.call()`.     
  

#### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and ideas on things to improve.

#### Todo
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