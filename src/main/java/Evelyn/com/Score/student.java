package Evelyn.com.Score;

public class student implements Printable {
    String name;
    int english;
    int math;
    public student(String name){
        this.name = name;
    }
    public student(String name,int english,int math) {...}
    public student(){...}
    @Override
    public  void print(){
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage())
                if (getAverage()<60)
    }
public student(){
        this("John Dee",-1,-1);
        /*name="John Dee";
        english=-1;
        math=-1*/
}

    public void print() {
        int average=(english+math)/2;
        System.out.print(name + "\t" + english + "\t" + math + "\t" + average);
        if (average < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
}
