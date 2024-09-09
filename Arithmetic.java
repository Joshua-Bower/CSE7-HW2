// Joshua Bower jmb725@lehigh.edu 9/4/2024 CSE 007 HW2

// Class that has the same name as our Java file
public class Arithmetic {
    // main methoid that is required
    public static void main(String[] args) {

        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;

        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;

        //Number of belts
        int numBelts = 1;
        //cost per belt
        double beltPrice = 33.99;

        //the tax rate
        double paSalesTax = 0.06;

        double totalCostOfPants;   //variable to hold the total cost of pants
        double totalCostOfShirts; //variable to hold the total cost of shirts
        double totalCostOfBelts;   //variable to hold the total cost of belts

        double salesTaxPants, salesTaxShirts, salesTaxBelts; //variables used to hold the calculated sales tax of each
        
        double TotalCostPretax; //variable to hold the total cost calulation of all clothing items
        double TotalSalesTax; // variable used to hold the total sales tax of all items 
        double TransactionTotal; //variable to hold the transaction total

        // start of the calculations
        totalCostOfPants = numPants*pantsPrice; //calulation for the cost of pants pre tax
        totalCostOfShirts = numShirts*shirtPrice; //calulation for the cost of shirts pre tax
        totalCostOfBelts = numBelts*beltPrice; //calulation for the cost of belts pre tax

        salesTaxPants = totalCostOfPants*paSalesTax; // calulation for the sales tax on pants
        salesTaxShirts = totalCostOfShirts*paSalesTax; // calulation for the sales tax on shirts
        salesTaxBelts = totalCostOfBelts*paSalesTax; // calulation for the sales tax on belts

        TotalCostPretax = Math.round((totalCostOfPants+totalCostOfShirts+totalCostOfBelts)*100); //calulation for the total pre tax cost, "Math.round" is used to make a round number of cents
        //                                                                                        by multiplying by 100 and the rounding and the solution will need to be divided by 100 later 
        TotalSalesTax = Math.round((salesTaxPants+salesTaxShirts+salesTaxBelts)*100); // calulation for the total sales tax, "Math.round" is used to make a round number of cents
        //                                                                                       by multiplying by 100 and the rounding and the solution will need to be divided by 100 later
        TransactionTotal = (TotalCostPretax+TotalSalesTax)/100; // calulation for the transaction toal, dividing by 100 cleans up the calulation from "Math.round"

        System.out.println("The total sales tax is "+(TotalSalesTax/100)); // displays the total sales tax, dividing by 100 cleans up the result from "Math.round" used earlier 
        System.out.println("The total cost pretax is "+(TotalCostPretax/100)); // displays the total sales tax, dividing by 100 cleans up the result from "Math.round" used earlier
        System.out.println("The total cost is "+TransactionTotal); // displays the transaction total
    }//end of main method
}//end of class