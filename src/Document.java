public class Document {
    //Properties
    String content;
    int typeOfAccess; //1: private, 2: Secret, 3: Ultra Secret

    //Setter and Getters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Methods
    public Document(String content, int typeOfAccess) {
        this.content = content;
        this.typeOfAccess = typeOfAccess;
    }
}
