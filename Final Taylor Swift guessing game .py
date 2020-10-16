#!/usr/bin/env python
# coding: utf-8

# In[2]:


Q1 = '''What is Taylor's middle name?'''
Q2 = 'What record company first signed Taylor?'
Q3 = 'What celebrity was Taylor named after?'
Q4 = '''“Back To December” is about someone Taylor dated from August to November. Which of her exes inspired this song?'''
Q5 = '''In 2012, Taylor made the Guinness World Records for the Fastest Selling Single in Digital History. Which song broke the record?'''
Q6 = 'Which instrument does Taylor NOT know how to play?'
Q7 = 'What animal did Taylor swift reference in her social media during the lead up to the release of the reputation album?'
Q8 = 'What was the first song Taylor ever released?'
Q9 = 'How many Grammys did she win in 2010?'
Q10 = '''What's Taylor's favorite number?'''


# In[3]:


A1 = 'Allison'
A2 = 'Big Machine'
A3 = 'James Taylor'
A4 = 'Taylor Lautner'
A5 = '22'
A6 = 'Clarinet'
A7 = 'Snake'
A8 = 'Tim McGraw'
A9 = ' four'
A10 = 'thirteen'
questions = [Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10]
answers= [A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]


# In[8]:


Q1 = '''What is Taylor's middle name?'''
Q2 = 'What record company first signed Taylor?'
Q3 = 'What celebrity was Taylor named after?'
Q4 = '''“Back To December” is about someone Taylor dated from August to November. Which of her exes inspired this song?'''
Q5 = '''In 2012, Taylor made the Guinness World Records for the Fastest Selling Single in Digital History. Which song broke the record?'''
Q6 = 'Which instrument does Taylor NOT know how to play?'
Q7 = 'What animal did Taylor swift reference in her social media during the lead up to the release of the reputation album?'
Q8 = 'What was the first song Taylor ever released?'
Q9 = 'How many Grammys did she win in 2010?'
Q10 = '''What's Taylor's favorite number?'''

A1 = 'Allison'
A2 = 'Big Machine'
A3 = 'James Taylor'
A4 = 'Taylor Lautner'
A5 = '22'
A6 = 'Clarinet'
A7 = 'Snake'
A8 = 'Tim McGraw'
A9 = ' four'
A10 = 'thirteen'

class Question:
     def __init__(self, prompt, answer):
            self.prompt = prompt
            self.answer = answer

question_prompts = [
     '''Question 1: What is Taylor's middle name? \n(a) Audrey\n(b)Michelle\n(c)Allison''',
     "Question 2: What record company first signed Taylor?\n(a) Big Machine\n(b) Broken Bow Music Group\n (c) Legacy",
      'Question 3: What celebrity was Taylor named after?\n(a) Elizabeth Taylor\n(b) James Taylor\n(c) Taylor Caldwell',
    'Question 4: ' +Q4+'\n(a) Taylor Lautner\n(b) Jordan Alford\n(c) Drew Hardwick',
    'Question 5: ' +Q5+'\n(a) Shake it off\n(b) Love Story\n(c) 22',
     'Question 6: ' +Q6+'\n(a) Piano\n(b) Clarinet\n(c) Ukulele',
    'Question 7: ' +Q7+'\n(a) Snakes\n(b) Cats\n(c) Eagle',
     'Question 8: '+Q8+'\n(a) George Strait\n(b) Tim McGraw\n(c) Dolly Parton',
     'Question 9: '+Q9+'\n(a) 3\n(b) 0\n(c) 4',
     'Question 10: '+Q10+'\n(a) 13\n(b) 7\n(c) 3'
]

questions = [
     Question(question_prompts[0], "c"),
     Question(question_prompts[1], "a"),
     Question(question_prompts[2], "b"),
     Question(question_prompts[3], "a"),
     Question(question_prompts[4], "c"),
     Question(question_prompts[5], "b"),
     Question(question_prompts[6], "a"),
     Question(question_prompts[7], "b"),
     Question(question_prompts[8], "c"),
     Question(question_prompts[9], "a"),
]

def run_quiz(questions):
    print('Hello! We are going to play a guessing game about Taylor Swift!')
    print('This program will ask you a series of questions and for each one answer a,b or c!')
    print('Good Luck!!')
    score = 0
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
                score += 1
                print("you got", score, "out of", len(questions))
    print('Your final score is '+str(score))
    
                
run_quiz(questions)


# In[ ]:





# In[ ]:




