public class AccessValidator {

    //Properties
    private Politician initial;

    //Constructor

    public AccessValidator(Politician initial) {
        this.initial = initial;
    }


    //Methods

    public void validateAccessToDocument(){
        this.initial = new President(3);
        Politician minister = new Minister(2);
        Politician congressman = new Congressman(1);

        //Chain of responsibility
        initial.setNextPolitician(minister);
        minister.setNextPolitician(congressman);
    }

    public String readDocument(Document document){
        return initial.readDocument(document);
    }
}
