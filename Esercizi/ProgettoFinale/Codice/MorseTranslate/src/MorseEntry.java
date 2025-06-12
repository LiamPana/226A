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
     * @param testoOriginal Testo originale dell'utente
     * @param morse Testo tradotto Morse
     */
    private final String testoOriginal;
    private final String morse;

    public MorseEntry (String testoOriginal, String morseCode){
        if (testoOriginal.isEmpty() || morseCode.isEmpty()){
            throw new IllegalArgumentException("Empty or invalid morse code");
        }else {
            this.testoOriginal = testoOriginal;
            this.morse = morseCode;
        }
    }


    public String getMorseCode() {if (morse == null){return testoOriginal;}
    else{
            return morse;}}

    public String getOriginalText() {
        if (testoOriginal == null){throw new NullPointerException("Original text is null");}
        else{
            return testoOriginal;}
    }
    /**
     * Hash code, equals e toString
     * @return per non avere problemi di riferimenti e di uguaglianze nella Heap.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MorseEntry)) return false;
        MorseEntry that = (MorseEntry) o;
        return Objects.equals(testoOriginal, that.testoOriginal) &&
                Objects.equals(morse, that.morse);
    }


    @Override
    public int hashCode() {
        return Objects.hash(testoOriginal, morse);
    }

    @Override
    public String toString() {
        return "\"" + testoOriginal + "\" => " + morse;
    }
}
