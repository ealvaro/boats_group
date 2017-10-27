#n doors in a row are all initially closed. 
#You make n passes by the doors. 
#The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). 
#The second time you only visit every 2nd door (door #2, #4, #6, ...). 
#The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the nth door.

#Question: What state are the doors in after the last pass? Which are open, which are closed?
#
n = gets.strip.to_i
arr = Array.new(n, 'open')
for i in (1..n) do
  for d in (1..n)
    if d%i == 0  #visit the door
      if arr[d-1] == 'open'
        arr[d-1] = 'closed'
      else
        arr[d-1] = 'open'        
      end
    end
  end
end
for d in (0...n)
  puts arr[d]
end
