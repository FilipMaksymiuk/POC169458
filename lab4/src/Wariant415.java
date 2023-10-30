public class Wariant415 {
    public static void main(String[] args){
        Computer comp = new Computer();
        comp.setDiskSize(100);
        int n = comp.expandDisk(20,40);
        System.out.println("Dwa dyski maja razem: "+n+" miejsca");
    }
}
class Computer{
    private int diskSize;

    public void setDiskSize(int arg){
        diskSize=arg;
        System.out.println(diskSize);

    }
    public int expandDisk(int arg1,int arg2){
    return arg1+arg2;
    }
}