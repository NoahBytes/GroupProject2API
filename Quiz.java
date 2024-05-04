interface Quiz
{
    // Purpose: ReadInQuestions reads in questions from a file and populates
    //          MCQ objects with them.
    // Pre-Conditions: File is formatted as expected by programmer.
    //                 File has at least a title and one question.
    // Post-Conditions: Populates Quiz object with information read in from file.
    void ReadInQuestions();
    
    // Purpose: RunQuiz takes care of the active user interaction part of the exam:
    //          displaying the questions, reading in answers, and finally, displaying the score.
    // Pre-Conditions: Called after Quiz is populated with questions.
    // Post-Conditions: N/A
    void RunQuiz();
}