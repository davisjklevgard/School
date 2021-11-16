package edu.cvtc.java;

public class LawnAndGardenTestProgram {

    public static void main(String[] args) {

        //Declare Objects
        //Customer objects
        Customer vanessa = new Customer();
        Customer tyler = new Customer();
        Customer david = new Customer();
        Customer amelia = new Customer();

        //Service objects
        Service mowLawn = new Service();
        Service hedgeTrim = new Service();
        Service plantFlower = new Service();
        Service weedKill = new Service();

        //Signup objects
        Signup vanessaList = new Signup();
        Signup tylerList = new Signup();
        Signup davidList = new Signup();
        Signup ameliaList = new Signup();

        //End of declarations

        //Fill Customer objects with info
        vanessa.setName("Vanessa Thomas");
        vanessa.setAddress("123 First Street");
        vanessa.setPhoneNumber("(111) 111-1111");
        vanessa.setEmail("vthomas@gmail.com");
        

        amelia.setName("Amelia Taylor");
        amelia.setAddress("123 Second Street");
        amelia.setPhoneNumber("(222) 222-2222");
        amelia.setEmail("ataylor@gmail.com");
        

        tyler.setName("Tyler Clark");
        tyler.setAddress("123 Third Street");
        tyler.setPhoneNumber("(333) 333-3333");
        tyler.setEmail("tclark@gmail.com");
        

        david.setName("David Martin");
        david.setAddress("123 Fourth Street");
        david.setPhoneNumber("(444) 444-4444");
        david.setEmail("dmartin@gmail.com");

        //Fill Service objects with info
        mowLawn.setName("Mow lawn");
        mowLawn.setDescription("Cutting the grass of the lawn");
        mowLawn.setCost(60.0);
        mowLawn.setEquipment("Lawnmower");

        hedgeTrim.setName("Hedge trim");
        hedgeTrim.setDescription("Trimming up hedges");
        hedgeTrim.setCost(65.0);
        hedgeTrim.setEquipment("Hedge trimmer");

        plantFlower.setName("Plant flowers");
        plantFlower.setDescription("Plant flowers in a garden");
        plantFlower.setCost(80.0);
        plantFlower.setEquipment("Shovel");

        weedKill.setName("Weed kill");
        weedKill.setDescription("Spraying weed killer on lawn");
        weedKill.setCost(55.0);
        weedKill.setEquipment("Poison");

        // Set Services for each customer
        Service[] vanessaService = {plantFlower, weedKill};
        Service[] tylerService = {mowLawn};
        Service[] ameliaService = {mowLawn, weedKill};
        Service[] davidService = {mowLawn, hedgeTrim, weedKill};

        // Fill the Signup objects

        vanessaList.setCustomer(vanessa);
        vanessaList.setServices(vanessaService);

        tylerList.setCustomer(tyler);
        tylerList.setServices(tylerService);

        ameliaList.setCustomer(amelia);
        ameliaList.setServices(ameliaService);

        davidList.setCustomer(david);
        davidList.setServices(davidService);

        // Display student information
        System.out.println("----- Customer -----");
        System.out.println("Customer Name: " + vanessa.getName());
        System.out.println("Address: " + vanessa.getAddress());
        System.out.println("Phone Number: " + vanessa.getPhoneNumber());
        System.out.println("Email: " + vanessa.getEmail());
        System.out.println("");

        // Display Service listing for a student
        System.out.println("----- Services -----");
        for (int i = 0; i < vanessaService.length; i++) {
            System.out.println("Service Name: " + vanessaService[i].getName());
            System.out.println("Service Description: " + vanessaService[i].getDescription());
            System.out.println("Service Cost: " + vanessaService[i].getCost());
            System.out.println("Service Equipment: " + vanessaService[i].getEquipment());
            System.out.println("");
        }

        // Display student information
        System.out.println("----- Customer -----");
        System.out.println("Customer Name: " + tyler.getName());
        System.out.println("Address: " + tyler.getAddress());
        System.out.println("Phone Number: " + tyler.getPhoneNumber());
        System.out.println("Email: " + tyler.getEmail());
        System.out.println("");

        // Display Service listing for a student
        System.out.println("----- Services -----");
        for (int i = 0; i < tylerService.length; i++) {
            System.out.println("Service Name: " + tylerService[i].getName());
            System.out.println("Service Description: " + tylerService[i].getDescription());
            System.out.println("Service Cost: " + tylerService[i].getCost());
            System.out.println("Service Equipment: " + tylerService[i].getEquipment());
            System.out.println("");
        }

        // Display student information
        System.out.println("----- Customer -----");
        System.out.println("Customer Name: " + amelia.getName());
        System.out.println("Address: " + amelia.getAddress());
        System.out.println("Phone Number: " + amelia.getPhoneNumber());
        System.out.println("Email: " + amelia.getEmail());
        System.out.println("");

        // Display Service listing for a student
        System.out.println("----- Services -----");
        for (int i = 0; i < ameliaService.length; i++) {
            System.out.println("Service Name: " + ameliaService[i].getName());
            System.out.println("Service Description: " + ameliaService[i].getDescription());
            System.out.println("Service Cost: " + ameliaService[i].getCost());
            System.out.println("Service Equipment: " + ameliaService[i].getEquipment());
            System.out.println("");
        }

        // Display student information
        System.out.println("----- Customer -----");
        System.out.println("Customer Name: " + david.getName());
        System.out.println("Address: " + david.getAddress());
        System.out.println("Phone Number: " + david.getPhoneNumber());
        System.out.println("Email: " + david.getEmail());
        System.out.println("");

        // Display Service listing for a student
        System.out.println("----- Services -----");
        for (int i = 0; i < davidService.length; i++) {
            System.out.println("Service Name: " + davidService[i].getName());
            System.out.println("Service Description: " + davidService[i].getDescription());
            System.out.println("Service Cost: " + davidService[i].getCost());
            System.out.println("Service Equipment: " + davidService[i].getEquipment());
            System.out.println("");
        }
    }
}
