# 📱 InstaIntel: Instagram Content Tracker (Console Edition)

A Java-based console application that helps content creators on Instagram log, analyze, and compare the performance of their posts using custom engagement formulas.

## 🚀 Features

- Add and store different types of Instagram content:
  - 📸 **Photo Posts**
  - 🎬 **Reel Posts**
  - 🕒 **Story Posts**
- Track user interactions such as:
  - Likes, comments, saves, views, and replies
- View engagement scores normalized to a scale of 0–100
- Menu-driven interface with `ArrayList` storage and console input
- Uses core object-oriented programming concepts:
  - Inheritance, abstract classes, interfaces, and polymorphism
  - Recursion-ready logic structure

## 💻 Tech Stack

- Java (Console-Based)
- Object-Oriented Programming
- IntelliJ IDEA (Project Workspace)

## 🧠 Concepts Demonstrated

| Java Concept          | Usage                                                   |
|-----------------------|----------------------------------------------------------|
| Abstraction           | Abstract `Content` class as a base for all post types    |
| Inheritance           | `PhotoPost`, `ReelPost`, and `StoryPost` extend `Content` |
| Polymorphism          | All content stored and accessed as `Content` objects     |
| ArrayList             | Dynamic list to manage all user-generated content        |
| User Input (Scanner)  | Console input for creating new posts                     |

## 📊 Sample Output

```text
Reel Engagement Statistics:
Caption: My Dance Challenge
Date: 2025-03-26
Likes: 120
Comments: 10
Saves: 40
Engagement Score: 78.65/100
