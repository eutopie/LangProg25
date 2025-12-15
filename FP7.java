interface StringFinc {
    String func(String str);
}
static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
}
String inStr = "Исходная строка";
String outStr;
1
interface StringFunc { 
    String func(String str);
}
outStr = changeStr((str) -> {
    String result = "";
    char ch;
    for (int i = 0; i<str.length();i++) {
        ch = str.charAt(i);
        if (Character.isUpperCase(ch))
        result += Character.toLowerCase(ch);
        else
        result += Character.toUpperCase(ch);
  } return result;
}, inStr);
inStr
interface MyIOAction {
    boolean ioAction (Reader rdr) throws IOException;
}
class MyIntNum {
    private int v;
    MyIntNum(int x) { v = x;}
    int getNum() {return v;}
    
    boolean inFactor(int n) {
        return (v%n) == 0;
    }
}
MyIntNum myNum = new MyIntNum(12);
MyIntNum myNum2 = new MyIntNum(16);