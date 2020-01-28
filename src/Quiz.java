import java.util.ArrayList;
import java.util.List;


public class Quiz {
    private List<TrueFalse> trueFalseQuestions;

    public Quiz() {
        this.trueFalseQuestions = new ArrayList<>();
    }

    public void addTrueFalseQuestion(TrueFalse trueFalseQuestion){
        trueFalseQuestions.add(trueFalseQuestion);
    }

    public List<TrueFalse> getTrueFalseQuestions(){
        return trueFalseQuestions;
    }
}
