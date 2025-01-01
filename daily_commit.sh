#!/bin/bash

# Change to the directory of your repo
cd /Users/pranav/Desktop/DSA-JAVA   # Replace this with the full path to your DSA-JAVA folder

# Check if there are any changes (added, modified, or deleted files)
if [[ $(git status --porcelain) ]]; then
    # If changes exist, stage them, commit, and push
    git add .                    # Stage all the changes
    git commit -m "Auto commit: $(date)"  # Commit with current date and time
    git push origin main         # Push to GitHub
else
    echo "No changes to commit."   # If no changes, print a message
fi

