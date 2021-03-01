# momomo.com.Lambda
Intuitive generics based functional interfaces | Lambda | Closure skeletons with support for { void | returns | multi params } & exceptions







/**
 * TODO ( Do you wish to help us? Send us an email! )
 * Add E2 - E5 to truly cover all edge cases and possible scenarios.
 * E2 is not that uncommon, nor is E3 which is normally solved with closest common super class (usually Exception class)
 *
 * We expect everything to fit in the single file of Lambda.
 * **/



For contributors. 
VX can not really extend RX because that would require the void lambdas to return something. We instead recommend the conversion method to get to a RX.


V1 extends Consumer
V2 extends BiConsumer

R  extends Supplier
R1 extends Function
R2 extends BiFunction
  