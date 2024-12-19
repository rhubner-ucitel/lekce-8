

public class Program {

    public static void main(String[] args) {
        System.out.println("pocet obdelniku : " + Obdelnik.pocetObdelniku);
        //System.out.println(new Obdelnik().getSirka());


        Obdelnik obdelnik1 = new Obdelnik();
        obdelnik1.setVyska(10);
        obdelnik1.setSirka(5);

        Obdelnik obdelnik2 = new Obdelnik(14,3);

        System.out.println("vyska obdelnika1 je : " + obdelnik1.getVyska());
        System.out.println("sirka obdelnika1 je : " + obdelnik1.getSirka());
        System.out.println("obvod obdelnika1 je : " + obdelnik1.obvod());
        System.out.println("obsah obdelnika1 je : " + obdelnik1.getObsah());

        System.out.println("vyska obdelnika2 je : " + obdelnik2.getVyska());
        System.out.println("sirka obdelnika2 je : " + obdelnik2.getSirka());
        System.out.println("obvod obdelnika2 je : " + obdelnik2.obvod());
        System.out.println("obsah obdelnika2 je : " + obdelnik2.getObsah());

        System.out.println("pocet obdelniku : " + Obdelnik.pocetObdelniku);



//        Zarovka svetlo = null;
//        System.out.println("po deklaraci promenne");
//        svetlo = new Zarovka(true);
//        System.out.println("po vytvoreni instance");
//        System.out.println(svetlo.isSviti());
//        svetlo.setJmeno("Prvni zarovka");
//        svetlo.rozsvit();
//        svetlo.rozsvit();
//        svetlo.zhasni();
//
//        System.out.println(svetlo.isSviti());
//        System.out.println(svetlo.getJmeno());

    }

}
