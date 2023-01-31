/**
 *  This is a demo of using the TwoItemBox class.
 * @author Maha Shamseddine
 */
public class TwoItemBoxDemo {
    /**
     *  This is a main method with demo code.
     *  @param args command line args (not used)
     */
    public static void main(String[] args) {
        //demo putting a client and a server in a box

        /**
         * Class for clients.
         */
        class Client {}

        /**
         * Class for servers.
         */
        class Server {}

        //make a client
        Client c1 = new Client();

        //make a client
        Server s1 = new Server();

        //put the apple in a box
        TwoItemBox<Client, Server> nodeBox1 = new TwoItemBox<>(c1, s1);

        //check that the client and the server were put in the box
        if (nodeBox1.getItem1().equals(c1) && (nodeBox1.getItem2().equals(s1))) {
            System.out.println("yay 1");
        }



        //demo putting a router and a switch in a box

        /**
         * Class for switches.
         */
        class Switch {}
        /**
         * Class for routers.
         */
        class Router {}
        //make a switch
        Switch t1 = new Switch();
        //make a router
        Router r1 = new Router();
        //put the switch and the router in a box
        TwoItemBox<Switch, Router> nodeBox2 = new TwoItemBox<>(t1, r1);

        //check that the router and the switch are put in the box
        if (nodeBox2.getItem1().equals(t1) && (nodeBox2.getItem2().equals(r1))) {
            System.out.println("yay 2");

        }
    }
}