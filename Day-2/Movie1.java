public class Movie1{
    public static void main(String args[]){
        Movie m1=new Movie("Hanuman",9.2f,"02h:56m");
        m1.details();
    }
}


class Movie{
    String name;
    float rating;
    String duration;
    Movie(String name,float rating,String duration){
        this.name=name;
        this.rating=rating;
        this.duration=duration;
    }
    boolean isHit(){
        if(rating>=9) return true;
        else return false;
    }
    void details(){
        System.out.println("Movie name is:"+name);
        System.out.println("Movie rating is:"+rating);
        System.out.println("Movie duration is:"+duration);
        System.out.println(isHit()?"The movie is hit":" ");
    }
}