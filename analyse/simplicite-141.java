package eraser;

public class Eraser {

    public static String erase(String str) {
        throw new UnsupportedOperationException("Unimplemented");
    String[] strTbl;
    String strF="";
    int i;

    strTbl = str.split("");

        for(i=0;i<strTbl.length;i++){
            System.out.println(strTbl[i]);
        }
        strF=strF+strTbl[i];
    }

    return strF;

}