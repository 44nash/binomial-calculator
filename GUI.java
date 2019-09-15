package Origin3.copy;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
public class GUI extends JFrame{
	
	private JTextField questionbox;
//	private JTextField questionbox2;
	static private Random r = new Random();
	private JTextField answerbox2;
//	private JTextField answerbox3;
//	private JTextField answerbox4;
//	private JTextField answerbox5;
//	private JTextField answerbox6;
	private JButton one,two,three,four,five,six,seven,eight,nine,zero,enter,clear,deci,neg,back , X, Y ,plus, minus, star;
	private JButton onep,twop,threep,fourp,fivep,sixp,sevenp,eightp,ninep,zerop;
	private String stemp1,stemp2,sanswer,stemp3,sanswer2,sanswer3,sanswer4,sanswer5;
	String answer = "0.0";
	private double answer2=0.0,answer3=0.0,answer4=0.0,answer5=0.0;
	private JPanel contentPanel;
	private boolean equalsClicked= false, opChosen = false;
	private JMenuBar menuBar;
	private JMenu file;
	private JMenu edit;
	private JMenu help;
	private JMenuItem close;
	private JMenuItem copy;
	private JMenuItem view;
	private JMenuItem about;
	char operation = ' ';
	
	public GUI(){
		super(" Marcus Nash Binomial Calculator ");
		sendMenuBar();
		questionbox = new JTextField("Input Binomial Expression: 0",40);
		questionbox.setEditable(false);
		questionbox.setFont(new Font("Arial",Font.PLAIN, 40));
		
//		questionbox2 = new JTextField("Power Box: 0",20);
//		questionbox2.setEditable(false);
//		questionbox2.setFont(new Font("Arial",Font.PLAIN, 40));
		
		
		
		answerbox2 = new JTextField("Expansion: 0",40);
		answerbox2.setEditable(false);
		answerbox2.setFont(new Font("Arial",Font.PLAIN, 40));
		
		
//		answerbox3 = new JTextField("Zombies: 0",20);
//		answerbox3.setEditable(false);
//		answerbox3.setFont(new Font("Arial",Font.PLAIN, 40));
//		
//		answerbox4 = new JTextField("Susceptibles: 0",20);
//		answerbox4.setEditable(false);
//		answerbox4.setFont(new Font("Arial",Font.PLAIN, 40));
//		
//		answerbox5 = new JTextField("Total Population: 0",20);
//		answerbox5.setEditable(false);
//		answerbox5.setFont(new Font("Arial",Font.PLAIN, 40));
//		
//		
//		answerbox6 = new JTextField("Dead: 0",20);
//		answerbox6.setEditable(false);
//		answerbox6.setFont(new Font("Arial",Font.PLAIN, 40));
		
		int x = 40;
		
		one = new JButton("1");
		one.setFont(new Font("Arial",Font.PLAIN, x));
		two = new JButton("2");
		two.setFont(new Font("Arial",Font.PLAIN, x));
		three = new JButton("3");
		three.setFont(new Font("Arial",Font.PLAIN, x));
		four = new JButton("4");
		four.setFont(new Font("Arial",Font.PLAIN, x));
		five = new JButton("5");
		five.setFont(new Font("Arial",Font.PLAIN, x));
		six = new JButton("6");
		six.setFont(new Font("Arial",Font.PLAIN, x));
		seven = new JButton("7");
		seven.setFont(new Font("Arial",Font.PLAIN, x));
		eight = new JButton("8");
		eight.setFont(new Font("Arial",Font.PLAIN, x));
		nine = new JButton("9");
		nine.setFont(new Font("Arial",Font.PLAIN, x));
		zero = new JButton("0");
		zero.setFont(new Font("Arial",Font.PLAIN, x));
		
		X = new JButton("X");
		X.setFont(new Font("Arial",Font.PLAIN, x));
		Y = new JButton("Y");
		Y.setFont(new Font("Arial",Font.PLAIN, x));
		
		plus = new JButton("+");
		plus.setFont(new Font("Arial",Font.PLAIN, x));
		minus = new JButton("-");
		minus.setFont(new Font("Arial",Font.PLAIN, x));
		
		star = new JButton("*");
		star.setFont(new Font("Arial",Font.PLAIN, x));
		
		
		enter = new JButton("ENTER");
		enter.setFont(new Font("Arial",Font.PLAIN, x));
		clear = new JButton("CLEAR");
		clear.setFont(new Font("Arial",Font.PLAIN, x));
		deci = new JButton(".");
		deci.setFont(new Font("Arial",Font.PLAIN, x));
		neg = new JButton("+/-");
		neg.setFont(new Font("Arial",Font.PLAIN, x));
		back = new JButton("BACK");
		back.setFont(new Font("Arial",Font.PLAIN, x));
		
		
		Dimension dim = new Dimension(500,50);
		Dimension dim2 = new Dimension(300,50);
		Dimension dim3 = new Dimension(250,50);
		
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		
		X.setPreferredSize(dim);
		Y.setPreferredSize(dim);
		
		plus.setPreferredSize(dim);
		minus.setPreferredSize(dim);
		star.setPreferredSize(dim);
		
		zero.setPreferredSize(dim);
		enter.setPreferredSize(dim2);
		clear.setPreferredSize(dim3);
		deci.setPreferredSize(dim2);
		neg.setPreferredSize(dim2);
		back.setPreferredSize(dim2);
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);four.addActionListener(n);
		five.addActionListener(n);six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);
		nine.addActionListener(n);zero.addActionListener(n);deci.addActionListener(n);neg.addActionListener(n);
		back.addActionListener(n);   X.addActionListener(n); Y.addActionListener(n);
		
		plus.addActionListener(n); minus.addActionListener(n);
		star.addActionListener(n);
		
		enter.addActionListener(c);clear.addActionListener(c);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.BLUE);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(questionbox,BorderLayout.NORTH);
		//contentPanel.add(questionbox2,BorderLayout.NORTH);
		
		
		
		contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);
		contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);
		contentPanel.add(seven);contentPanel.add(eight);contentPanel.add(nine);
		contentPanel.add(zero);
		
		contentPanel.add(X);
		contentPanel.add(Y);
		
		contentPanel.add(plus);
		contentPanel.add(minus);
		contentPanel.add(star);
		
		
		contentPanel.add(clear);
		contentPanel.add(deci);contentPanel.add(back);
		contentPanel.add(enter);contentPanel.add(neg);
		
//		contentPanel.add(answerbox5,BorderLayout.SOUTH);
//		contentPanel.add(answerbox4,BorderLayout.SOUTH);
//		contentPanel.add(answerbox3,BorderLayout.SOUTH);
//		contentPanel.add(answerbox6,BorderLayout.SOUTH);
		contentPanel.add(answerbox2,BorderLayout.SOUTH);
		
		
		
		this.setContentPane(contentPanel);
	}
	private void sendMenuBar(){
		menuBar = new JMenuBar();
		file = new JMenu(" File ");
		edit = new JMenu(" Edit ");
		help = new JMenu(" Help ");
		close = new JMenuItem("Close");
		copy = new JMenuItem("Copy");
		view = new JMenuItem("View Help");
		about = new JMenuItem("About Calculator");
		setJMenuBar(menuBar);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		copy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String tempDisplay = questionbox.getText();
				StringSelection string = new StringSelection(tempDisplay);
				Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
				system.setContents(string, string);	
			}
		});
		
//		copy.addActionListener(new ActionListener(){
//			public void actionPerformed2(ActionEvent e) {
//				String tempDisplay = questionbox2.getText();
//				StringSelection string = new StringSelection(tempDisplay);
//				Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
//				system.setContents(string, string);	
//			}

//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		view.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "There is no help topics availiable.", 
						"Marcus Calculator, 4/12/19",JOptionPane.OK_OPTION);
			}
		});
		
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Created on Week of 1/17/16", 
						"Marcus Calculator, 4/12/19",JOptionPane.OK_OPTION);
			}
		});
		
		file.add(close);
		edit.add(copy);
		help.add(view);
		help.add(about);
	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton)event.getSource();
			
			if (src.equals(one)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "1";
					}else{
						stemp1+="1";
					}
				}else{

				}
			}
			
			if (src.equals(two)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "2";
					}else{
						stemp1+="2";
					}
				}else{

				}
			}
			
			if (src.equals(three)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "3";
					}else{
						stemp1+="3";
					}
				}else{

				}
			}
			
			if (src.equals(four)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "4";
					}else{
						stemp1+="4";
					}
				}else{

				}
			}
			
			if (src.equals(five)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "5";
					}else{
						stemp1+="5";
					}
				}else{

				}
			}
			
			if (src.equals(six)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "6";
					}else{
						stemp1+="6";
					}
				}else{
				}
			}
			
			if (src.equals(seven)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "7";
					}else{
						stemp1+="7";
					}
				}else{
				}
			}
			
			if (src.equals(eight)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "8";
					}else{
						stemp1+="8";
					}
				}else{
				}
			}
			
			if (src.equals(nine)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "9";
					}else{
						stemp1+="9";
					}
				}else{
				}
			}
			
			if (src.equals(zero)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "0";
					}else{
						stemp1+="0";
					}
				}else{
				}
			}
			
			if (src.equals(X)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "x";
					}else{
						stemp1+="x";
					}
				}else{
				}
			}
			
			if (src.equals(Y)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "y";
					}else{
						stemp1+="y";
					}
				}else{
				}
			}
			
			if (src.equals(plus)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "+";
					}else{
						stemp1+="+";
					}
				}else{
				}
			}
			
			if (src.equals(minus)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "-";
					}else{
						stemp1+="-";
					}
				}else{
				}
			}
			
			if (src.equals(star)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "*";
					}else{
						stemp1+="*";
					}
				}else{
				}
			}
			
		
			
			if (src.equals(deci)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "0.";
					}else
						if(stemp1!= null){
							if(stemp1.contains(".")){
								System.out.println("Decimal Already Present");
							}else{
								stemp1+=".";
							}
						
					}
				}else{
				}
			}
			if (src.equals(neg)){
				if (opChosen==false){
					if(stemp1==null){
						stemp1= "-";
					}else
						if(stemp1 != null && stemp1.startsWith("-")){
							stemp1= stemp1.substring(1);
					}else{
						stemp1= "-" + stemp1;
					}
				}else{
				}
			}
			
			if(src.equals(back)){
				if(opChosen==false){
					if(stemp1==null){
						System.out.println("Can't Delete Nothing");
					}else{
						stemp1= stemp1.substring(0,stemp1.length()-1);
					}
				}else{
				}
			}
			if(equalsClicked==false){
				if(opChosen==false){
					questionbox.setText(stemp1);
				}else{
				}
			}
			
//			if(equalsClicked==false){
//				if(opChosen==false){
//					questionbox2.setText(stemp2);
//				}else{
//				}
//			}
//		}
	}

	}

	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton)event.getSource();
			
			String str="";

			if(src.equals(enter)){

				if(stemp1 != null){
					double d1 = 0.0;
					System.out.println("stemp1 is: "+ stemp1);
					if(stemp1.contains("x") && stemp1.contains("y")){
						System.out.println("Contain X and Y");
						String equationString=stemp1.substring(0,5);
						String powerString=stemp1.substring(stemp1.length()-1);
						int power = Integer.parseInt(powerString);
						System.out.println("equationString is:"+ equationString);
						System.out.println("powerString is: "+ powerString);
						System.out.println("powerNum is: "+ power);
						if(stemp1.contains("+")){
							str=binomialExpansionTwoVarPos(equationString,power);
						}else{
							str=binomialExpansionTwoVarNeg(equationString,power);
						}
						
					}
					else if(stemp1.contains("x")){
						String equationString=stemp1.substring(0,4);
						String powerString=stemp1.substring(stemp1.length()-1);
						int power = Integer.parseInt(powerString);
						System.out.println("equationString is:"+ equationString);
						System.out.println("powerString is: "+ powerString);
						System.out.println("powerNum is: "+ power);
						if(stemp1.contains("+")){
							str=binomialExpansionPosX(equationString,power);
						}else{
							str=binomialExpansionNegX(equationString,power);
						}
						
					}
					else if(stemp1.contains("y")){
						String equationString=stemp1.substring(0,4);
						String powerString=stemp1.substring(stemp1.length()-1);
						int power = Integer.parseInt(powerString);
						System.out.println("equationString is:"+ equationString);
						System.out.println("powerString is: "+ powerString);
						System.out.println("powerNum is: "+ power);
						if(stemp1.contains("+")){
							str=binomialExpansionPosY(equationString,power);
						}else{
							str=binomialExpansionNegY(equationString,power);
						}
						
					}
					else{
						//send reminder that this is a Binomial Calculater
						str="Only accpetable forms are 2x+4y**4, 2x+4**4  2+4y**4. Try Again";
						
						
					}
					
				
						
						answer = str;

				
				sanswer = answer;
				answerbox2.setText("The Binomial Expansion: "+sanswer);
				
//				sanswer2 = Double.toString(answer2);
//				answerbox3.setText("Number of Zombies: "+sanswer2);
//				
//				sanswer3 = Double.toString(answer3);
//				answerbox4.setText("Number of Susceptibles: "+sanswer3);
//				
//				sanswer4 = Double.toString(answer4);
//				answerbox5.setText("Total Population: "+sanswer4);
//				
//				sanswer5 = Double.toString(answer5);
//				answerbox6.setText("Number of Dead: "+sanswer5);
				

				if(operation == '/'){
					answerbox2.setText("ERROR");
				}
			}
		}
			
			if(src.equals(clear)){
				stemp1= null;
				equalsClicked= false;
				opChosen= false;
				operation= ' ';
				questionbox.setText("Input: 0");
				answerbox2.setText("Expansion: 0");
//				answerbox3.setText("Zombies: 0");
//				answerbox4.setText("Susceptibles: 0");
//				answerbox5.setText("Total Population: 0");
//				answerbox6.setText("Dead: 0");
				
				sanswer= null;
				sanswer2= null;
//				sanswer3= null;
//				sanswer4= null;
//				sanswer5= null;
			}
		}
	}
	
	
	
	
	
	
	
	
	//Helper functions ---------------------------------------------------------------------------
	public static String multString(char c, int n) {
		char[] arr = new char[n];
		Arrays.fill(arr, c);
		return new String(arr);
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static int powerChoosek(int powerN, int k) {

		int nfactorial = factorial(powerN);
		int nMinusk = factorial(powerN - k);
		int kfactorial = factorial(k);

		int powChoosek = nfactorial / (nMinusk * kfactorial);
		return powChoosek;
	}

	public static String firstPartBi(String leftMost, int NminusKpower) {
		String num = leftMost.substring(0, 1);
		// System.out.println(num+"yhvhkvbkjvk");

		int numInt = Integer.parseInt(num);
		int numIntTotal = (int) Math.pow(numInt, NminusKpower);
		String totalnum = Integer.toString(numIntTotal);

		char letterVar = leftMost.charAt(1);
		String totalVars = multString(letterVar, NminusKpower);

		return totalnum + totalVars;
	}

	
	//Main Functions
	
	//Only X
	public static String binomialExpansionPosX(String binomial, int power) {
		// String split[]
		String num = binomial.substring(0, 2);
		String numR = binomial.substring(3);
		int numRR = Integer.parseInt(numR);

		System.out.println(num);
		System.out.println(numR);
		System.out.println("----------");
		// num is now a string
		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(num, (power - k));
			String leftBiNum = find_num(leftBi);
			int numRight = (int) Math.pow(numRR, k);
			// System.out.println(combin +" "+leftBi +" "+numRight);
			if(k ==power){
			//int firstVarX = find_Var(leftBi);
			int intNumRight = Integer.parseInt(leftBiNum);
			int total = combin * numRight * intNumRight;
			String varPartofBi = "";
			String totalS = Integer.toString(total);
			System.out.println(totalS + varPartofBi);
			System.out.println("------------------------");

			if (k == power) {
				str = str + totalS + varPartofBi;
				break;
			}
			str = str + totalS + varPartofBi + " + ";
			
			}else{
				int firstVarX = find_Var(leftBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int total = combin * numRight * intNumRight;
				String varPartofBi = leftBi.substring(firstVarX);
				String totalS = Integer.toString(total);
				System.out.println(totalS + varPartofBi);
				System.out.println("------------------------");

				if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				str = str + totalS + varPartofBi + " + ";
			}
			
			
			
			
		}
		System.out.println(str);

		return str;
	}

	public static String binomialExpansionNegX(String binomial, int power) {
		// String split[]
				String num = binomial.substring(0, 2);
				String numR = binomial.substring(3);
				int numRR = Integer.parseInt(numR);

				System.out.println(num);
				System.out.println(numR);
				System.out.println("----------");
				// num is now a string
				String str = "";
				for (int k = 0; k <= power; k++) {
					int combin = powerChoosek(power, k);
					String leftBi = firstPartBi(num, (power - k));
					String leftBiNum = find_num(leftBi);
					int numRight = (int) Math.pow(numRR, k);
					// System.out.println(combin +" "+leftBi +" "+numRight);
					if(k ==power){
					//int firstVarX = find_Var(leftBi);
					int intNumRight = Integer.parseInt(leftBiNum);
					int total = combin * numRight * intNumRight;
					String varPartofBi = "";
					String totalS = Integer.toString(total);
					System.out.println(totalS + varPartofBi);
					System.out.println("------------------------");

					if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				if (k % 2 == 0) {
					str = str + totalS + varPartofBi + " -";
				} else {
			
					str = str + totalS + varPartofBi + " + ";
				}
					
					}else{
						int firstVarX = find_Var(leftBi);
						int intNumRight = Integer.parseInt(leftBiNum);
						int total = combin * numRight * intNumRight;
						String varPartofBi = leftBi.substring(firstVarX);
						String totalS = Integer.toString(total);
						System.out.println(totalS + varPartofBi);
						System.out.println("------------------------");

						if (k == power) {
						str = str + totalS + varPartofBi;
						break;
					}
					if (k % 2 == 0) {
						str = str + totalS + varPartofBi + " -";
					} else {
				
						str = str + totalS + varPartofBi + " + ";
					}
					}
					
					
					
					
				}
				System.out.println(str);

				return str;
	}

	//Only Y
	public static String binomialExpansionPosY(String binomial, int power) {
		// String split[]
		String num = binomial.substring(2);
		String numR = binomial.substring(0,1);
		int numRR = Integer.parseInt(numR);

		System.out.println(num);
		System.out.println(numR);
		System.out.println("----------");
		// num is now a string
		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(num, (power - k));
			String leftBiNum = find_num(leftBi);
			int numRight = (int) Math.pow(numRR, k);
			// System.out.println(combin +" "+leftBi +" "+numRight);
			if(k ==power){
			//int firstVarX = find_Var(leftBi);
			int intNumRight = Integer.parseInt(leftBiNum);
			int total = combin * numRight * intNumRight;
			String varPartofBi = "";
			String totalS = Integer.toString(total);
			System.out.println(totalS + varPartofBi);
			System.out.println("------------------------");

			if (k == power) {
				str = str + totalS + varPartofBi;
				break;
			}
			str = str + totalS + varPartofBi + " + ";
			
			}else{
				int firstVarX = find_Var(leftBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int total = combin * numRight * intNumRight;
				String varPartofBi = leftBi.substring(firstVarX);
				String totalS = Integer.toString(total);
				System.out.println(totalS + varPartofBi);
				System.out.println("------------------------");

				if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				str = str + totalS + varPartofBi + " + ";
			}
			
			
			
			
		}
		System.out.println(str);

		return str;
	}

	public static String binomialExpansionNegY(String binomial, int power) {
		// String split[]
				String num = binomial.substring(2);
				String numR = binomial.substring(0,1);
				int numRR = Integer.parseInt(numR);

				System.out.println(num);
				System.out.println(numR);
				System.out.println("----------");
				// num is now a string
				String str = "";
				for (int k = 0; k <= power; k++) {
					int combin = powerChoosek(power, k);
					String leftBi = firstPartBi(num, (power - k));
					String leftBiNum = find_num(leftBi);
					int numRight = (int) Math.pow(numRR, k);
					// System.out.println(combin +" "+leftBi +" "+numRight);
					if(k ==power){
					//int firstVarX = find_Var(leftBi);
					int intNumRight = Integer.parseInt(leftBiNum);
					int total = combin * numRight * intNumRight;
					String varPartofBi = "";
					String totalS = Integer.toString(total);
					System.out.println(totalS + varPartofBi);
					System.out.println("------------------------");

					if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				if (k % 2 == 0) {
					str = str + totalS + varPartofBi + " -";
				} else {
			
					str = str + totalS + varPartofBi + " + ";
				}
					
					}else{
						int firstVarX = find_Var(leftBi);
						int intNumRight = Integer.parseInt(leftBiNum);
						int total = combin * numRight * intNumRight;
						String varPartofBi = leftBi.substring(firstVarX);
						String totalS = Integer.toString(total);
						System.out.println(totalS + varPartofBi);
						System.out.println("------------------------");

						if (k == power) {
						str = str + totalS + varPartofBi;
						break;
					}
					if (k % 2 == 0) {
						str = str + totalS + varPartofBi + " -";
					} else {
				
						str = str + totalS + varPartofBi + " + ";
					}
					}
					
					
					
					
				}
				System.out.println(str);

				return str;
	}


	//X and Y
	
	public static String binomialExpansionTwoVarPos(String binomial, int power) {
		// String split[]
		String numLeft = binomial.substring(0, 2);
		String numRight = binomial.substring(3);

		// int numRR = Integer.parseInt(numR);

		// System.out.println(numLeft);
		// System.out.println(numRight);
		// System.out.println("----------");

		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(numLeft, (power - k));
			String rightBi = firstPartBi(numRight, (k));
			// System.out.println(combin);
			// System.out.println("leftBi "+leftBi);
			// System.out.println("rightBi "+rightBi);
			// System.out.println("+++++++++++");

			if (rightBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				// int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				// String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + " + ";
			}

			else if (leftBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				// int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				// String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiY;

			} else {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " + ";
			}

			// String varPartofBiX = leftBi.substring(firstVarX);
			// String varPartofBiY = leftBi.substring(firstVarY);

			// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY);

			// System.out.println(intNumRight);
			// System.out.println(intNumLeft);
			// System.out.println("----------");

		}

		return str;
	}

	public static String binomialExpansionTwoVarNeg(String binomial, int power) {
		// String split[]
		String numLeft = binomial.substring(0, 2);
		String numRight = binomial.substring(3);

		// int numRR = Integer.parseInt(numR);

		// System.out.println(numLeft);
		// System.out.println(numRight);
		// System.out.println("----------");

		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(numLeft, (power - k));
			String rightBi = firstPartBi(numRight, (k));
			// System.out.println(combin);
			// System.out.println("leftBi "+leftBi);
			// System.out.println("rightBi "+rightBi);
			// System.out.println("+++++++++++");

			if (rightBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				// int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				// String varPartofBiY = rightBi.substring(firstVarY);

				if (k % 2 == 0) {
					// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+"------------------------");
					str = str + combin * intNumRight * intNumLeft + varPartofBiX + " - ";
				}else{
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + " + ";
				}
			}

			else if (leftBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				// int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				// String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiY;

			} else {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				if (k % 2 == 0){
				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " - ";
				}else{
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " + ";
				}
			}

			// String varPartofBiX = leftBi.substring(firstVarX);
			// String varPartofBiY = leftBi.substring(firstVarY);

			// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY);

			// System.out.println(intNumRight);
			// System.out.println(intNumLeft);
			// System.out.println("----------");

		}

		return str;
	}

	//Helper functions
	public static String find_num(String input) {
		String str = "";
		for (int k = 0; k <= input.length(); k++) {
			// System.out.println(k);
			// System.out.println(input.length());
			// System.out.println(input.substring(k,k+1));
			if (k == input.length()) {
				if (input.substring(k).equals("1") || input.substring(k).equals("2") || input.substring(k).equals("3")
						|| input.substring(k).equals("4") || input.substring(k).equals("5")
						|| input.substring(k).equals("6") || input.substring(k).equals("7")
						|| input.substring(k).equals("8") || input.substring(k).equals("9")) {
					str = str + input.substring(k);

				} else {
					break;
				}
			}

			if (input.substring(k, k + 1).equals("1") || input.substring(k, k + 1).equals("2")
					|| input.substring(k, k + 1).equals("3") || input.substring(k, k + 1).equals("4")
					|| input.substring(k, k + 1).equals("5") || input.substring(k, k + 1).equals("6")
					|| input.substring(k, k + 1).equals("7") || input.substring(k, k + 1).equals("8")
					|| input.substring(k, k + 1).equals("9")) {
				str = str + input.substring(k, k + 1);

			} else {
				break;
			}

		}
		// System.out.println(str);
		return str;
	}

	public static int find_Var(String input) {
		String str = "";
		for (int k = 0; k <= input.length(); k++) {
			// System.out.println(k);
			// System.out.println(input.length());
			// System.out.println(input.substring(k,k+1));
			if (k == input.length()) {
				if (input.substring(k).equals("a") || input.substring(k).equals("k") || input.substring(k).equals("b")
						|| input.substring(k).equals("l") || input.substring(k).equals("c")
						|| input.substring(k).equals("m") || input.substring(k).equals("d")
						|| input.substring(k).equals("n") || input.substring(k).equals("e")
						|| input.substring(k).equals("f") || input.substring(k).equals("o")
						|| input.substring(k).equals("g") || input.substring(k).equals("p")
						|| input.substring(k).equals("h") || input.substring(k).equals("q")
						|| input.substring(k).equals("i") || input.substring(k).equals("r")
						|| input.substring(k).equals("j") || input.substring(k).equals("x")
						|| input.substring(k).equals("s") || input.substring(k).equals("y")
						|| input.substring(k).equals("t") || input.substring(k).equals("z")
						|| input.substring(k).equals("u") || input.substring(k).equals("v")
						|| input.substring(k).equals("w")) {
					return k;

				}
			}

			if (input.substring(k, k + 1).equals("a") || input.substring(k, k + 1).equals("k")
					|| input.substring(k, k + 1).equals("b") || input.substring(k, k + 1).equals("l")
					|| input.substring(k, k + 1).equals("c") || input.substring(k, k + 1).equals("m")
					|| input.substring(k, k + 1).equals("d") || input.substring(k, k + 1).equals("n")
					|| input.substring(k, k + 1).equals("e") || input.substring(k, k + 1).equals("f")
					|| input.substring(k, k + 1).equals("o") || input.substring(k, k + 1).equals("g")
					|| input.substring(k, k + 1).equals("p") || input.substring(k, k + 1).equals("h")
					|| input.substring(k, k + 1).equals("q") || input.substring(k, k + 1).equals("i")
					|| input.substring(k, k + 1).equals("r") || input.substring(k, k + 1).equals("j")
					|| input.substring(k, k + 1).equals("x") || input.substring(k, k + 1).equals("s")
					|| input.substring(k, k + 1).equals("y") || input.substring(k, k + 1).equals("t")
					|| input.substring(k, k + 1).equals("z") || input.substring(k, k + 1).equals("u")
					|| input.substring(k, k + 1).equals("v") || input.substring(k, k + 1).equals("w")) {
				return k;

			}

		}
		// System.out.println(str);
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
