# Java Hangman Game

A command-line Hangman game built to practice object-oriented programming concepts, file handling, and array manipulation following the completion of AP Computer Science A.

## Features
- **Dynamic Word Loading**: Reads a dictionary of words from an external `wordlist.txt` file using Java's `File` and `Scanner` utilities.
- **Randomized Gameplay**: Utilizes `Math.random()` to dynamically select a secret word for each game session.
- **Input Validation**: Automatically screens user input to ensure guesses are single letters and tracks previously guessed letters to prevent duplicate attempts.
- **State Generation**: Features a custom procedural hint generator (`makeHint`) that updates the console display with correctly guessed letters and blank underscores (`_`).

## Prerequisites
To run this project, you need to have the **Java Development Kit (JDK)** installed on your machine.

## How to Run

1. **Clone the Repository or Download the Code**:
   Download `RayanHangman.java` and place it in a folder on your computer.

2. **Create the Word List File**:
   In the exact same folder as your `RayanHangman.java` file, create a new text file named `wordlist.txt`. Add a list of words, with each word on a new line. For example:
   ```text
   apple
   computer
   intelligence
   programming
   java
   ```

3. **Compile the Program**:
   Open your terminal or command prompt, navigate to the project directory, and compile the code:
   ```bash
   javac RayanHangman.java
   ```

4. **Execute the Game**:
   Run the compiled Java class:
   ```bash
   java RayanHangman
   ```

## Code Highlights & Concepts Applied
- **File I/O & Exception Handling**: Implemented robust file scanning (`Scanner` and `File`) that throws `IOException` handling for setup.
- **Dynamic Data Structures**: Used `ArrayList<String>` to hold a flexible, scalable list of words parsed from disk.
- **String Manipulation**: Implemented `.contains()`, `.substring()`, and `.indexOf()` logic to evaluate user input against the hidden word.
