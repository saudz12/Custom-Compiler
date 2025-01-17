Custom-Compiler

This is a simple compiler developed as a university project. The compiler is written in C# using ANTLR and is designed to recognize syntax similar to C++.
By compiler I mean only it's lexing and parsing parts.
Overview

    Developed a custom .g4 grammar file to define the syntax rules.
    Utilized ANTLR's Visitor Design Pattern in C# to:
        Collect data about the given program from input.txt.
        Verify whether the given program matches the syntax rules defined in the grammar.

How to Run

    Install the latest version of Java on your computer.
    Open the project in Visual Studio.
    Navigate to the NuGet Package Manager and install ANTLR 4 Standard Runtime.

Notes

This project is simple and serves as an introduction to compiler design and syntax analysis.
