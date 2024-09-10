package SecondMonth;

public class RemoteMain {
    public static void main(String[] args) {

        Remote tcl =new Remote();
        tcl.factoryName="TCL";
        tcl.color="black";
        tcl.buttonCount=15;
        tcl.weight=50;
        tcl.volume=15;
        tcl.onOff=true;

        System.out.println(tcl.increaseVolume());
        System.out.println(tcl.onOff());

        Remote lg=new Remote();
        lg.factoryName="LG";
        lg.color="White";
        lg.weight=21;
        lg.onOff=false;

        System.out.println(lg.onOff);

    }
}
