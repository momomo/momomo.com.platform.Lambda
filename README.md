## momomo.com.plaform.Lambda

##### Intuitive generics based functional interfaces
###### Support for void, returns, multiple params & exceptions
 
Ever confused of names like `Supplier`, `Function`, `BiFunction`, and so forth? Do you find them limiting? Can you keep track of them? Can you easily convert one to another?   

With this library, you can refer to: 
* `Lambda.V1` for a void lambda that takes one generic parameter.
* `Lambda.V2` for a void lambda that takes two generic parameters.
* `Lambda.R1` for a returning lambda that has a defined return type and takes one generic parameter.
* `Lambda.R2E` for a returning lambda that has a defined return type and takes two generic parameters, and allow you to define the thrown Exception type as well!

Also, going from `Lambda.R2E` `lambda` to a `Lambda.V2E`, is as easy as calling `lambda.V2E()`;

A great number of libraries has been built on top of this intuitive concept.    

#### [Lambda.java](src/momomo/com/platform/Lambda/Lambda.java)
Documentation through comments are provided within the class itself. 

#### Examples:  

* [Lists.java](src/momomo/com/platform/Lambda/examples/Lists.java)

  ![Lists.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/exampe.lists.2021.03.04.png?raw=true)


* [IO.java](src/momomo/com/platform/Lambda/examples/IO.java)

  ![Lists.java](https://github.com/momomo/momomo.com.github.statics/blob/master/momomo.com.platform.Lambda/graphics/exampe.io.2021.03.04.jpg?raw=true)

#### Other
Note that whenever possible, the interfaces implement equivalent interfaces such as `Consumer`, `BiConsumer`, `Function`, `Supplier`, `Runnable` and can thus be used and fed to methods expecting those allowing you to stick with using this consistent naming pattern.

#### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and ideas on things to improve.    

   
   