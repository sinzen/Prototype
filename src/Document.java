/**
 * Created by yassirhessane on 5/08/16.
 */
public abstract class Document {

    protected String contenu;

    public Document duplique()
    {
        Document resultat = null;
        try {
            resultat.clone();

        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resultat;
    }

}
