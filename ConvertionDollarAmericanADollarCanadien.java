//////////
//
// V2
// Le 8 Mars 2021
// Convertion dollar American a dollar Canadien 
//
//////////

public class ConvertionDollarAmericanADollarCanadien {
    public static void main(String args[]) {
    
    //les variables
    final double tauxConversion = 0.79;
    double dollarAmericain = 200;
    double dollarCanadien = dollarAmericain*tauxConversion;
    // imprimer a l'ecran 
    System.out.println("La conversion de $" + dollarAmericain + "dollar Americain en dollar Canadien est de $" + dollarCanadien);
    
    }
}