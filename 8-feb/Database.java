public class Database {
    private static Database dbObject;

    private Database() {}

    public static Database getInstance(){
        if(dbObject == null){
            dbObject = new Database();
        }

        return dbObject;
    }

    public void getConnection(){
        System.out.println("You are connected to database");
    }
}