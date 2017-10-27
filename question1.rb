
#Read the number n and Design a program that prints the numbers from 1 to n.
#But for multiples of three print "Boats" instead of the number.
#For the multiples of five print "Group". 
#For numbers which are multiples of both three and five print "BoatsGroup"

n = gets.strip.to_i
for i in (1..n) do
  if i%3 == 0
    if i%5 == 0
      puts "BoatsGroup"
    else
      puts "Boats"
    end
  else
    if i%5 == 0
      puts "Group"
    else
      puts i
    end    
  end
end