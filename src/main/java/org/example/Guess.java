package org.example;

public class Guess {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String answer;

    Guess(String question, String option1, String option2, String option3, String option4, String option5, String answer){
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.answer = answer;
    }

    boolean compareAnswer(String answer){
        if(answer.toLowerCase().equals(this.answer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }

    void display(){
        System.out.println(this.question);
        System.out.println("a)" + this.option1);
        System.out.println("b)" + this.option2);
        System.out.println("c)" + this.option3);
        System.out.println("d)" + this.option4);
        System.out.println("e)" + this.option5);
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getOption5() {
        return option5;
    }
}
