import java.util.ArrayList;

public class Biblotek {
    ArrayList<Bog> biblotek = new ArrayList<>();



    public void tilføjBog(Bog bog){
        biblotek.add(bog);
    }

    public boolean findesBog(Bog bog) {
        for (int x = 0; x < biblotek.size(); x++) {
            if (bog.equals(biblotek.get(x))) {
                System.out.println("book already exists in library");
                return true;
            }

        }
        System.out.println("book doesn't already exist in library");
        return false;

    }
}