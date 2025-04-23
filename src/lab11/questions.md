# Lab 11: Inheritance in app design

In this lab, you will practice using polymorphism and test the limits of polymorphic design.  You'll work through a real-life example of how polymorphism can be used to help us solve programming problems.  

(Note that this lab has a bonus assignment built into it; if you're able to complete the full lab you'll get three bonus points on your lab grade.  If you complete only Parts A and B, you'll get credit for the lab but no bonus points.)

## Names:

- Name 1
- Name 2
- Name 3

## Part A (worth 4 out of 10 points)

Professor Phillips has (for the last long while) been working on an app related to ABA (Applied Behavior Analysis) Therapy\*.  After one too many bugs in his program, he has assigned your team to work on part of the app.

In this app, users are quizzed based on questions from an input file.  Each correct answer gives the user points, with multiple correct answers increasing their combo.  Run QuizDemo and try to answer the questions.  Fair warning, these questions are both pretty challenging (and sometimes silly)!

Run QuizDemo once or twice and try to answer the questions.

- What was your score at the end of the round?

**A1:** __Your answer here__

The program is set up with two types of questions: true/false and multiple choice.  Programmatically, both of these classes are created as children of the Question class.

- Looking only at the Question class, what variables do you know are contained in both TFQuestion and MCQuestion? (Hint: Since these classes inherit from Question, they contain all instance variables from the Question class.)

**A2:** __Your answer here__

- Notice that Question is an abstract class.  What do you think will happen if you try to create an instance of Question in QuestionDemo.java? 

**A3:** __Your answer here__

- Inside the Question class, there is a function called toString() that returns a String representation of the Question object.  Neither TFQuestion or MCQuestion override this method.  What do you think would print out if you called System.out.println on a TFQuestion?

**A4:** __Your answer here__

- On an MCQuestion?

**A5:** __Your answer here__

- Why would we want to have both abstract methods and reglar methods in this class?  (In other words, why would we use a regular method like toString()?  Why/Under what conditions would we use an abstract method like evaluateAnswer()?)

**A6:** __Your answer here__

Now that we've explored some of how the Question family of classes operate, let's focus on how the program runs.  We will come back to these ideas shortly so remember what we've talked about above!

Initially (in initializeQuizEnvironment in the QuizDemo class), the quiz questions and answers are populated into an ArrayList based on String tokenization.  We've dealt with string tokenization before, so I won't ask you to answer any questions about that part of this function.  However, we do see something new here...

- Inside this function you see a try block set up like other conditional statements.  What do you think this statement does?  Does the code inside the try statement run?

**A7:** __Your answer here__

- What do you think the corresponding catch statement does?

**A8:** __Your answer here__

- Try/catch/finally statements are ways that we can exert more control over the errors our functions might generate-whether those are errors introduced by user input or errors from some other source.  Try changing the file name to an invalid name so that it produces an error.  What code runs now?

**A9:** __Your answer here__

What do you think e.getMessage() refers to?  Why is that important?  

**A10:** __Your answer here__

What happens if you change the content of the print statement in the catch block?

**A11:** __Your answer here__

Notice that the print statement in the catch statement is a little different from the ones we're used to using.  What do you think System.err.println() does?  What do you think would happen if we changed it to System.out.println?  Try this and see!

**A12:** __Your answer here__

Rewrite this code so that it will continue asking the user to enter a filename until the file name is correct.  What was your solution to do this?  (A broad description is fine here.)

**A13:** __Your answer here__

Note that you should be careful with a situation like this!  It's possible, if you're asking Java to do something illegal, that you'll get into an infinite loop with some of these sorts of strategies.  In general programming, it's often the best choice to have some sort of variable to limit the number of repetitions so that an infinite loop/infinite guesses aren't possible.



\* This is a real thing, actually!  This lab is based on a modified version of one of the problems I ran into with said app.  The code and language aren't the same...but the idea is!!

## Part B (worth 3 out of 10 points)

In Part B, we'll explore class design with polymorphism and see how we can use it to add functionality to an existing structure (and some of the potential problems with that!).

Specifically, Professor Phillips has tasked your team with adding a new type of Question to this program.  He has talked with the stakeholders, and they specifically want short answer questions where the user has to type the answer from their own memory without any sort of hint. This section will be all about adding a SAQuestion (short answer question) class to the lab!

A note about this: This section will be a lot more about debugging and analyzing your code, as opposed to learning something new.  In my time in computer science, I've found that I spend much, much more time debugging, expanding, or fine-tuning my code than I do writing new code.  This lab is specifically about the experience of extending an existing class and is a big part of the reason behind object-oriented programming.  With good design choices, it can be much easier to extend a project to do something new or different, and I hope this helps you see how that often happens.

Back to the lab proper!  Take a moment (at least four minutes) to think about what you'll need to do to add the SAQuestion class to the project.  During this time, you can look through the code, but I ask you not to add anything yet.  (And feel free to discuss with your partner as well!)

Add your notes/thoughts/design below:

**B1:** __Your answer here__

Will your new class use inheritance?  Will that simplify your job or make it harder?  (I'm interested in your perspective here; there's no one right answer!)

**B2:** __Your answer here__

Do you think that you'll need to change anything in the QuizDemo class after you write your SAQuestion class?

**B3:** __Your answer here__

Now that you've thought a little bit about how you'll approach this problem, go ahead and write your SAQuestion class.  Did you run into any bugs writing it?  

**B4:** __Your answer here__

Some things to think about/debug for your SAQuestion class:
-Do you need to do anything different with your input format?
-Will you need any different arguments or parameters for your functions (as compared to the other two question classes)?
-Will your SAQuestion class need any unique instance variables?

Now that you've written the class, let's test it!  In this part of the lab, you'll create and add in your own short answer question to questionInputs.txt.  Before doing this, though, open questionInputs.txt and take a look at the file.  There's a pattern in how each question is formatted.  How do you think the inputs are ordered?  (Hint: Each item is seperated by a semicolon.)

**B5:** __Your answer here__

Another thing of interest in the input file: notice the use of "newLine" throughout the file.  This is here because our normal approach to add in a new line (using \n) doesn't work thanks to some formatting differences.  As you write your question, feel free to use newLine to format your question as desired.

Now you can go ahead and add in your question!  You can even add several, if you prefer.  Run your program a few times until you encounter your SAQuestion.  (To make this a little quicker, you can delete some of the other questions in the text file.)  What happens when you encountered the SAQuestion?

**B6:** __Your answer here__ 

If your program runs perfectly on the first try, there's no more to do here!  (And props!  Getting a change like this working 100% the first time is qutie challenging!)

If your program does have issues, though, spend some time thinking about why.  Track down where the error is occuring in your code.  Why is your program doing this?

**B7:** __Your answer here__

To finish out Part B, find and debug any remaining issues in your code.  Were you able to get your short answer question working as desired?

**B8:** __Your answer here__

## Part C (worth 3 out of 10 points)

This section is the bonus section; this is entirely optional but will give you one bonus points on your lab grade for each of them you complete.  There's less guidance here, but I'm confident that you'll be able to solve all of these problems!  (Think of this as similar to the challenge problems from the projects.)

**C1:** The stakeholders are very pleased with your version of the quiz game!  However, they'd like you to add a feature to prevent questions from being asked a second time.  It is up to you to decide if questions can't be repeated at all (until all questions are used) or if they can only be repeated after a specific time.

Did you complete this and test it to see if it works?

__Your answer here__

**C2:** The stakeholders want a more challenging version of the game-create a version of the game that asks questions until the user gets a certain number of questions wrong!

Did you complete this and test it to see if it works?

__Your answer here__

**C3:** Finally, the stakeholders are excited and want to make this game the next big e-sport!! (They are severely misguided in this.)  Create a version of the game that supports a leaderboard with names and scores (ie, a high score board).  To have this leaderboard be permanent, you'll need to use file input/output and have a way of both reading from the leaderboard file and modifying the leaderboard file if the high score needs to be updated.

Did you complete this and test it to see if it works?

__Your answer here__

In addition to these challenges, feel free to come up with your own interesting features to add to the quiz game!





