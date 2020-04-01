# Description

     my home work for java subject in my collage




# Roadmap


# Reffrence
        
https://docs.oracle.com/javase/8/docs/api/

https://books.trinket.io/thinkjava/chapter5.html

https://beginnersbook.com/2013/12/java-string-charat-method-example/

https://www.geeksforgeeks.org/check-if-a-number-is-multiple-of-5-without-using-and-operators/

https://www.w3schools.com/java/




# Articles

@SuppressWarnings("unchecked")
https://javarevisited.blogspot.com/2015/09/what-is-suppresswarnings-annotation-in-java-unchecked-raw-serial.html

https://howtodoinjava.com/library/json-simple-read-write-json-examples/





# Books

Effective Java (2nd Edition) 2nd Edition
https://www.amazon.com/dp/0321356683?creativeASIN=0321356683&linkCode=w61&imprToken=RBJvgXqfij2miexFAaLJ3w&slotNum=1&tag=javamysqlanta-20













I use this kind of pattern often. It's very compact:

// Define a constant in your class. Use a HashSet for performance
private static final Set<Integer> values = new HashSet<Integer>(Arrays.asList(12, 16, 19));

// In your method:
if (values.contains(x)) {
    ...
}
A HashSet is used here to give good look-up performance - even very large hash sets are able to execute contains() extremely quickly.

If performance is not important, you can code the gist of it into one line:

if (Arrays.asList(12, 16, 19).contains(x))
but know that it will create a new ArrayList every time it executes.

https://stackoverflow.com/questions/7604814/best-way-to-format-multiple-or-conditions-in-an-if-statement-java
