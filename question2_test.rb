require 'minitest/autorun'
require './question2'

class TestQuestion2 < Minitest::Test

  def setup
    @q = Question2.new(9)            #Make array of 9 doors
  end

  def test_initially_all_doors_open
    @q.check_doors(0)
    @q.arr.each {|s|  assert_equal s, "open"}      #All doors are open
  end

  def test_first_pass_all_doors_closed
    @q.check_doors(1)
    @q.arr.each {|s|  assert_equal s, "closed"}    #All doors are closed 
  end

  def test_last_door_closed_after_9_passes
    @q.check_doors(9)
    assert_equal @q.arr.last, "closed"  #Last door is closed
  end

  def test_last_door_open_after_10_passes
    @q = Question2.new(10)            #Overwrite array of 10 doors
    @q.check_doors(10)
    assert_equal @q.arr.last, "open"  #Last door is open now
  end

end