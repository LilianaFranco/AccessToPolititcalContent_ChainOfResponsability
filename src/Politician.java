public abstract class Politician {

    //Properties
    int accessType;
    Document documentToShare;
    Politician nextPolitician;

    //Constructor simple
    public Politician() {

    }

    //Constructor
    public Politician(int accessType){
        this.accessType = accessType;
    }

    //Setter and Getter
    public int getAccessType() {
        return accessType;
    }

    public void setAccessType(int accessType) {
        this.accessType = accessType;
    }

    public Politician getNextPolitician() {
        return nextPolitician;
    }

    public void setNextPolitician(Politician nextPolitician) {
        this.nextPolitician = nextPolitician;
    }

    //Methods
    public abstract String readDocument(Document document);


}
