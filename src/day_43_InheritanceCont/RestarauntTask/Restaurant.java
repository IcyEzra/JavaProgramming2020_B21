package day_43_InheritanceCont.RestarauntTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean hasKitchen;
    public static boolean hasCashier;

    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner){
        this.owner = owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    static{
        hasCashier = true;
        hasKitchen = true;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] servers){
       // this.servers.addAll(Arrays.asList(servers)); collections way of adding servers
        // for each way of doing this
        for(Server each : servers){
            hireServer(each);
        }

    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateEmployee(String ID){
        servers.removeIf(p->p.ID.equals(ID));
        chefs.removeIf(p->p.ID.equals(ID));
    }

    public String toString(){
        return "Owner: "+owner+"," +
                "\n Total Number of Employees:"+ (servers.size()+chefs.size()) + "" +
                "\nServers: "+ servers.size()+
                "\nChefs: " +chefs.size();
    }

}
