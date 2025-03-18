
# Movie Management System


This project is a comprehensive Movie Management System designed to manage a collection of movies, allowing users to filter, sort, and manipulate movie data based on various criteria such as genre, rating, and year. The system provides utilities for reading, writing, and displaying movie information in a structured format, making it a useful tool for managing and analyzing a large movie database.



## Project Overview

The Movie Management System consists of several key components:

1. Movie Class

* The core class that encapsulates the attributes of a movie, including title, year, director, rating, and genre.

* Implements the Comparable<Movie> interface to allow for sorting of movies by title and year.

* Includes methods to format movie data for easy display and output.

2. MovieUtilities Class

- Provides a set of helper methods to manage movies, such as filtering by genre, rating, and year, as well as reading from and writing to external files.

- Facilitates user interaction to create new movie entries based on user input.

3. Main Class

- The main entry point for testing the system.

- Includes various methods to demonstrate the functionality of the 

- Movie class and MovieUtilities class, such as adding movies, displaying movie lists, and performing comparisons.

4. Movies.txt

 - A sample data file containing movie entries, formatted for easy reading and processing by the system. The file includes data such as title, year, director, rating, and genre for each movie.


## Features

- Movie Creation: Allows the creation of movie objects through user input or by reading data from a file.

- Filtering and Sorting: Enables users to filter movies by genre, rating, or year, and sort them by title and year.

- File Input/Output: Supports reading and writing movie data to and from files in a structured format.

- Genre Menu: Displays a list of predefined genres for easy movie classification.
