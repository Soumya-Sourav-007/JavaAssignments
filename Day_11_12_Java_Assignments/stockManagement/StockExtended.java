package Day_11_12_Java_Assignments.stockManagement;

import java.util.ArrayList;
import java.util.Scanner;

class StockTwo {

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

interface IStocksTwo{
	void displayWelcome();
	void addStocks(StockTwo stock);
	void stockReport();
	void sellStocks(StockTwo stock,int number);
	void buyStocks(StockTwo stock,int number);
}

class ImplementStockTwo implements IStocksTwo{

	ArrayList<StockTwo> arrList = new ArrayList<StockTwo>();
	int i = 0,res = 0;
	
	public void displayWelcome() {
		System.out.println('\t'+"==============================================");
		System.out.println('\t'+":: Welcome To STOCK EXCHANGE BOARD OF DURGA ::");
		System.out.println('\t'+"=============================================="+'\n');
	}
	
	public void addStocks(StockTwo stock) {
	arrList.add(i, stock);	
	printList(stock);
	i++;
	}

	private void printList(StockTwo stock) {
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
			StockTwo stock = arrList.get(i);
			if(null != stock) {
			printList(stock);
			}
		}
		
	}
	
	private double getstockValue(StockTwo stock) {
			return stock.getStockNumbers()*stock.getSharePrice();
	}
	private double getEachStockValue(StockTwo stock) {
			return getstockValue(stock)/stock.getStockNumbers();
	}

	public void sellStocks(StockTwo stock,int  number) {
		stock.setNumOfShare(stock.getNumOfShare() - number);
	}

	public void buyStocks(StockTwo stock,int number) {
		stock.setNumOfShare(stock.getNumOfShare() + number);
		
	}
	
}



public class StockExtended {
   static Scanner SCANNER = new Scanner(System.in);

  //1000000share = 1 stock
   //1 share = 0.0000001 stock  
   
   public static void main(String[] args) {
   	IStocksTwo getStockMethods = new ImplementStockTwo();
   	
   	getStockMethods.displayWelcome();
   	do {
   	System.out.println("Press 1: To Add Stocks"+'\n'+"Press 2: To See Stocks_Records"+'\n'+"Press 3: Buy Stocks"+'\n'+"Press 4: Sell Stocks");
   	switch(SCANNER.nextInt()) {
   	case 1:
   		getStockMethods.addStocks(getStocks());
   		break;
   	case 2:
   		getStockMethods.stockReport();
   		break;
   	case 3:
   		System.out.println("Enter Stocks to Buy ::");
   		getStockMethods.buyStocks(getStocks(), SCANNER.nextInt());
   		break;
   	case 4:
   		System.out.println("Enter Stocks to Sell ::");
   		getStockMethods.sellStocks(getStocks(), SCANNER.nextInt());
   		break;
   	}
   	System.out.println("Press 1: To Visit Menu Again"+'\n'+"Press 0: To Exit");
   	}while(SCANNER.nextInt() != 0);
   	
   	System.out.println("==========================================");
		System.out.println("      :: THANK_YOU FOR VISIT SEBD ::      ");
		System.out.println("=========================================="+'\n');
   	
   
   }

   private static StockTwo getStocks() {
	   StockTwo stock = new StockTwo();
       
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
