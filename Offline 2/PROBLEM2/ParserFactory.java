package PROBLEM2;

public class ParserFactory {
    public ParserFactory() {
    }

    public Parser setParser(String font){
        Parser p=null;
        if(font.equalsIgnoreCase("C")){
            p= new CFile();
        }
        else if(font.equalsIgnoreCase("CPP")){
            p= new CppFile();
        }
        else if(font.equalsIgnoreCase("PY")){
            p= new Python();
        }
        return p;
    }
}
