require 'minitest/autorun'
require './question1'

class TestQuestion1 < Minitest::Test

  def setup
    @q = Question1.new(15)            #Make array max 15 numbers
  end

  def test_multiples_of_three
    assert_equal @q.arr[2], "Boats"   #Multiples of 3
    assert_equal @q.arr[2], @q.arr[5] #Multiples of 3
  end

  def test_multiples_of_five
    assert_equal @q.arr[4], "Group"   #Multiples of 5
    assert_equal @q.arr[4], @q.arr[9] #Multiples of 5
  end

  def test_multiples_of_three_and_five 
    assert_equal @q.arr[14], "BoatsGroup"  #Multiples of 3 and 5
  end
end