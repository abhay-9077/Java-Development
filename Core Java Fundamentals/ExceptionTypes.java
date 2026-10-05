//top to bottom...leves of class
/*
Object
   ↓
Throwable
   ├── 1)Error..(Cant be handled)
   │    ├── OutOfMemoryError
   │    └── StackOverflowError
   │
   └── 2)Exception..(We can handle)
        ├── RuntimeException          ← UNCHECKED...(Optional...if we want to handle or not)
        │    ├── ArithmeticException
        │    ├── NullPointerException
        │    ├── ClassCastException
        │    ├── IllegalArgumentException
        │    │    └── NumberFormatException
        │    ├── IndexOutOfBoundsException
        │    │    ├── ArrayIndexOutOfBoundsException
        │    │    └── StringIndexOutOfBoundsException
        │    ├── IllegalStateException
        │    └── UnsupportedOperationException
        │
        └── Other Exceptions          ← CHECKED...(Should be handled)
             ├── IOException
             │    ├── FileNotFoundException
             │    └── EOFException
             ├── SQLException
             ├── ClassNotFoundException
             └── InterruptedException
 */



public class ExceptionTypes {
     public static void main(String[] args) {
        
    }
}
