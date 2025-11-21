# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an basketball enthusiast, <br> 
> I want to analyze the statistics of each basketball player, <br> 
> so that I can greatest basketball player of all time.

## Dataset 


Dataset: https://www.kaggle.com/datasets/ethankeyes/nba-all-star-players-and-stats-1980-2022 
- **Player** (String) - name of player 
- **PlayerYear** (int) - year the player played 
- **PlayerTeam** (String) - players team 
- **PlayerPPG** (String) - players Point Per Game(PPG) 
- **PlayerFG%** (String) - players Field Goal %(FG%) 
- **PlayerAvgTurnover** (String) - players Average turnover per game(TO) 

## UML Diagram 

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README. 

![UML Diagram for my project](![](<Copy of (Unit 3) UML Diagram (1).png>) 

## Description 

My project uses a UserStory class that works with a dataset of basketball players stored in several arrays. The constructor loads data from text files, and the program uses methods, loops, and conditionals to analyze player stats like PPG, FG%, and average turnovers. The project is designed to meet the user’s goal of quickly finding the best or worst players in each category. The program also uses the Scanner class for user input, allowing the user to interact with a menu that calls different methods based on their choices. Each option displays results by running helper methods, making the program organized, efficient, and easy for the user to navigate.
