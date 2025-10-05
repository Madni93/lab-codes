public class University {
    String name;
    int ranking;
    University(String name,int ranking){
        this.name = name;
        this.ranking = ranking;
    }
    void Display(){
        System.out.println("Uni name: "+ name);
        System.out.println("Ranking: "+ranking);
    }
}
