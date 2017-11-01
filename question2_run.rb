#n doors in a row are all initially closed. 
#You make n passes by the doors. 
#The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). 
#The second time you only visit every 2nd door (door #2, #4, #6, ...). 
#The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the nth door.

#Question: What state are the doors in after the last pass? Which are open, which are closed?
#
require './question2'

puts "Enter number of doors: "
n = gets.strip.to_i
q = Question2.new(n)
puts "How many passes: "
p = gets.strip.to_i
q.check_doors(p)
q.arr.each_with_index {|val,index| puts "#{index+1} - #{val}"}
