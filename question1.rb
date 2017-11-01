#Read the number n and Design a program that prints the numbers from 1 to n.
#But for multiples of three print "Boats" instead of the number.
#For the multiples of five print "Group". 
#For numbers which are multiples of both three and five print "BoatsGroup"
class Question1

  attr_reader :arr

  def initialize (n)
    @arr = Array.new(n) { |i| process(i) }
  end

private

  def process (i)
    i+=1
    if i%3 == 0
      if i%5 == 0
        "BoatsGroup"
      else
        "Boats"
      end
    else
      if i%5 == 0
        "Group"
      else
        "#{i}"
      end    
    end
  end

end