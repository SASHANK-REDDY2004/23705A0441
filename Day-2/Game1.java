public class Game1{
    public static void main(String args[]){
        Game g=new Game("Subway","Time pass",9.3f);
        g.getSummary();
    }
}
class Game{
    String title;
    String genre;
    int playCount;
    float rating;
    Game(String title,String genre,float rating){
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
    boolean isFamilyFriendly(){
        if(genre!="horror") return true;
        else return false;
    }
    int play(){
        playCount++;
        return playCount;
    }
    void getSummary(){
        System.out.println("Title of Game is:"+title);
        System.out.println("Genre of the game:"+genre);
        System.out.println("Rating of Game is:"+rating);
        System.out.println("Playcount of the game:"+playCount);
        System.out.println(isFamilyFriendly()?"The game is family friendly":"The game is not family Friendly");
    }
    
}