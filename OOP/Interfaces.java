interface Chessplayer{
    void moves();

}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("Up,down,left,right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("Up,down,left,right");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("Up,down,left,right");
    }
}
public class Interfaces{
    public static void main(String[] args) {
        Queen qn=new Queen();
        qn.moves();
    }
}