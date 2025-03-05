# Lab 6: Recursion

## Partner names:

- name 1
- name 2
- name 3

## Part A: stringClean and the String API

Open RecursiveFunctions.java.  In this file, there are two
recursive functions written for you near the top (after main and
some test functions).  Factorial you are already 
familiar with; stringClean is new.

The stringClean function takes a string input and reduces any repeated 
adjacent letters to a single char. This function changes "yyzzza" into "yza"; 
"hello" into "helo"; "bookkeeper" to "bokeper"; and "zzzzz" to "z".

Write some test cases to evaluate this function in your main method.  What words did
you test?  Do you think this function works?

__Your answer here__

Now that you've gotten some familiarity with what the program does, it's time
to investigate how it works.  You've worked with Strings in Java many times before; however, you may
still need a refresher to remember what each function does.  How could you
find information about Java's String API in order to better understand this
code?  (I know this information is up on the course webpage, but, for this
question, pretend you don't have access to that!)

__Your answer here__

Using a search engine, what terms might you use to find
the Java String API?  Try this on your search engine of choice
and report the results!

__Your answer here__

Hopefully, your search was successful, and you were able to find something
like this: 

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

The Java APIs include everything you need to program with a particular class,
with a list of functions and constructors, examples, and other information
about the class.  This is your number one resource for using new or unfamiliar
classes-most of the time, we'll introduce a class slowly, but in later courses
you may find that the API helps you understand or code with new classes.

Notice in the URL that this page specifically is for Java SE 8.  In many cases,
there may not be a substantial difference between versions of Java, 
particularly for a class like String.  Occassionally, the distinction
between versions of Java may be significant, so this is helpful to be
mindful of.

Open up the above webpage (or a similar webpage you were able to find).
Observe in the top-left corner of the screen (directly above the words "Class String")-
the include file location is written here.  This is what you'd need if you 
wanted to include this class in your own code.  The API can be a very useful 
resource if you ever need to look up any information about an in-built Java class.

Scroll down a little to the method summary.  Written here are all the
methods in the Java String class.  We can use these to find out what
each of the methods used in stringClean do.  What does the charAt 
method do?  (Hint: you can select "instance methods" to filter
what's shown to be most relevant to you.)

__Your answer here__

What does the substring function do?

__Your answer here__

Knowing this information, what do lines 51-54 of RecursiveFunctions.java do?
(That is, the second if statement in the function.)

__Your answer here__

Returning now to the structure of stringClean, what is the **base case** 
for the recursion?  And how do you know that this is the base case in this 
code? (In otherwords, what distinguishes the base case?)

__Your answer here__

Looking at this code, what is the **recursive case** for the recursion?
And how do you know that this is the recursive case in this code? (In other
words, what distinguishes the recursive case?)

__Your answer here__

This is the first time you've seen a recursive function with multiple branches;
Can you write what this program does/how it works in pseudocode?

__Your answer here__


## Part B: Two new recursive functions

Now that you've had a chance to warm up with recursion, we
will start writing our own recursive functions.

First write a recursive function to calculate the sum of the
first n integers, starting from 1.  Here are examples:

sumOfFirstN(1) = 1
sumOfFirstN(2) = 1 + 2 = 3
sumOfFirstN(3) = 1 + 2 + 3 = 6
sumOfFirstN(4) = 1 + 2 + 3 + 4 = 10
sumOfFirstN(5) = 1 + 2 + 3 + 4 + 5 = 15
etc

Notice the pattern in the way this function works.  Each sum of
the first n numbers involves computing the sum of a slightly smaller
range of numbers from the line immediately above.

- Write a formula for sumOfFirstN(5) that involves sumOfFirstN(4).

__Your answer here__

- Write a formula for sumOfFirstN(4) that involves sumOfFirstN(3).

__Your answer here__

- Do you see the pattern yet?  What is the general *recursive case*?
In other words, what is the general formula for sumOfFirstN(n),
and how big must n be for this formula to apply?

__Your answer here__

- What is the base case?  In other words, for what number(s) does
the recursive case *not* apply, and what is/are the formula(s) in 
that/those cases?

- Transform your recursive formulation into Java code.  There is 
a blank function already set up for you in RecursiveFunctions.java.
When you are done, test your code in main however you feel appropriate
(you can write a separate test function like testFac/testFib,
for instance)

__Write answer in the Java file__

Now we will repeat this process for another recursive function,
computing the powers of 2.

twoToNthPower(0) = 2^0 = 1
twoToNthPower(1) = 2^1 = 2
twoToNthPower(2) = 2^2 = 2 * 2 = 4
twoToNthPower(3) = 2^3 = 2 * 2 * 2 = 8
twoToNthPower(4) = 2^4 = 2 * 2 * 2 * 2 = 16
twoToNthPower(5) = 2^5 = 2 * 2 * 2 * 2 * 2 = 32
twoToNthPower(6) = 2^6 = 2 * 2 * 2 * 2 * 2 * 2 = 64
etc

- Following the same process as above, write formulas below
for the base case and recursive case.  Each case should also specify
for which values of n they apply (e.g., n == 1 only, or n >= 3, etc).

__Your answer here__

- Transform your recursive formulation into Java code.  There is
  a blank function already set up for you in RecursiveFunctions.java.
  When you are done, test your code in main however you feel appropriate
  (you can write a separate test function like testFac/testFib,
  for instance)

__Write answer in the Java file__

Do you feel like you understand how to create recursive methods to solve
these problems?  Do you feel like you're starting to get comfortable with
how the recursive approach works?  If not, check in!

__Your answer here__

## Part C: The Fibonacci Sequence

With some practice under our belt, let's move to a more challenging
problem: the fibonacci sequence!

The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1. Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.  If you've heard of the golden ration, that's created from the Fibonacci sequence and has been used in stock market analysis, population growth models, and many other applications!  This pattern is even found in natural phenomenon as well.

This is how the sequence is defined:

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(2) = 0 + 1  = 1
Fibonacci(3) = 1 + 1  = 2
Fibonacci(4) = 1 + 2  = 3
Fibonacci(5) = 2 + 3  = 5
Fibonacci(6) = 3 + 5  = 8
Fibonacci(7) = 5 + 8  = 13
Fibonacci(8) = 8 +13  = 21
Fibonacci(9) = 13+21  = 34
Etc.

This algorithm is different from some of what the other recursive methods we've created.
What is the **base case** for this algorithm?  (Hint: This is a trick question!)

__Your answer here__

What is the **recursive case** for this function?  

__Your answer here__

What is different about the **recursive case** for this function?  
How many recursive calls does this function have to have?

__Your answer here__

Now that you have determined the base case and the recursive case
for this function, create code to find the nth item in the fibonacci 
Sequence.  (To do this fill in the fib(int n) method of 
RecursiveFunctions.java.)

Does your code work?  Are you able to run the test function in main
to achieve correct results (see the sequence above)?

What value does your code return for fib(23)?

__Your answer here__

## Part D: Recursion Diagrams

Recall that earlier we learned how to draw "recursion diagrams"
which illustrate how a call to a recursive functions calls itself
repeatedly.  For example, take a look at the recursion diagram 
illustrating a call to fact(3).  [Open recursion-diagram-fact3.jpg or recursion-diagram-fact5.jpg
in the lab folder].

Notice how the diagram states at the top what the original function
call is (here, fact(3)), and uses indentation below to show what
that call does.  Recursion diagrams are flexible; as long as they show
the sequence of recursive calls and the return values, that's fine.
I like to use arrows to show how the return values are substituted
into return statements or calculations.  You don't need to use different
colors.

- Draw a recursion diagram for fact(4).

__Draw this on a separate sheet of paper (or a separate area
of the same paper).__

- How many total calls, including the first one, are there to the 
factorial function in your diagram?  In other words, when you call
fact(4), how many times is the fact function called (including the 
initial call)?

__Your answer here__

- Now extrapolate a general formula for how many total function
calls calling fact(n) [where n is an arbitrary integer] will take.
In other words, you should give me a formula in terms of n.

__Your answer here__

- Draw a recursion diagram for stringClean("Hello").

__Draw this on a separate sheet of paper (or a separate area
of the same paper).__

- How many total calls, including the first one, are there to the 
stringClean function in your diagram?  In other words, when you call
stringClean("Hello"), how many times is the stringClean function called (including the 
initial call)?

__Your answer here__

- Now extrapolate a general formula for how many total function
calls calling stringClean(n) [where n is an arbitrarily-sized String] will take.
In other words, you should give me a formula in terms of the size of n.

__Your answer here__

Now open recursion-diagram-fib3.jpg, which is a recursion diagram
for fib(3).  Notice because the fibonacci function makes *2* recursive 
calls per original call, the diagram is longer and slightly 
more complicated.  It is also important to note the *order* in which
the recursive calls are made.  In the diagram, time flows downward,
so it's important to note that though fib(3) recursively calls fib(2)
and fib(1), the call to fib(2) finishes *all* of its work before
the call to fib(1) begins.

- Draw a recursion diagram for fib(4).

__Draw this on a separate sheet of paper.__

- How many total calls, including the first one, are there to the
  Fibonacci function in your diagram?  In other words, when you call
  fib(4), how many times is the fib function called in total?

__Your answer here__

- Break down your answer above: when fib(4) is called, how many
times is fib(3) called?  How many times is fib(2) called?  
fib(1)?  fib(0)?

__Your answer here__

The takeaway here is that this version of the fibonacci function is
extremely inefficient.  Why should we call fib(2) more than once when
the *answer* to fib(2) is the same every time?  This applies to fib(1)
and fib(0) as well.  Later on, you will learn multiple ways to 
make this computation more efficient that can be extrapolated to 
other types of problems as well.

**Congratulations!  You finished the first lab on recursion!**