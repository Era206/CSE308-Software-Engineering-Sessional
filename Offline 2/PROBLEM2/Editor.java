package PROBLEM2;

public class Editor {
    //private static Editor editor = null;
    private static FontFactory fFactory=new FontFactory();
    private static ParserFactory pFactory=new ParserFactory();
    public Editor(String input){
        Font f=fFactory.setFont(input);
        Parser p=pFactory.setParser(input);
        p.parsingFunction();
        f.fontType();

    }




}
