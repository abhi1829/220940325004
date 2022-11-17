class shape{
    void draw(){
        System.out.println("Draw Shape");
    }
    void erase(){
        System.out.println("Erase Shape");
    }

}
class triangle extends shape{
    @Override
    void draw(){
        System.out.println("Draw Triangle");
    }
    @Override
    void erase(){
        System.out.println("Erase Triangle");
    }

}
class square extends shape{
    @Override
    void draw(){
        System.out.println("Draw Square");
    }
    @Override
    void erase(){
        System.out.println("Erase Square");
    }

}
class circle extends shape{
    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
    @Override
    void erase(){
        System.out.println("Erase Circle");
    }

}
public class Q3{
    public static void main(String[] args) {
        shape a = new shape();
        circle b= new circle();
        square c =  new square();
        
        a.draw();
        a.erase();
        b.draw();
        b.erase();
        c.draw();
        c.erase();
    }
}