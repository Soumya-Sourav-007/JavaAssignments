package Day_11_12_Java_Assignments.stockManagement;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {

	private String stockNames;	//company name
	private double stockNumbers;	//size of list
	private double numOfShare;	//share each company hold
	private double sharePrice;	//price of each share per company

	public double getStockNumbers() {
		return stockNumbers;
	}

	public void setStockNumbers(double stockNumbers) {
		this.stockNumbers = stockNumbers;
	}

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public double getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(double numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

}

interface IStocks{
	void displayWelcome();
	void addStocks(Stock stock);
	void stockReport();
}

class ImplementStock implements IStocks{

	ArrayList<Stock> arrList = new ArrayList<Stock>();
	int i = 0,res = 0;
	
	public void displayWelcome() {
		System.out.println('\t'+"==============================================");
		System.out.println('\t'+":: Welcome To STOCK EXCHANGE BOARD OF DURGA ::");
		System.out.println('\t'+"=============================================="+'\n');
	}
	
	public void addStocks(Stock stock) {
	arrList.add(i, stock);	
	printList(stock);
	i++;
	}

	private void printList(Stock stock) {
		if(stock != null) {
			System.out.println("==============================================================================================================");
			System.out.println("Stocks Details "+" :: "+" Stock Number "+" :: "+" Stock Name "+" :: "+" Shares Number "+" :: "+"  Share Price ");
			System.out.println("                      "+stock.getStockNumbers()+"           "+stock.getStockNames()+'\t'+"    "+'\t'+stock.getNumOfShare()+'\t'+'\t'+'\t'+stock.getSharePrice());
			System.out.println("Total Stock_Value for '"+stock.getStockNames()+"' is :: "+getstockValue(stock));
			System.out.println("Each Stock_Value for '"+stock.getStockNames()+"' is :: "+getEachStockValue(stock));
			System.out.println("==============================================================================================================");
		}
		
	}
	public void stockReport() {
		System.out.println("==============================");
		System.out.println("      :: STOCK REPORT ::      ");
		System.out.println("=============================="+'\n');
		for(int i = 0;i < arrList.size(); i++) {
			Stock stock = arrList.get(i);
			if(null != stock) {
			printList(stock);
			}
		}
		
	}
	
	private double getstockValue(Stock stock) {
   	return stock.getStockNumbers()*stock.getSharePrice();
   }
	private double getEachStockValue(Stock stock) {
   	return getstockValue(stock)/stock.getStockNumbers();
   }
	
}



public class StockMarket {
   static Scanner SCANNER = new Scanner(System.in);

  //1000000share = 1 stock
   //1 share = 0.0000001 stock
   
   
   
   public static void main(String[] args) {
   	IStocks getStockMethods = new ImplementStock();
   	
   	getStockMethods.displayWelcome();
   	do {
   	System.out.println("Press 1: To Add Stocks"+'\n'+"Press 2: To See Stocks_Records");
   	switch(SCANNER.nextInt()) {
   	case 1:
   		getStockMethods.addStocks(getStocks());
   		break;
   	case 2:
   		getStockMethods.stockReport();
   		break;
   	}
   	System.out.println("Press 1: To Visit Menu Again"+'\n'+"Press 0: To Exit");
   	}while(SCANNER.nextInt() != 0);
   	
   	System.out.println("==========================================");
		System.out.println("      :: THANK_YOU FOR VISIT SEBD ::      ");
		System.out.println("=========================================="+'\n');
   	
   
   }

   private static Stock getStocks() {
       Stock stock = new Stock();
       
       System.out.println("Enter the stock name");
       stock.setStockNames(SCANNER.next());
       
       System.out.println("Enter the number of shares present");
       stock.setNumOfShare(SCANNER.nextInt());

       stock.setStockNumbers(stock.getNumOfShare()*(0.0000001));
       
       System.out.println("Enter the share price");
       stock.setSharePrice(SCANNER.nextDouble());

       return stock;
   }

}
