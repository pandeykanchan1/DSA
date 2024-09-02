public class oopInterface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        King k=new King();
        k.moves();
    }
}


interface ChessPlayer{   //blueprint
    void moves();
}
class Queen implements ChessPlayer{
  public  void moves(){
      System.out.println("up down left right");
    }
}


class Rook implements ChessPlayer{
    public  void moves(){
        System.out.println(" left right");
      }
  }





class King implements ChessPlayer{
    public  void moves(){
        System.out.println(" up down");
      }
  }


