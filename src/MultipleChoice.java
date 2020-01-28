import java.util.ArrayList;

public class MultipleChoice extends Question{

    private String answer;
    private ArrayList<String> otherChoices;

    public MultipleChoice(String question, String answer, ArrayList<String> otherChoices) {
        super(question);
        this.answer = answer;
        this.otherChoices = otherChoices;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getOtherChoices() {
        return otherChoices;
    }
}
