/*==================================================
  interface List 
  Declares methods that will be implemented by any 
  class wishing to adhere to this specification.
  This interface specifies behaviors of a List of 
  generically typed Objects.
  The <T> in the interface header indicates that this List
  is intended to hold Objects of a single common type.
  T is a placeholder, to be replaced at time of 
  instantiation by any valid Java type (a class, abstract class,
  or interface name).
  ==================================================*/


public interface List<T> {

    // Return number of meaningful elements in the list
    int size();

    // Append an element of type T to the end
    boolean add( T obj ); 

    // Insert an Object of type T at index
    void add( int index, T obj ); 

    // Retrieve the element at index
    T get( int index );

    // Overwrite the element at index
    T set( int index, T obj );

    // Remove the element at index,
    // shifting any elements after it to the left
    T remove( int index );

}//end interface
