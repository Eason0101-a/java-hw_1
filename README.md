# Java Mathematical Model Project

This project is a terminal-based Java program created for VS Code.

## Features

- Mathematical model simulation
  - Linear system: `dx/dt = -k*x`
  - Nonlinear system: `dx/dt = r*x*(1 - x/K)`
- Loop-based iterative computation (Euler method)
- Terminal input and output interaction

## Project Structure

```text
java hw/
  src/Main.java
  .vscode/tasks.json
  .vscode/launch.json
```

## Run in VS Code Terminal

```powershell
javac -d out src/Main.java
java -cp out Main
```

Then follow prompts to input model parameters and view simulation output.
