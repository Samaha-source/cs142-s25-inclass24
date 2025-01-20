# Wheel of Fortune

Team members:

1. Team member 1
2. Team member 2

## Before you begin...

There are a few things that you should know about this lab assignment:

   By default, you will edit this file using [markdown](https://commonmark.org/help/).  You can also copy and paste this into another text file of your choice (.txt, .docx, .rtf, etc) if you prefer; the main purpose of this file is to walk you through lab assignments step by step.
   This is also where you will write your answers, and this edited file will be
   what you submit for your lab submission.  Once you submit, make sure to double-check that you have submitted a filled-in text file for the assignment.

## Goals

By the time that you are done with this activity, you
should be able to:

* remember how to use `for` loops to iterate over arrays,
* use arrays in different ways to solve problems,
* and learn some things about Strings in Java.

## Playing the Game

Run `WheelOfFortune.java` to play the game. It is a two-player game:
the first player should enter an English phrase in all lowercase letters
that the second player will have to guess, letter by letter.
You should play a few times before answering the questions. Limit yourself to ~5 minutes.

Note that to answer these questions, you may need to go back and play
the game again to answer some of the questions to come. But you should
do so __deliberately__, in order to answer a specific question or test for a potential bug.

## Part A:

- When is the game won?

  __Answer__:

- Can you guess the same letter twice?  What happens when you do this?

  __Answer__:

- What happens if you enter a secret phrase in uppercase and lowercase letters,
and then guess letters in the opposite case?  (Like the puzzle has a capital "A"
but you guess a lowercase "a"?)

  __Answer__:

- Is it possible to lose the game (without deliberately crashing the program)?
Why or why not?

  __Answer__:

### If you feel comfortable with the game, go onto Part B.
### Otherwise, check-in with me to clear up any confusion.

## Part B:

In Part B, you will explore the inner workings of this game
and how it is implemented in Java.

- What is the data type of the secretArray variable first declared on line 17?

  __Answer__:

- What is the data type of the guessedLetters variable first declared on line 12?

  __Answer__:

These data types are different!  They are both used to store sequences of 
characters, and we could have written the program using only one type, but 
I wanted you to practice with both types.

Now look at the countLetter function.

- What data type does this function return?

  __Answer__:

- What does the variable `secretArray.length` correspond to?

- Explain what the line of code `if (secretArray[i] == letter)` does:

  __Answer__:

- Once you understand that line, write a sentence or two explaining how
the entire function works.  Don't just repeat *what* the function does, tell
me *how* it does it in a way another CS142 student could understand.

  __Answer__:

- Would this function work if I moved the line of code `return count` inside
the for loop?  Why or why not?

  __Answer__:

- Would this function work if I moved the line of code `int count = 0` inside
  the for loop?  Why or why not?

  __Answer__:

### Check in with me if you have any questions!

## Part C

- Go back to the main function.  Explain what the line of code
  `guessedLetters += letter;` (line 35) does.  Hint: This would work
  the same way in Python.

  __Answer__:

- Now look at the makePuzzleArray function.  What data type does this function
return?  

  __Answer__:

- Explain what the line `char[] puzzleArray = new char[secretArray.length];` does.
In particular, how big is the new array compared to the old array?

  __Answer__:

- Look in the official Java documentation online for the String class, then find
the `indexOf` function inside this class.  What does this function do?

  __Answer__:

- When does indexOf return -1?

  __Answer__:

- Using what you now know about indexOf, explain what the line of code 
`if (guessedLetters.indexOf(secretArray[i]) != -1)` checks for.

  __Answer__:

- Comment out lines 56 and 57 (place double-slashes before each line) and re-run
the game.  What changes about the way the puzzles are displayed?

  __Answer__:

- Uncomment lines 56 and 57.  Explain why these two lines are needed in the program.

  __Answer__:

- Comment out lines 59 and 60 (place double-slashes before each line) and re-run
  the game.  What changes about the way the puzzles are displayed?

  __Answer__:

- Uncomment lines 59 and 60.  Explain why these two lines are needed in the program.

  __Answer__:

- Back in main(), why is line 39 needed in the program?  (This one:)
`puzzleArray = makePuzzleArray(secretArray, guessedLetters)`?
If you're not sure, comment out this line and play the game!

  __Answer__:

### Do you feel like you understand what the code is doing? If not, stop and check in with me!

## Part D

In this last section, you will add some enhancements to the program!

- The first change is to prevent the user from guessing the same letter twice
  (or at least print an error message when they do so).  
  Modify the program to make this change (print an error message if they try to
  guess a letter they've already guessed.)
  Hint: Use indexOf on the `guessedLetters` variable in the main function.

- Next, in the real Wheel of Fortune game, each player may spin a large wheel
before they guess a letter than has various amounts of money on segments of 
the wheel.  When they guess a letter that appears in the puzzle, they earn the
amount of money the wheel is pointing to *per* letter in the puzzle that they
guess.  For instance, if the wheel lands on $200, and they guess the letter "T,"
and the puzzle has three "T"'s, then they earn $200 x 3 = $600 total.  Change
the game so before the contestant guesses a letter, the program generates
a random number between 1 and 1000 that will be the amount of money they spin.
If they successfully guess a letter, they earn that amount of money times
the number of times the letter appears.

- Lastly, in the real game, vowels work differently: they *cost* money!
Modify the game so that if the contestant guesses a vowel, they don't earn
money, but $100 per vowel they guess is deducted from their total amount of money.

## Final check

Once you have finished the lab, make sure to submit your files to Canvas!  **Both** partners are required to submit the completed assignment!

Each week, you need to submit **your programming files** (which will just be WheelOfFortune.java this week) and your **text file** (this file, with your answers filled in).   Make sure that your .java file has a header comment on it with **your teams' names** and **the honor pledge** ().  Your text file also needs to have the names of both team members at the top.

After you submit your files to Canvas, I strongly encourage you to go back and double-check:
- That you have submitted both the programming files and the text file.
- That both files have your changes and latest updates in them.
- That the programming file has a header with team names and honor code and that the text file has team names as well.

It is your responsibility to submit these files to Canvas so be careful to avoid missing or unedited files.