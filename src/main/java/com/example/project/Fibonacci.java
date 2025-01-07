package com.example.project;

public class Fibonacci {
  // instance variable
  private int[] sequence;

  /** Constructor: sets sequence to an array containing the first seqLen numbers
      in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
      previous two numbers to generate the next number,
      e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…

      All Fibonacci sequences start out with 0 and 1 as the first two numbers.

      PRECONDITION: seqLen >= 2
    */
  public Fibonacci(int seqLen) 
  {
     // if (seqLen >= 1)
    // {
    //   sequence[0] = 0;
    // }
    // if (seqLen >= 2)
    // {
    //   sequence[1] = 1;
    // }
    // if (seqLen >= 2)
    // {
    //   for (int i = 2; i < seqLen; i++)
    //   {
    //       sequence[i] = sequence[i - 1] + sequence[i-2];
    //   }
    // }
    sequence = fibonnaciArrayMaker(seqLen, sequence);
   
  }

  public int[] fibonnaciArrayMaker(int seqLen, int[] seq)
  { 
    seq = new int[seqLen];
    if (seqLen >= 1)
    {
      seq[0] = 0;
    }
    if (seqLen >= 2)
    {
      seq[1] = 1;
    }
    if (seqLen >= 2)
    {
      for (int i = 2; i < seqLen; i++)
      {
          seq[i] = seq[i - 1] + seq[i-2];
      }
    }
    return seq;
  }

  /** Getter method: returns a reference to the sequence array
    */
  public int[] getSequence() {
    return sequence;
  }

  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
    if (searchVal == 1)
    {
      return 1;
    }
    else
    {
      int i = 0;
      for (int num : sequence)
      {
        if (num == searchVal)
        {
          return i;
        }
        i++;
      }
    }
    return -1;
  }

  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonnaci sequence

      For example, if sequence is {0, 1, 1, 2, 3, 5} and this method is called
      with howManyMore = 3, sequence would be assigned to a new array with
      the next 3 Fibonacci numbers added: {0, 1, 1, 2, 3, 5, 8, 13, 21}
   */
  public void extendBy(int howManyMore) 
  {
      int seqLen = sequence.length + howManyMore;
      sequence = new int[seqLen];
      sequence = fibonnaciArrayMaker(seqLen, sequence);
  }

  /** Returns a string that represents the sequence array nicely formatted, for
   *  example, if sequence == [2, 3, 7], this method should return the String
   *  "[2, 3, 7]"
   *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
   */
  public String fibonacciString() {
    return ArrayPrinter.formatIntNicely(sequence);
  }
}
