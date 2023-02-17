public class SplitPathName {
    public static String[] splitPath(String s) {
        String[] setofS = new String[4];
        int indexS = s.lastIndexOf('/');
        setofS[0] = s.substring(0, indexS + 1);
        setofS[1] = s.substring(indexS + 1, s.length());

        int indexD = s.indexOf('.');
        if (indexD > 0) {
            setofS[2] = s.substring(indexS + 1, indexD);
            setofS[3] = s.substring(indexD, s.length());
        }
        else {
            setofS[2] = setofS[1];
            setofS[3] = "";
        }
        return setofS;
    }

    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            String[] components = splitPath(args[i]);
            System.out.println("File: " + components[1] +
                    " Type: " + components[3] +
                    " [" + components[0] + "]");
        }
    }
}
