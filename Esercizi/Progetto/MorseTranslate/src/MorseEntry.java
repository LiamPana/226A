import java.util.Objects;
/**
 * @author Liam Panarisi
 * @version Maggio 2025
 *
 */
public class MorseEntry {
    /**
     * Traduce il Testo in morse
     *
     * @param originalText Testo originale dell'utente
     * @param morseCode Testo tradotto Morse
     */
    private final String originalText;
    private final String morseCode;

    public MorseEntry (String originalText, String morseCode){
        if (originalText.isEmpty() || morseCode.isEmpty()){
            throw new IllegalArgumentException("Empty or invalid morse code");
        }else {
            this.originalText = originalText;
            this.morseCode = morseCode;
        }
    }


    public String getMorseCode() {
        if (morseCode == null){
            return originalText;
        }else{
            return morseCode;
        }
    }

    public String getOriginalText() {
        if (originalText == null){
            throw new NullPointerException("Original text is null");
        }else{
            return originalText;
        }
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
