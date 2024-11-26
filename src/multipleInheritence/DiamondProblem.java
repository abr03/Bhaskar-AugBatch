/*
 * package multipleInheritence;
 * 
 * public class DiamondProblem {
 * 
 * Diamond Problem: The Diamond Problem is a particular issue that arises in
 * multiple inheritance scenarios, where a class can inherit from two classes
 * that have a common base class. This situation creates ambiguity about which
 * path of inheritance should be followed to inherit properties from the common
 * base class.
 * 
 * Example of the Diamond Problem: Consider the following example:
 * 
 * ClassA is the base class. ClassB and ClassC both inherit from ClassA. ClassD
 * inherits from both ClassB and ClassC.
 * 
 * 
 * 
 * 
 * 
 * ClassD inherits from both ClassB and ClassC.
 * 
 * ClassA
       /  \
    ClassB  ClassC
       \    /
       ClassD
 * 
 * Why the Diamond Problem Occurs: Ambiguity: When ClassD tries to access a
 * method from ClassA, the compiler doesn't know whether to use the version from
 * ClassB or ClassC since both of them inherited from ClassA. Confusion in
 * Hierarchy: Multiple inheritance creates confusion in the hierarchy, which
 * leads to unexpected behavior in the program. Solution: Most modern
 * programming languages like Java avoid multiple inheritance of classes to
 * prevent the diamond problem. Instead, they provide interfaces. In Java, a
 * class can implement multiple interfaces, but it can only inherit from one
 * class.
 * 
 * }
 */