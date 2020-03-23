import model.Client;
import model.Cofetarie;
import model.ProdusCofetarie;
import service.ClientService;
import service.CofetarieService;

public class ExecutieCofetarieManagementApp {

    public static void main(String[] args) {
        CofetarieService cofetarieService = new CofetarieService();
        ClientService clientService = new ClientService();

//        Client Razvan = new Client(); //setters
//        Cofetarie Friscot = new Cofetarie();
//        Friscot.adaugaClient(Razvan);
//        ProdusCofetarie Tiramisu = new ProdusCofetarie();
//        Friscot.Razvan.adaugaProdusCofetarie(Tiramisu);
//        Friscot.Razvan.Tiramisu.afisarePret();


//        cofetarieService.creareCofetarie();
//        cofetarieService.afisareInformatiiCofetarie();
//        cofetarieService.schimbareAdresaCofetarie();


        // creem clienti
        Client clientTest1 = Client.builder()
                .adresa("iasi")
                .nume("ceva")
                .prenume("cristi")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest2 = Client.builder()
                .adresa("neamt")
                .nume("ifrim")
                .prenume("cristina")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest3 = Client.builder()
                .adresa("vaslui")
                .nume("popescu")
                .prenume("ramona")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest4 = Client.builder()
                .adresa("vaslui")
                .nume("fierascu")
                .prenume("alexandru")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest5 = Client.builder()
                .adresa("vaslui")
                .nume("fierascu")
                .prenume("roxana")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest6 = new Client();
        clientTest6.setNume("Decebal");
        clientTest6.setPrenume("Mircea");


        cofetarieService.adaugaClient(clientTest1);
        cofetarieService.adaugaClient(clientTest2);
        cofetarieService.adaugaClient(clientTest3);
        cofetarieService.adaugaClient(clientTest4);
        cofetarieService.adaugaClient(clientTest5);
//        cofetarieService.afiseazaListaClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();
//
//        cofetarieService.stergeClient(clientTest2);
//        cofetarieService.afiseazaListaClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();
//
//
//        ///primul client are pozitia 0
//        //al 2lea client are pozitia 1
//        //al 3lea client are pozitia 2
//        cofetarieService.stergeClientPozitie();
//        cofetarieService.afiseazaListaClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();

//        cofetarieService.stergeTotiClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();

//        System.out.println("===================\n===================");
//
//
        ////////////adaugam produse cofetarie
        ProdusCofetarie produsCofetarie1 = new ProdusCofetarie();
        produsCofetarie1.setNumeProdusCofetarie("tiramisu");
        produsCofetarie1.setGramajProdusCofetarie(120);
        produsCofetarie1.setPretProdusCofetarie(10.99);
        ProdusCofetarie produsCofetarie2 = ProdusCofetarie.builder().
                numeProdusCofetarie("cheesecake capsuni").
                gramajProdusCofetarie(120).
                pretProdusCofetarie(15.99).
                build();
//
//        cofetarieService.adaugaProdusCofetarie(produsCofetarie1);
//        cofetarieService.adaugaProdusCofetarie(produsCofetarie2);
//        cofetarieService.afiseazaListaProduseCofetarie();
//        cofetarieService.afiseazaNumarProduseCofetarieExistente();
//
//
//        System.out.println("===================\n===================");
//        System.out.println("PROGRAM ORAR");
//
//        cofetarieService.creazaProgramOrar();
//        cofetarieService.afisareOrarCofetarie();
//
//        cofetarieService.schimbareOrar();
//        cofetarieService.afisareOrarCofetarie();


        clientService.adaugareProdusCofetarieInCosulDeCumparaturi(produsCofetarie1);
        clientService.adaugareProdusCofetarieInCosulDeCumparaturi(produsCofetarie2);
        clientService.afisarePretCosCumparaturi();
        //clientService.calculareDiscount();
        clientService.calcularePretFinalDupaDiscount();

    }
}
