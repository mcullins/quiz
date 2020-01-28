import java.util.ArrayList;

public class Checkbox extends Question {

    private ArrayList<String> answers;
    private ArrayList<String> otherChoices;

    public Checkbox(String question, ArrayList<String> answers, ArrayList<String> otherChoices) {
        super(question);
        this.answers = answers;
        this.otherChoices = otherChoices;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public ArrayList<String> getOtherChoices() {
        return otherChoices;
    }
}
