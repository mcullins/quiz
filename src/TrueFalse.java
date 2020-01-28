import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean answer;

    public TrueFalse(String question, boolean answer){
        super(question);
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void displayTrueFalseQuestion(){
        System.out.println(getQuestion());
    }
    public void displayAnswerChoices(){
        System.out.println("True or False?");
    }
    public String displayAnswerStatus(boolean userAnswer){
        if(userAnswer == answer){
            return "Correct!";
        } else {
            return "Incorrect...";
        }
    }
}
