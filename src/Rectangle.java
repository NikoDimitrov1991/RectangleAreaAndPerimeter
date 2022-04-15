public class Rectangle {

    private  double lenght;
    private  double width;

    public Rectangle(){
        lenght=0.0;
        width=0.0;
    }

    public Rectangle(double L, double W){
        lenght=L;
        width=W;
    }

    public double findArea(){
        return lenght*width;
    }

    public double findPerim(){
        return lenght*2 + width*2;
    }
}
