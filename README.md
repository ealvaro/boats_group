Boats Group interview questions
===============================

Question 1:
-----------

Design a program that prints the numbers from 1 to 100. But for multiples of three print "Boats" instead of the number and for the multiples of five print "Group". For numbers which are multiples of both three and five print "BoatsGroup"

#### For example:
1
2
Boats
4
Group
[more execution...]
98
Boats
Group

If you want to run the Java version do the following
```shell
javac Question1.java
java Question1
```

If you want to run the Java Tests do the following
```shell
javac -cp junit-4.12.jar:. Question1Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.rc2.jar org.junit.runner.JUnitCore Question1Test
```



Question 2:
-----------

100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). The second time you only visit every 2nd door (door #2, #4, #6, ...). The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.

What state are the doors in after the last pass? Which are open, which are closed?

Solution:
--------


If you want to run the Ruby version do the following
```ruby
    ruby question1.rb
```

If you want to run the Java Tests do the following
```shell
javac -cp junit-4.12.jar:. Question2Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.rc2.jar org.junit.runner.JUnitCore Question2Test
```