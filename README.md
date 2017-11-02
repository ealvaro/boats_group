Boats Group interview questions
===============================

Question 1:
-----------

Design a program that prints the numbers from 1 to 100. But for multiples of three print "Boats" instead of the number and for the multiples of five print "Group". For numbers which are multiples of both three and five print "BoatsGroup"

#### For example:
```shell
Enter Max number: 100
1
2
Boats
4
Group

[more execution...]

98
Boats
Group
```

#### Solution:
##### In Ruby
to run it
```ruby
    ruby question1_run.rb
```
to test it
```ruby
    ruby question1_test.rb
```
##### In Java
to run it
```shell
javac Question1.java
java Question1
```
to test it
```shell
javac -cp junit-4.12.jar:. Question1Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.rc2.jar org.junit.runner.JUnitCore Question1Test
```


Question 2:
-----------

100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). The second time you only visit every 2nd door (door #2, #4, #6, ...). The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.

What state are the doors in after the last pass? Which are open, which are closed?

#### For example:
```shell
Enter number of doors: 100
1 - closed
2 - open
3 - open
4 - closed
5 - open
6 - open

[more execution...]

98 - open
99 - open
100 - closed
```

#### Solution:
##### In Ruby
to run it
```ruby
    ruby question2_run.rb
```
to test it
```ruby
    ruby question2_test.rb
```
##### In Java
to run it
```shell
javac Question2.java
java Question2
```
to test it
```shell
javac -cp junit-4.12.jar:. Question2Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.rc2.jar org.junit.runner.JUnitCore Question2Test
```