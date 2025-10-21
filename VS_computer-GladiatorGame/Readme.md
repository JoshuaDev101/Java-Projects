# **<span style="color:orange">⚔️ Gladiator1 Game</span>**

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Build](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)

### This is a simple turn-based gladiator fighting game written in Java.  
The game allows you to create a **player gladiator** and automatically generate a **computer-controlled enemy**. Both gladiators fight until one wins.

---

## <span style="color:skyblue">✨ Features</span>

- #### **Gladiator Class (`Gladiator1`)**
  * Attributes: **name**, **health**, **damage**, **defense**, **initiative**
  * Validation for each attribute (**health > 0**, **damage > 0**, etc.)
  * Getter and setter methods
  * `fight()` method that simulates a **battle**
  * `displayGladiatorStats()` to show gladiator details before the fight

- #### **Game Class (`GladiatorGame`)**
  * Prompts the user to **enter their gladiator’s stats**
  * Creates a **computer-controlled enemy** with randomized stats
  * Calls the `fight()` method to simulate the battle
  * Displays the **winner** at the end

---

## <span style="color:limegreen">▶️ How to Run</span>

1. Save the files in the following structure:
Gladiator_java/
└── src/
├── Gladiator1.java
└── GladiatorGame.java

2. Make sure the first line in both files matches the package:
```java
package src;
```
3. Compile the classes from the Gladiator_java/src folder:
```
javac src/Gladiator1.java src/GladiatorGame.java
```
4. Run the game:
```
java src.GladiatorGame
```
<span style="color:gold">🎮 Example Gameplay</span>
Enter Gladiator 1 Name: Maximus
Enter Maximus health points: 120
Enter Maximus damage points: 40
Enter Maximus defense points: 20
Enter Maximus initiative: 50

Maximus, health: 120.0, damage: 40, defense: 20, initiative: 50
Computer, health: 100.0, damage: 32, defense: 18, initiative: 65

Round 1: Computer does 32 damage 20% of which Maximus ignores. Maximus has 94.4 health left.
Round 2: Maximus does 40 damage 18% of which Computer ignores. Computer has 67.2 health left.
...

🏆 Computer wins!

<span style="color:violet">📌 Notes</span>
Initiative decides who attacks first.
Defense reduces the effective damage taken.
Battle continues until one gladiator’s health drops to 0 or below.
User input is validated (e.g., negative values are not allowed).
<span style="color:tomato">💡 OOP Concepts</span>
This project is a good introduction to Object-Oriented Programming (OOP) in Java with concepts like:
Classes and Objects
Encapsulation (private fields + getters/setters)
Static methods
Loops and conditionals


