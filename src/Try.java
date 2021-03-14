public class Try {

    public void sub(int i , int j) {

    }

    public void add(int i , int j) {

    }

    public void multi(int i , int j) {
    }

    public void div(int i, int j) {

    }

    public static void main(String[] args) {

        Math math = null;
        int i = (int)(math.random()*100);
        int j=(int)(math.random()*100);
        Try t = new Try();
        t.add(i , j);
        t.sub(i,j);
        t.multi(i,j);
        t.div(i,j);

        System.out.println((int)(math.random()*100));
    }
}