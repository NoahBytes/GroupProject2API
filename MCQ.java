interface MCQ
{
    // Purpose: GetQuestion returns the question prompt to the caller
    // Pre-Conditions: N/A
    // Post-Conditions: Returns question string
    String GetQuestion();

    // Purpose: GetChoices returns a string array with the 4 answer choices.
    // Pre-Conditions: N/A
    // Post-Conditions: Returns string array w/ 4 choices
    String[] GetChoice();
    
    // Purpose: ConfirmAnswer takes in the user's input and compares it to the correct answer.
    // Pre-Conditions: userIn is w/in range 1-4
    // Post-Conditions: Returns true if userIn matches correct answer choice index.
    //                  Returns false if userIn does not match correct answer.
    boolean ConfirmAnswer(int userIn);
}