

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Dialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ChoiceDialog;


public class gui extends Application  {
	
	// Array
	 String[] history= {"0","0","0","0","0"};

	// accounts
		
	Accounts account = new Accounts();
	
	//Grids
	
		VBox grid0 = new VBox();	
	GridPane grid1 = new GridPane();
	GridPane grid2 = new GridPane();
	
	//Alerts
	
	Alert alert3 = new Alert(AlertType.ERROR);
	Alert alert2 = new Alert(AlertType.ERROR);
	Alert alert1 = new Alert(AlertType.INFORMATION);
	Alert alert0 = new Alert(AlertType.INFORMATION);	
	
	//Scenes
	
	Scene scene0 = new Scene(grid0,400,250);
	Scene scene1 = new Scene(grid1,400,200);
	Scene scene2 = new Scene(grid2,400,300);
	
    //Buttons 
	
	Button Clear = new Button ("Clear");
	Button New = new Button ("SignUp");
	Button Cancel = new Button("Cancel");
	Button Withdraw1 = new Button("Withdraw");
	Button Deposit1 = new Button("Deposit");
	Button Withdraw2 = new Button("Withdraw");
	Button Deposit2 = new Button("Deposit");
	Button Balance= new Button("BalanceCheck");
	Button Next = new Button("Next");
	Button Previous = new Button("Previous");
	Button Start = new Button("Login");
	Button N0 = new Button("0");
	Button N1 = new Button("1");
	Button N2 = new Button("2");
	Button N3 = new Button("3");
	Button N4 = new Button("4");
	Button N5 = new Button("5");
	Button N6 = new Button("6");
	Button N7 = new Button("7");
	Button N8 = new Button("8");
	Button N9 = new Button("9");
	Button N_dot = new Button(".");
	
	//TextFields
	
	TextField text_grid0 = new TextField("Enter Your CardNumber");
	TextField text_grid2 = new TextField("");
	
	//Labels
	Label BalanceScene2 = new Label ("Enter You Amount");
	Label BalanceShow1 = new Label ("Actions:");
	Label BalanceShow2 = new Label ();
	Label HistoryShow1 = new Label ("History:");
	Label HistoryShow2 = new Label ();
	Label Start1 = new Label ("Welcome");
	
	//Counters
	
	private int count =0 ;
	private int counterfordis=0;
	private int nextcounter=4;
	//Bars
	
	ProgressBar bar1 = new ProgressBar(0.0); 
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("ATM");
	
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//grid0 buttons
		Start.setOnAction(e->{
			
			if (text_grid0.getText().equals(account.GetCardNumber())) {
				primaryStage.setScene(scene1);		}
			else {
				alert2.setTitle("Error");
				alert2.setHeaderText("Wrong card number!");
				alert2.setContentText("Please try again");
				alert2.showAndWait();
			}
			}
		);
		New.setOnAction(e-> {
				alert1.setTitle("NewAccount");
				alert1.setHeaderText(null);
			
				alert1.setContentText("Your Card Number is :" + account.GetCardNumber());
				alert1.showAndWait();
		});
		
		//grid0 attributes
		
			Start.setMinWidth(140);
			Start.setMinHeight(70);
			bar1.setMinWidth(140);
			grid0.setSpacing(30);
			grid0.setPadding(new Insets(10, 10, 10, 10));
		
			//grid0
	      
	      grid0.getChildren().add(Start1); //label1
	      grid0.getChildren().add(text_grid0);  // label2
	      grid0.getChildren().add(Start);// button
	      grid0.getChildren().add(New);// button
	 
	      /////////////////////////////////////////////////////////////////////////////////////////////    
	      
	      // grid1 attributes
	      
	      	BalanceShow1.setMinWidth(50);
			BalanceShow2.setMinWidth(50);
			HistoryShow1.setMinWidth(50);
			HistoryShow2.setMinHeight(50);
			Next.setMinWidth(70);
			Balance.setMinWidth(100);
			Deposit1.setMinWidth(70);
			Previous.setMinWidth(70);
			Withdraw1.setMinWidth(70);
			grid1.setHgap(10); 
			grid1.setVgap(5);
			grid1.setPadding(new Insets(10, 10, 10, 10));
			
	
			
		//grid1
			
		grid1.add(BalanceShow1, 0,0);//label 1
		grid1.add(BalanceShow2, 2,0);// label 2
		//grid1.add(HistoryShow1, 0,1);
		//grid1.add(HistoryShow2, 2,1);
		grid1.add(Balance, 4,3 ); // button
		grid1.add(Withdraw1, 0, 3);
		grid1.add(Deposit1, 3, 3);
		grid1.add(Next, 0, 2);
		grid1.add(Previous, 3, 2);
		
		// grid1 buttons 
		Previous.setOnAction(e->{ // left
		System.out.println(nextcounter);
	nextcounter--;
	prevclick();
		System.out.println(nextcounter);
		
		System.out.println(nextcounter);
	
		});
		Next.setOnAction(e->{  //right
			nextcounter++;System.out.println(nextcounter);
			nextclick();
			System.out.println(nextcounter);
			
			System.out.println(nextcounter);
	
		});
		Balance.setOnAction(e->{
			
				BalanceShow2.setText(String.valueOf(account.BalanceCheck()));
				HistorySort(history,"BalanceCheck "+account.BalanceCheck());
		});
		Deposit1.setOnAction(e->{
				primaryStage.setScene(scene2);
			
		});
		Withdraw1.setOnAction(e->{
				primaryStage.setScene(scene2);
			
		});
	
		///////////////////////////////////////////////////////////////////////
		
		//grid2 attributes
		
		N1.setMinWidth(50);
		N1.setMinHeight(50);
		N2.setMinWidth(50);
		N2.setMinHeight(50);
		N3.setMinWidth(50);
		N3.setMinHeight(50);
		N4.setMinWidth(50);
		N4.setMinHeight(50);
		N5.setMinWidth(50);
		N5.setMinHeight(50);
		N6.setMinWidth(50);
		N6.setMinHeight(50);
		N7.setMinWidth(50);
		N7.setMinHeight(50);
		N8.setMinWidth(50);
		N8.setMinHeight(50);
		N9.setMinWidth(50);
		N9.setMinHeight(50);
		N0.setMinWidth(50);
		N0.setMinHeight(50);
		N_dot.setMinWidth(50);
		N_dot.setMinHeight(50);
		Clear.setMinWidth(50);
		Clear.setMinHeight(50);
		text_grid2.setEditable(false);
		
		// grid2 attributes
		
		grid2.setHgap(5); 
		grid2.setVgap(5);
		grid2.setPadding(new Insets(5, 0, 5, 5));
	
		// grid2
		
		grid2.add(text_grid2, 3, 1);
		grid2.add(N1, 0,0);
		grid2.add(N2, 1,0);
		grid2.add(N3, 2,0);
		grid2.add(N4, 0,1);
		grid2.add(N5, 1,1);
		grid2.add(N6, 2,1);
		grid2.add(N7, 0,2);
		grid2.add(N8, 1,2);
		grid2.add(N9, 2,2);
		grid2.add(N0, 1,3);
		grid2.add(N_dot, 0,3);
		grid2.add(Withdraw2, 0, 5);
		grid2.add(Deposit2, 1, 5);
		grid2.add(Cancel, 2, 5);
		grid2.add(Clear, 2, 3);
		grid2.add(BalanceScene2,3,0 );
		
	// grid2 buttons acctions
	
		Cancel.setOnAction(e->{
			primaryStage.setScene(scene1);
		});
		Clear.setOnAction(e->{
	text_grid2.clear();
	count=0;
	counterfordis=0;
		});
		N_dot.setOnAction(e->{
			text_grid2.insertText(count++,".");
			counterfordis++;
			amountexceed();
		});
		N0.setOnAction(e->{
			text_grid2.insertText(count++,"0");
			amountexceed();
		});
		N1.setOnAction(e->{
			text_grid2.insertText(count++,"1");
			amountexceed();
		});
		N2.setOnAction(e->{
			text_grid2.insertText(count++,"2");
			amountexceed();
		});
		N3.setOnAction(e->{
			text_grid2.insertText(count++,"3");
			amountexceed();
		});
		N4.setOnAction(e->{
			text_grid2.insertText(count++,"4");
			amountexceed();
		});
		N5.setOnAction(e->{
			text_grid2.insertText(count++,"5");
			amountexceed();
		});
		
		N6.setOnAction(e->{
			text_grid2.insertText(count++,"6");
			amountexceed();
		});
		N7.setOnAction(e->{
			text_grid2.insertText(count++,"7");
			amountexceed();
		});
		N8.setOnAction(e->{
			text_grid2.insertText(count++,"8");
			amountexceed();
		});
		N9.setOnAction(e->{
			text_grid2.insertText(count++,"9");
			amountexceed();
		});
		Deposit2.setOnAction(e->{
			if (text_grid2.getText().isEmpty()==true) {
				alert0.setTitle("Transaction Status");
				alert0.setHeaderText("Transaction failed :( ");
				alert0.setContentText("Please enter the amount to be deposited!");
				alert0.showAndWait();
			}else {
				double temp;
				temp=Double.parseDouble(text_grid2.getText());
			account.Deposit(temp);
			text_grid2.clear();
			count=0;
			counterfordis=0;
			alert0.setTitle("Transaction Status");
			alert0.setHeaderText("Transaction completed");
			alert0.setContentText(null);
			alert0.showAndWait();
			HistorySort(history,"Deposit "+temp);
			primaryStage.setScene(scene1);}
			
		});
		
		Withdraw2.setOnAction(e->{
			if (text_grid2.getText().isEmpty()==true) {
				alert0.setTitle("Transaction Status");
				alert0.setHeaderText("Transaction failed :( ");
				alert0.setContentText("Please enter the amount to be Withdrawn!");
				alert0.showAndWait();
			}
			else if (account.BalanceCheck()==0){
				alert0.setTitle("Transaction Status");
				alert0.setHeaderText("Transaction failed :( ");
				alert0.setContentText("Your Balance is empty");
				alert0.showAndWait();
			}
			else if (account.BalanceCheck()<Double.parseDouble(text_grid2.getText())){
				
				alert0.setTitle("Transaction Status");
				alert0.setHeaderText("Transaction failed :( ");
				alert0.setContentText("Amount your trying to withdraw is larger than your balance!");
				alert0.showAndWait();
			}
			else {
				double temp;
				temp=Double.parseDouble(text_grid2.getText());
				account.Withdraw(temp);
				text_grid2.clear();
				count=0;
				counterfordis=0;
				alert0.setTitle("Transaction Status");
				alert0.setHeaderText("Transaction completed");
				alert0.setContentText(null);
				alert0.showAndWait();
				primaryStage.setScene(scene1);
				HistorySort(history,"Withdraw "+temp);
			}
			
		});
	
		
		primaryStage.setScene(scene0);
		primaryStage.show();
		
	}
	public void amountexceed () {
	if (count==10||counterfordis==2) {
		alert3.setTitle("Error");
		alert3.setHeaderText("Amount entered exceeds the allowed entry!");
		alert3.setContentText("Please try again");
		alert3.showAndWait();
		text_grid2.clear();
			count=0;
			counterfordis=0;
		}}
	public String [] HistorySort (String [] array , String real){
		int i=0 ;
		String temp ;
		temp=array[i];
		array[i]=real;
		for (i=1; i<5 ;i++) {
			real=array[i];
			array[i]=temp;
			temp=real;
		}
		
		return null;
	}
	
	public void nextclick () {
	
		if (nextcounter == 5)
			nextcounter=0;
		if (nextcounter ==	-1)
			nextcounter=0;
		BalanceShow2.setText(history[nextcounter]);
		
	}
	public void prevclick () {
		
		if (nextcounter == 5)
			nextcounter	=	4;
		if (nextcounter ==	-1)
			nextcounter	=	4;
		BalanceShow2.setText(history[nextcounter]);
		
	}

}
//grid0.getChildren().add(bar1);  //bar
/*margins around the whole grid
(top/right/bottom/left)
 */

/* Image image1 = new Image(gui.class.getResourceAsStream("Scenes.jpg")); 
grid1.getChildren().add(new ImageView(image1));/
BalanceShow1.setStyle("-fx-color: red");
Withdraw.setStyle("-fx-color: black ");*/

/*int i=0;
double prog=0.0;
for (i=0;i<10;i++) {prog=prog+0.1; bar1.setProgress(prog); }*/