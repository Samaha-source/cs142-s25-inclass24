# Lab 8: Recursion

## Partner names:

- name 1
- name 2
- name 3

## Part A: New recursive functions!

Open RecursiveFunctions2.java.  In this file, there are three
recursive functions written for you near the top (after main and
some test functions). "Funky" is a variant of the "weird" function from 
this week, but all other funtions are new.

In this file, consider the function createSumTriangle. In this function, the program must display (print) a sum triangle as 
described in the JavaDoc code comment.  

What is the base case for this problem?

__Your answer here__

What is the recursive case?

__Your answer here__

Design a function to create a sum triangle in RecursiveFunctions2.java.  Now design/use a test case so that you can verify that your function works!  Does it?  What did you use as a test case, and what was the result?

__Your answer here__

How many recursive calls would your program make for an array of size n?

__Your answer here__

You've looked at problems like this before...Thinking about some of the work we've done in class, how would you go about reversing
the output above with recursion?  (For example, instead of an output of:
		[15]
      [1, 14]
      [1,2,12]
      [1.2.3,9]
      [1,2,3,4,5]
You would like an output of:
[1,2,3,4,5]
[1,2,3,9]
[1,2,12]
[1, 14]
[15]
)

What might we change in the program to achieve that result?  (Hint: Think of our classwork with weird.)

__Your answer here__

Next, what would you do to find the largest element in an array recursively?  What would your base case
and recursive case be?

__Your answer here__

How many recursive calls would you need to solve this problem?

__Your answer here__

Write this function in the findTheLargestElementFunction, then design a test case for it.  Were you successful?  What was the test case and the output?

__Your answer here__

Finally, the "funky" function is a modified version of the weird function we've been looking at in class.
Notice that, instead of two recursive calls, three recursive calls are made.  What do you think that means for the output?

__Your answer here__

Conceptually, how is this different from when we were doing weird's recurse/print/recurse condition?  How is the tree
created by the execution of this program different?

__Your answer here__

Before running this program, think of what the output would look like.  What do you expect the output to be for 
n = 3?

__Your answer here__

Run the program-was your answer correct?

__Your answer here__

Run the program a few more times with numbers of your choosing.  Thinking about how the program operates, how would you 
describe the pattern of what it's doing?

__Your answer here__


## Part B: The Tower of Hanoi

The *Tower of Hanoi* is a famous puzzle with a deceptively simple 
recursive solution.  

There are many made-up stories about the origin of this puzzle, 
but supposedly in Hanoi there is a temple or monastery with three 
tall posts.  At some point in history, 64 golden disks of different 
sizes were placed on one of the posts, each disk rests on the disk
of the next largest size.  Supposedly, the priests of the temple or
the monks of the monastery must transfer all the disks from the first
post to the third post, but this must be done in such a way that
a disk never rests on a disk below it of a *smaller* size.

Open up this link to see how the game works for 3 disks:

https://www.mathsisfun.com/games/towerofhanoi.html

- Play the game for 3 disks on the webpage.  Use your mouse to drag the 
disks from post to post, but you must never drag a larger disk onto 
a smaller one. How many moves did it take you?  (the webpage counts for you)

__Your answer here__

- Play the game for 4 disks.
  How many moves did it take you?  

__Your answer here__

There is a "simple" recursive solution to solve this puzzle for any
number of disks.  The recursion is as follows:

To move a stack of "n" disks from post A to post C using post B
as an intermediate spot:

  - If n == 1, then move the one disk directly from A to C.
  - If n > 1, do the following:
    - (1) Move the topmost stack of n-1 disks from A to B, using C as the 
          intermediate post.
    - (2) Move the one remaining disk on A to C.
    - (3) Move the stack of n-1 disks currently on B (that we moved in step #1)
          to C (using A as the intermediate).

This remarkable algorithm works because it describes how to move a stack of n
disks as moving a stack of n-1 disks to the "intermediate" post B, 
followed by moving one disk from A to C, then moving the stack on intermediate
post B to its final destination.  Now, of course we cannot move a stack of n-1
disks all at once, so steps (1) and (3) are done recursively.  It is interesting
that this algorithm never causes a larger disk to be placed on top of a smaller 
one.  

Open TowerOfHanoi.java and TowerOfHanoiDemo.java.  Run TowerOfHanoiDemo.  You 
will see the solution for 3 disks run.  You can change the arguments to the
TowerOfHanoi constructor (3, 1000) to alter the number of disks and the pause
time between moves.  Run this for larger numbers of disks: try at least 3, 4, and 5,
though this will handle larger numbers!  (Try 10 or 20 or 64!)

Though this puzzle seems like an interesting use of recursion, it's not quite
clear why it's useful to study, but it turns out the solution has a number of
interesting properties.  First we will look at the *number of moves* that the
recursive algorithm makes in total for n disks.

- Modify the Java code to count the total number of moves the algorithm makes.
A "move" is only when the algorithm actually moves a single disk between posts,
not a recursive call.  Your code should print out the total number of moves
that are made in the game.  Hint: add a new variable to use as a counter,
and increment it whenever a move is made.  Hint 2: 2 disks requires 3 moves,
and 3 disks requires 7 moves.

- How many moves does 4 disks require?  5 disks?  6 disks?  Keep running on 
larger numbers of disks until you figure out the pattern in the number of
required moves.  Hint: It is connected to a function you wrote earlier today.
What is the pattern/formula for number of moves if you start with n disks?

__Your answer here__

- There is another interesting pattern as well.  Adjust the program to run with
just 2 disks, and have the pause time be long enough that you can follow *which*
disk is moving at every step.  If we call the smaller disk size 1, and the larger
disk size 2, write down the size of the disk that moves at each of the three
steps of this puzzle:  (so you should write 3 numbers below)

__Your answer here__

- This gets tedious and harder to do by hand as we add more disks, so let's have 
Java print the size of the disk that is moving for us instead.  Modify the Java 
code to do this.  Hint: this is the variable "topDisk" in the recursive function.
Run your code for 2 disks (verify it matches your answer above), 3 disks, 4 disks,
and 5 disks.  Where have you seen this pattern before?

__Your answer here__

- Compare the tower of Hanoi recursive function to the other recursive function
that produces this same pattern, in particular the *recursive* cases of each
function.  Why do you think each function, even though they are written for 
completely different tasks, produces the same output?

__Your answer here__

- Often, the Tower of Hanoi puzzle backstory includes a claim that after the monks
or priests move all 64 disks from the first post to the last one, following the
rules, the world will end.  Assuming they can move one disk per second, how long
will it take them to finish?

__Your answer here__

## Final check

Once you have finished the lab, make sure to submit your files to Canvas!  **Both** partners are required to submit the completed assignment!

Each week, you need to submit **your programming files** and your **text file** (this file, with your answers filled in).   Make sure that your .java file has a header comment on it with **your teams' names**.  Your text file also needs to have the names of both team members at the top.

After you submit your files to Canvas, I strongly encourage you to go back and double-check:
- That you have submitted both the programming files and the text file.
- That both files have your changes and latest updates in them.
- That the programming file has a header with team names and honor code and that the text file has team names as well.

It is your responsibility to submit these files to Canvas so be careful to avoid missing or unedited files.