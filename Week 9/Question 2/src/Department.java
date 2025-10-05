public class Department extends Faculty{
    String name;
    String chairMan;
    Department(String name,String chairMan,String facName,String uniName,int uniRank){
        super(facName,uniName,uniRank);
        this.name = name;
        this.chairMan = chairMan;
    }
    void Details(){
        System.out.println("Name of department: " + name );
        System.out.println("Chairman: "+chairMan);
    }
    void Display(){
       Details();
       super.Details();
    }
}
