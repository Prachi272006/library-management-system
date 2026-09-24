# Library Management System

A console-based Library Management System developed in Java to manage books and their issue/return status.

## Project Overview

This project provides a simple system for managing books in a library. 
Users can add books, view available books, search for a book using its ID, issue books, and return issued books.

The project uses Java classes, objects, ArrayList, methods, loops, conditional statements, and user input handling.

## Features

- Add a new book with Book ID, title, and author name
- Display all books with their current status
- Search for a book using its Book ID
- Issue an available book
- Return an issued book
- Check whether a book is available or already issued
- Handles invalid menu choices

## Technologies Used

- Java
- ArrayList
- Scanner
- Object-Oriented Programming (OOP)

## OOP Concepts Used

### Class and Objects
The `Book` class represents a book and stores:

- Book ID
- Book title
- Author name
- Issue status

Each book is created as an object of the `Book` class.

### Constructor
The `Book` constructor initializes the book details when a new book is created.

### Methods
Separate methods are used for different operations:

- `addBook()`
- `displayBook()`
- `searchBook()`
- `issueBook()`
- `returnBook()`

### ArrayList
An `ArrayList<Book>` is used to store multiple book objects dynamically.

## How the System Works

The program displays a menu with different options:

```text
LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Display Book
3. Search Book
4. Issue Book
5. Return Book
6. Exit
