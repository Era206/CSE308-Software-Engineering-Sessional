package PROBLEM2;

public class FontFactory {
    public FontFactory() {
    }

    public Font setFont(String font){
       Font f=null;
        if(font.equalsIgnoreCase("C")){
            f= new CourierNew();
        }
        else if(font.equalsIgnoreCase("CPP")){
            f= new Monaco();
        }
        else if(font.equalsIgnoreCase("PY")){
            f= new Consolas();
        }
       return f;
    }
}
