import models.DataStorage;

public class Main {
    public static void main(String[] args) {

        DataStorage ds = new DataStorage();
        String[][] dvimatisMasyvas= {{"2018-08-03", "Maxima", "30.00"}, { "2018-08-03","Norfa","30.00"}};
        //Is failo nuskaitomi duomenys ir sudedami i dvimati masyva.

        ds.dataSaving(dvimatisMasyvas);
        //duomenys issaugomi kaip objektai i expensu lista.

        ds.getUnknownCategory();
        // gaunamas benefiseris su unknown kategorija

        ds.getCategoryList();
        // atsiunciamas categoriju listas, is kurio useris pasirinks kuriai kategorijai priskirti nezinoma benefisheri.

        ds.changeCategory("Maxima", "Maistas");
        // vartotojui pasirinkus arba ivedus kategorija ji priskiriama beneficiary



        System.out.println();


    }
}
