package service;

import model.Client;
import model.ProdusCofetarie;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientService {

    private double sumaDePlatit = 0;
    private Client clientulMeu = new Client();



    public void adaugareProdusCofetarieInCosulDeCumparaturi(ProdusCofetarie produsCofetarieNou) {
        clientulMeu.getListaProduseCofetarieClient().add(produsCofetarieNou);
        System.out.println("Produsul adaugat are pretul de " + produsCofetarieNou.getPretProdusCofetarie() + " RON");
    }

    public void afisarePretCosCumparaturi() {
        ArrayList<ProdusCofetarie> produseleClientuluiDinCos = clientulMeu.getListaProduseCofetarieClient();
        for (ProdusCofetarie produsIndividualDinCos : produseleClientuluiDinCos) {
            double pretProdusIndividual = produsIndividualDinCos.getPretProdusCofetarie();
            sumaDePlatit = sumaDePlatit + pretProdusIndividual;
            //sumaDePlatit += pretProdusIndividual;
            //sumaDePlatit += produsIndividualDinCos.getPretProdusCofetarie();
        }
        System.out.println("Suma finala de platit este " + sumaDePlatit + " RON");
    }

    public void calculareDiscount() {
        double discount = 9.99;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este clientul fidel? ");
        String raspuns = scanner.nextLine().toUpperCase();
        if (raspuns.equals("DA") ||
                raspuns.equals("YES")) {
            sumaDePlatit = sumaDePlatit - (sumaDePlatit * discount) / 100;
        }
    }

    public void calcularePretFinalDupaDiscount() {
        calculareDiscount();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metodele de plata sunt\n" +
                "1. CARD\n" +
                "2. CASH");
        String metodaDeplata = scanner.nextLine().toUpperCase();
        if (metodaDeplata.equals("CARD")) {
            System.out.println("Esti eligibil de un discount suplimentar de 1.99%");
            sumaDePlatit = sumaDePlatit - (sumaDePlatit * 1.99) / 100;
            //sumaDePlatit = 24.284698 - (24.284698 * 1.99) /100
            System.out.println("Suma de plata finala este " + sumaDePlatit);
        }
        if (metodaDeplata.equals("CASH")) {
            System.out.println("Suma de plata finala este " + sumaDePlatit);
        }
    }



}
