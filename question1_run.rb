#Read the number n and Design a program that prints the numbers from 1 to n.
#But for multiples of three print "Boats" instead of the number.
#For the multiples of five print "Group". 
#For numbers which are multiples of both three and five print "BoatsGroup"
require './question1'

puts "Enter Max number: "
n = gets.strip.to_i
q = Question1.new(n)
puts q.arr
