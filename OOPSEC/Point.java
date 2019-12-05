package OOPSEC;

public class Point{
    int x, y;

    void setX(int paramX){
        x = paramX;
    }

    int getX(){
        return x;
    }

    void setY(int paramY){
        y = paramY;
    }

    int getY(){
        return y;
    }

    void setParams(int paramX, int paramY){
        x = paramX;
        y = paramY;
    }


    Point getParams(){
        Point point = new Point();
        point.x = x;
        point.y = y;
        return point;
    }
}
