package MultiLanguage_Dictionary;

public abstract class Word {
    protected String english;
    protected String spanish;
    protected String bulgarian;
    protected String definition;

    public Word(String eng, String spa, String bul, String def) {
        english = eng;
        spanish = spa;
        bulgarian = bul;
        definition = def;
    }

    public String getEnglish() {
        return english;
    }

    public String getSpanish() {
        return spanish;
    }

    public String getBulgarian() {
        return bulgarian;
    }

    public String getDefinition() {
        return definition;
    }

    public void display() {
        System.out.println(english + " - " + spanish + " - " + bulgarian + " - "  + definition);
    }}
