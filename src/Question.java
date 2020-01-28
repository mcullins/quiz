public abstract class Question {
    private int id;
    private int nextId = 1;
    private String question;

    public Question(String question){
        this.question = question;
        this.id = nextId;
        nextId++;
    }

    public String getQuestion() {
        return question;
    }
}
