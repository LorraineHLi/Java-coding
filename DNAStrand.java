public class DNAStrand {
    private String DNA = "";
    public DNAStrand(String dna) {
        DNA = dna;
    }

    public boolean isValidDNA() {
        int l = DNA.length();
        if (l > 0) {
            for (int i = 0; i < l; i++) {
                char c = DNA.charAt(i);
                if (! (c == 'A' || c == 'T' || c == 'C' || c == 'G')) return false;
            }
            return true;
        }
        return false;
    }

    public String complementWC() {
        StringBuilder comp = new StringBuilder();
        for (int i = 0; i < DNA.length(); i++) {
            char c = DNA.charAt(i);
            if (c == 'A') comp.append("T");
            else if (c == 'T') comp.append("A");
            else if (c == 'C') comp.append("G");
            else if (c == 'G') comp.append("C");
        }
        return comp.toString();
    }

    public String palindromeWC() {
        String comp = complementWC();
        StringBuilder pal = new StringBuilder();
        int l = comp.length();
        for (int i = 0; i < l; i++) pal.append(comp.charAt(l-1 - i));
        return pal.toString();
    }

    public boolean containsSequence(String seq) {
        return DNA.contains(seq);
    }

    public String toString() {
        return DNA;
    }
}
