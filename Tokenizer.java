public class Tokenizer {
    String[] tokens;
    public Tokenizer() {
        tokens = new String[]{};
    }

    public Tokenizer(String fname) {
        tokensFromFile(fname);
    }

    public void tokensFromFile(String fname) {
        In file = new In(fname);
        String s = file.readAll();
        tokenize(s);
    }

    public void tokenize(String str) {
        tokens = str.split("\\W+");
    }

    public String[] getTokens() {
        return tokens;
    }

    public int getNumberTokens() {
        return getTokens().length;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString("number of wheels\t:2\ncost:\t$500".split("\\W+")));
//    }
}
