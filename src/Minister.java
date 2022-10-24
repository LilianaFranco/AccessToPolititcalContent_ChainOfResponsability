public class Minister extends Politician {

    //Properties
    public Minister(int accessType) {
        super(accessType);
    }

    //Methods
    @Override
    public String readDocument(Document document) {
        if(document.typeOfAccess <= this.accessType){
            System.out.println("It was read by the Minister.");
            if(this.getNextPolitician()!= null){
                System.out.println("This message was sent to Congressman");
                this.getNextPolitician().readDocument(document);
            }else{
                System.out.println("This message is not going to be sent to anyone else.");
            }
        }else{
            System.out.println("I can't read this document.");
        }
        return document.getContent();
    }
}
