# Contributing to DSA-IN-JAVA

Thank you for considering contributing to the **DSA-IN-JAVA** repository! We aim to build a comprehensive resource for data structures and algorithms (DSA), especially for interview preparation. Below are guidelines and steps to help you start contributing.

## Getting Started

1. **Fork the Repository**: Start by forking this repository to have your own copy on GitHub.

2. **Clone the Fork**: Clone your forked repository to your local machine.
   ```bash
   git clone https://github.com/<your_github_username>/DSA-IN-JAVA.git
   ```

3. **Create a Branch**: It’s recommended to create a new branch for each feature or bug fix.
   ```bash
   git checkout -b <branch_name>
   ```

## Setting Up Remotes

To keep your fork in sync with the original repository, add a remote reference to the original repo and your fork.

1. **Add Reference to Original Repository**:
   ```bash
   git remote add upstream https://github.com/Suv05/DSA-IN-JAVA.git
   ```

2. **Add Reference to Your Fork**:
   ```bash
   git remote add origin https://github.com/<your_github_username>/DSA-IN-JAVA.git
   ```

## Keeping Your Local Copy Updated

Ensure that your local copy is always up-to-date with the main repository to avoid conflicts.

```bash
git pull upstream master
```

## Making Changes

1. Make sure your changes are well-structured and relevant to the DSA content.
2. If adding solutions, provide clear and concise comments explaining the logic.
3. Test your code before committing to avoid any syntax or logical errors.

## Commit and Push

1. **Commit Changes**: Once you’ve made your changes, commit them with a clear message.
   ```bash
   git add .
   git commit -m "Add explanation/solution for <topic/problem>"
   ```

2. **Push to Your Fork**:
   ```bash
   git push origin <branch_name>
   ```

## Create a Pull Request

1. Go to your fork on GitHub.
2. Click on **New Pull Request**.
3. Select the branch you worked on and write a brief description of the changes made.
4. Submit the pull request for review.
