public class Faculty extends University{
    String name;
    Faculty(String name,String uniName,int uniRank){
        super(uniName,uniRank);
        this.name = name;
    }
    void Details(){
        System.out.println("Name of faculty: "+name);
        super.Display();
    }
}
