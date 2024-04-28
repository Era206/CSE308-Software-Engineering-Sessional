package PROBLEM1.component;

public abstract class Control extends Components{
    private String types = "Control";
    private int displayNo;

    public void setType() {
        System.out.println("This is in a " + types);
    }

    public int getDisplayNo() {
        return displayNo;
    }

    public void setDisplayNo(int displayNo) {
        this.displayNo = displayNo;
    }
}
