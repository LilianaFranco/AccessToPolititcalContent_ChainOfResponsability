public class Main {
    public static void main(String[] args) {
        Document document1 = new Document("Nueva ley", 1);
        President petro = new President(3);
        Minister gaviria = new Minister(2);
        Congressman carvalho = new Congressman(1);
        AccessValidator validator1 = new AccessValidator(gaviria);
        validator1.validateAccessToDocument();
        validator1.readDocument(document1);

    }
}