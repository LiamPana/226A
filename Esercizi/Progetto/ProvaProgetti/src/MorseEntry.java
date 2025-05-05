import java.util.Objects;

public class MorseEntry {
    private final String originalText;
    private final String morseCode;

    public MorseEntry (String originalText, String morseCode){
        this.originalText = originalText;
        this.morseCode = morseCode;
    }

    public String getMorseCode() {
        return morseCode;
    }

    public String getOriginalText() {
        return originalText;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MorseEntry)) return false;
        MorseEntry that = (MorseEntry) o;
        return Objects.equals(originalText, that.originalText) &&
                Objects.equals(morseCode, that.morseCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(originalText, morseCode);
    }

    @Override
    public String toString() {
        return "\"" + originalText + "\" => " + morseCode;
    }
}
