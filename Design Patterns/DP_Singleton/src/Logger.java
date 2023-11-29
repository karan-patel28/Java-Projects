public class Logger {
    private int id;
    private String Name;
    private String pass;
    private static Logger instance;

    private Logger (int id, String Name, String pass) {
        this.id = id;
        this.Name = Name;
        this.pass = pass;
    }

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
