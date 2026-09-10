
// import InheritancePackages.*;......we would have use it if our package was out of this folder
//since we are in the same folder we can directly use
package InheritancePackages;

public class AccessModifiers {

    int marks;
    public static void main(String args[]){

        Calculator c5 = new Calculator();
        int result5 = c5.add(2,3);
        System.out.println(result5);

       
    }

    
}

/*

try to make 
.
instance veriables---private
method --- public and if privacy is needed then tyu using protected
class --- public
try to avoid --- default
.
Public --- can be used anyware inside or outside the package directly
Private --- it can only be used in same class only...irespective of the package.
Default(Private-Protected) --- it can be accessed in the same package.
Protected --- in derived (parent) class and in its own sub (child) class
*/

/*
 * =============================================================================
 *                          JAVA ACCESS MODIFIERS
 * =============================================================================
 * Scope                            | Private | Protected | Public | Default |
 * ---------------------------------|---------|-----------|--------|---------|
 * Same class                       |   Yes   |    Yes    |  Yes   |   Yes   |
 * Same package subclass            |   NO    |    Yes    |  Yes   |   Yes   |
 * Same package non-subclass        |   NO    |    Yes    |  Yes   |   Yes   |
 * Different package subclass       |   NO    |    Yes    |  Yes   |   NO    |
 * Different package non-subclass   |   NO    |    NO     |  Yes   |   NO    |
 * =============================================================================
 */

