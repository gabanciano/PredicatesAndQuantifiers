import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DMProposition extends JFrame implements ActionListener
{
	//Tab
	Font e = new Font("Arial", Font.PLAIN, 80);
	Font f = new Font("Arial", Font.PLAIN, 24);
	Font g = new Font("Arial", Font.PLAIN, 19);
	//Introduction
	JLabel Choose;
	JButton EngToPro, ProToEng, About;
	
	//EnglishtoProposition
	JLabel EPStorage;
	JButton EPYes, EPNo, EPReturn, EPReset;
	
	//EnglishtoPropositionYES
	JLabel EPYFirstSen, EPYSecondSen, EPYThirdSen, EPYChoose, EPYAnswer, EPYTopName;
	JTextArea EPYTotal;
	JButton EPYDone, EPYReturn;
	JPanel EPYFirstPanel, EPYSecondPanel, EPYThirdPanel, EPYOpePanelA, EPYOpePanelB;
	JComboBox EPYComboBoxA, EPYComboBoxB, EPYComboBoxC, EPYOpeComboBoxA, EPYOpeComboBoxB;
	String EPYFirstTemp, EPYOpeTempA, EPYSecondTemp, EPYOpeTempB, EPYThirdTemp;
	
	//EnglishtoPropositionNO
	JLabel EPNInput, EPNFirstSen, EPNSecondSen, EPNThirdSen, EPNChoose, EPNAnswer;
	JTextField EPNFirst, EPNSecond, EPNThird;
	JTextArea EPNTotal;
	JButton EPNDone, EPNReturn;
	JPanel EPNFirstPanel, EPNSecondPanel, EPNThirdPanel, EPNOpePanelA, EPNOpePanelB;
	JComboBox EPNComboBoxA, EPNComboBoxB, EPNComboBoxC, EPNOpeComboBoxA, EPNOpeComboBoxB;
	String EPNFirstTemp, EPNOpeTempA, EPNSecondTemp, EPNOpeTempB, EPNThirdTemp;
	
	//PropositiontoEnglish
	JLabel PEStorage;
	JButton PEYes, PENo, PEReturn, PEReset;
	
	//PropositiontoEnglishYES
	JLabel PEYFirstSen,PEYSecondSen, PEYThirdSen, PEYChoose, PEYAnswer, PEYTopName;
	JTextArea PEYTotal;
	JButton PEYDone, PEYReturn;
	JPanel PEYFirstPanel, PEYSecondPanel, PEYThirdPanel, PEYOpePanelA, PEYOpePanelB;
	JComboBox PEYComboBoxA, PEYComboBoxB, PEYComboBoxC, PEYOpeComboBoxA, PEYOpeComboBoxB;
	String PEYFirstTemp, PEYOpeTempA, PEYSecondTemp, PEYOpeTempB, PEYThirdTemp;
	
	//Proposition to English NO
	JLabel PENInput, PENFirstSen, PENSecondSen, PENThirdSen, PENChoose, PENAnswer;
	JTextField PENFirst, PENSecond, PENThird;
	JTextArea PENTotal;
	JButton PENDone, PENReturn;
	JPanel PENFirstPanel, PENSecondPanel, PENThirdPanel, PENOpePanelA, PENOpePanelB;
	JComboBox PENComboBoxA, PENComboBoxB, PENComboBoxC, PENOpeComboBoxA, PENOpeComboBoxB;
	String PENFirstTemp, PENOpeTempA, PENSecondTemp, PENOpeTempB, PENThirdTemp;
	
	public DMProposition()
	{
		Container C = getContentPane();
		C.setLayout(null);
		
		//CHOOSE WHICH PROPOSITION
		
		Choose = new JLabel ("PLEASE CHOOSE YOUR DESIRED CONVERSION");
		EngToPro = new JButton ("Sentences to Symbols");
		ProToEng = new JButton ("Symbols to Sentences");
		
		EngToPro.setFont(f);
		ProToEng.setFont(f);
		
		Choose.setBounds(250,20,300,20);
		EngToPro.setBounds(140,70,500,200);
		ProToEng.setBounds(140,300,500,200);
		
			//IF ENGLISH TO PROPOSITION
			EPStorage = new JLabel ("USE STORED SENTENCES?");
			EPYes = new JButton ("YES");
			EPNo = new JButton ("NO");
			EPReturn = new JButton ("<");
			EPReset = new JButton ("RESET ALL");
			
			EPYes.setFont(f);
			EPNo.setFont(f);
			EPReturn.setFont(g);
			
			EPStorage.setBounds(310,20,300,20);
			EPYes.setBounds(140,130,500,150);
			EPNo.setBounds(140,290,500,150);
			EPReturn.setBounds(10,10,50,50);
		
				//IF YES (ENG TO PROP)
				EPYTopName = new JLabel ("ENGLISH TO SENTENCES");
				EPYFirstSen = new JLabel ("S - The student.");
				EPYSecondSen = new JLabel ("p - playing volleyball");
				EPYThirdSen = new JLabel ("q - eating lunch.");
				EPYThirdSen = new JLabel ("r - reviewing lessons");
				EPYChoose = new JLabel ("CHOOSE WANTED ORDER OF STATEMENTS TO BE TRANSLATED");
				
				EPYFirstSen.setBounds(290,60,150,20);
				EPYSecondSen.setBounds(290,80,150,20);
				EPYThirdSen.setBounds(290,100,150,20);
				EPYChoose.setBounds(170,140,500,20);
				
					String EPYListA[] = {"The student", "playing volleyball", "eating lunch", "Today is not Monday", "Today is not hot", "Today is not sunny"};
					EPYFirstPanel = new JPanel();
					EPYComboBoxA = new JComboBox (EPYListA);
					EPYFirstPanel.add(EPYComboBoxA);
					
					String EPYOpeListA[] = {"AND", "OR", "IMPLIES", "IF AND ONLY IF", "BUT NOT"};
					EPYOpePanelA = new JPanel();
					EPYOpeComboBoxA = new JComboBox (EPYOpeListA);
					EPYOpePanelA.add(EPYOpeComboBoxA);
					
					String EPYListB[] = {"Today is Monday", "Today is hot", "Today is sunny", "Today is not Monday", "Today is not hot", "Today is not sunny"};
					EPYSecondPanel = new JPanel();
					EPYComboBoxB = new JComboBox (EPYListB);
					EPYSecondPanel.add(EPYComboBoxB);
					
					String EPYOpeListB[] = {"AND", "OR", "IMPLIES", "IF AND ONLY IF", "BUT NOT", "None"};
					EPYOpePanelB = new JPanel();
					EPYOpeComboBoxB = new JComboBox (EPYOpeListB);
					EPYOpePanelB.add(EPYOpeComboBoxB);
					
					String EPYListC[] = {"Today is Monday", "Today is hot", "Today is sunny", "Today is not Monday", "Today is not hot", "Today is not sunny", "None"};
					EPYThirdPanel = new JPanel();
					EPYComboBoxC = new JComboBox (EPYListC);
					EPYThirdPanel.add(EPYComboBoxC);
					
					EPYFirstPanel.setBounds(10,170,150,30);					
					EPYOpePanelA.setBounds(155,170,120,30);
					EPYSecondPanel.setBounds(270,170,150,30);
					EPYOpePanelB.setBounds(410,170,130,30);
					EPYThirdPanel.setBounds(520,170,150,30);

				EPYDone = new JButton ("DONE");
				EPYAnswer = new JLabel ("Answer:");
				EPYTotal = new JTextArea (5,10);
				EPYReturn = new JButton ("<");
				
				EPYTotal.setEditable(false);
				EPYTotal.setFont(e);
				EPYReturn.setFont(g);
				
				EPYDone.setBounds(250,500,200,50);
				EPYAnswer.setBounds(10,220,150,20);
				EPYTotal.setBounds(10,240,665,250);
				EPYReturn.setBounds(10,10,50,50);
				
				//IF NO (ENG TO PROP)
				EPNInput = new JLabel ("INPUT 3 SENTENCES");
				EPNFirstSen = new JLabel ("1st Sentence (p) -");
				EPNFirst = new JTextField (10);
				EPNSecondSen = new JLabel ("2nd Sentence (q) -");
				EPNSecond = new JTextField (10);
				EPNThirdSen = new JLabel ("3rd Sentence (r) -");
				EPNThird = new JTextField (10);
				EPNChoose = new JLabel ("CHOOSE DESIRED ORDER OF ENGLISH STATEMENTS TO BE TRANSLATED");
				
				EPNFirstSen.setBounds(210,60,150,20);
				EPNFirst.setBounds(320,60,150,20);
				EPNSecondSen.setBounds(210,90,150,20);
				EPNSecond.setBounds(320,90,150,20);
				EPNThirdSen.setBounds(210,120,150,20);
				EPNThird.setBounds(320,120,150,20);
				EPNChoose.setBounds(140,150,500,20);
				
					String EPNListA[] = {"1st Sentence", "2nd Sentence", "3rd Sentence", "~1st Sentence", "~2nd Sentence", "~3rd Sentence"};
					EPNFirstPanel = new JPanel();
					EPNComboBoxA = new JComboBox (EPNListA);
					EPNFirstPanel.add(EPNComboBoxA);
					
					String EPNOpeListA[] = {"AND", "OR", "IMPLIES", "IF AND ONLY IF", "BUT NOT"};
					EPNOpePanelA = new JPanel();
					EPNOpeComboBoxA = new JComboBox (EPNOpeListA);
					EPNOpePanelA.add(EPNOpeComboBoxA);
					
					String EPNListB[] = {"1st Sentence", "2nd Sentence", "3rd Sentence", "~1st Sentence", "~2nd Sentence", "~3rd Sentence"};
					EPNSecondPanel = new JPanel();
					EPNComboBoxB = new JComboBox (EPNListB);
					EPNSecondPanel.add(EPNComboBoxB);
					
					String EPNOpeListB[] = {"AND", "OR", "IMPLIES", "IF AND ONLY IF", "BUT NOT", "None"};
					EPNOpePanelB = new JPanel();
					EPNOpeComboBoxB = new JComboBox (EPNOpeListB);
					EPNOpePanelB.add(EPNOpeComboBoxB);
					
					String EPNListC[] = {"1st Sentence", "2nd Sentence", "3rd Sentence", "~1st Sentence", "~2nd Sentence", "~3rd Sentence", "None"};
					EPNThirdPanel = new JPanel();
					EPNComboBoxC = new JComboBox (EPNListC);
					EPNThirdPanel.add(EPNComboBoxC);
					
					EPNFirstPanel.setBounds(10,230,150,30);
					EPNOpePanelA.setBounds(155,230,120,30);
					EPNSecondPanel.setBounds(270,230,150,30);
					EPNOpePanelB.setBounds(410,230,130,30);
					EPNThirdPanel.setBounds(520,230,150,30);
	
				EPNDone = new JButton ("DONE");
				EPNAnswer = new JLabel ("Answer:");
				EPNTotal = new JTextArea (5, 10);
				EPNReturn = new JButton ("<");
				
				EPNReturn.setFont(g);
				EPYTopName.setBounds(320,20,200,20);
				EPNTotal.setFont(e);
				EPNTotal.setEditable(false);
				
				EPNTotal.setBounds(10,290,665,200);
				EPNAnswer.setBounds(10,270,150,20);
				EPNDone.setBounds(250,500,200,50);
				EPNReturn.setBounds(10,10,50,50);
				
			//IF PROPOSITION TO ENGLISH
			PEStorage = new JLabel ("USE STORED SENTENCES?");
			PEYes = new JButton ("YES");
			PENo = new JButton ("NO");
			PEReturn = new JButton ("<");
			PEReset = new JButton ("RESET ALL");
			
			PEYes.setFont(f);
			PENo.setFont(f);
			PEReturn.setFont(g);
			
			PEStorage.setBounds(310,20,300,20);
			PEYes.setBounds(140,130,500,150);
			PENo.setBounds(140,290,500,150);
			PEReturn.setBounds(10,10,50,50);
				
				//IF YES (PROP TO ENG)
				PEYTopName = new JLabel("SENTENCES TO ENGLISH");
				PEYFirstSen = new JLabel ("p - Today is Monday.");
				PEYSecondSen = new JLabel ("q - Today is sunny.");
				PEYThirdSen = new JLabel ("r - Today is hot.");
				PEYChoose = new JLabel ("CHOOSE WANTED ORDER OF ENGLISH STATEMENTS TO BE TRANSLATED");
				
				PEYTopName.setBounds(320,20,200,20);
				PEYFirstSen.setBounds(290,60,150,20);
				PEYSecondSen.setBounds(290,80,150,20);
				PEYThirdSen.setBounds(290,100,150,20);
				PEYChoose.setBounds(170,140,500,20);
					
					String PEYListA[] = {"p", "q", "r", "~p", "~q", "~r"};
					PEYFirstPanel = new JPanel();
					PEYComboBoxA = new JComboBox (PEYListA);
					PEYFirstPanel.add(PEYComboBoxA);
					
					String PEYOpeListA[] = {"^", "V", "->", "<->", "XOR"};
					PEYOpePanelA = new JPanel();
					PEYOpeComboBoxA = new JComboBox (PEYOpeListA);
					PEYOpePanelA.add(PEYOpeComboBoxA);
					
					String PEYListB[] = {"p", "q", "r", "~p", "~q", "~r"};
					PEYSecondPanel = new JPanel();
					PEYComboBoxB = new JComboBox (PEYListB);
					PEYSecondPanel.add(PEYComboBoxB);
					
					String PEYOpeListB[] = {"^", "V", "->", "<->", "XOR", "N/A"};
					PEYOpePanelB = new JPanel();
					PEYOpeComboBoxB = new JComboBox (PEYOpeListB);
					PEYOpePanelB.add(PEYOpeComboBoxB);
		
					String PEYListC[] = {"p", "q", "r", "~p", "~q", "~r", "N/A"};
					PEYThirdPanel = new JPanel();
					PEYComboBoxC = new JComboBox (PEYListC);
					PEYThirdPanel.add(PEYComboBoxC);	
					
					PEYFirstPanel.setBounds(10,170,150,30);
					PEYOpePanelA.setBounds(155,170,120,30);
					PEYSecondPanel.setBounds(270,170,150,30);
					PEYOpePanelB.setBounds(410,170,130,30);	
					PEYThirdPanel.setBounds(520,170,150,30);		
			
				PEYDone = new JButton ("DONE");
				PEYAnswer = new JLabel ("Answer:");
				PEYTotal = new JTextArea (5,10);
				PEYReturn = new JButton ("<");
				
				PEYReturn.setFont(g);
				PEYTotal.setEditable(false);
				
				PEYTopName.setBounds(320,20,200,20);
				PEYDone.setBounds(250,500,200,50);
				PEYAnswer.setBounds(10,220,150,20);
				PEYTotal.setBounds(10,240,665,250);
				PEYReturn.setBounds(10,10,50,50);
				

				// IF NO (PROP TO ENG)
				PENInput = new JLabel ("INPUT 3 SENTENCES:");
				PENFirstSen = new JLabel ("1st Sentence (p) -");
				PENFirst = new JTextField (10);
				PENSecondSen = new JLabel ("2nd Sentence (q) -");
				PENSecond = new JTextField (10);
				PENThirdSen = new JLabel ("3rd Sentence (r) -");
				PENThird = new JTextField (10);
				PENChoose = new JLabel ("CHOOSE DESIRED ORDER OF ENGLISH STATEMENTS TO BE TRANSLATED");
				
				PENFirstSen.setBounds(210,60,150,20);
				PENFirst.setBounds(320,60,150,20);
				PENSecondSen.setBounds(210,90,150,20);
				PENSecond.setBounds(320,90,150,20);
				PENThirdSen.setBounds(210,120,150,20);
				PENThird.setBounds(320,120,150,20);
				PENChoose.setBounds(140,150,500,20);
				
					String PENListA[] = {"p", "q", "r", "~p", "~q", "~r"};
					PENFirstPanel = new JPanel();
					PENComboBoxA = new JComboBox (PENListA);
					PENFirstPanel.add(PENComboBoxA);
					
					String PENOpeListA[] = {"^", "V", "->", "<->", "XOR"};
					PENOpePanelA = new JPanel();
					PENOpeComboBoxA = new JComboBox (PENOpeListA);
					PENOpePanelA.add(PENOpeComboBoxA);
					
					String PENListB[] = {"p", "q", "r", "~p", "~q", "~r"};
					PENSecondPanel = new JPanel();
					PENComboBoxB = new JComboBox (PENListB);
					PENSecondPanel.add(PENComboBoxB);
					String PENOpeListB[] = {"^", "V", "->", "<->", "XOR", "N/A"};
					PENOpePanelB = new JPanel();
					PENOpeComboBoxB = new JComboBox (PENOpeListB);
					PENOpePanelB.add(PENOpeComboBoxB);
					
					String PENListC[] = {"p", "q", "r", "~p", "~q", "~r", "N/A"};
					PENThirdPanel = new JPanel();
					PENComboBoxC = new JComboBox (PENListC);
					PENThirdPanel.add(PENComboBoxC);
					
					PENFirstPanel.setBounds(10,230,150,30);
					PENOpePanelA.setBounds(155,230,120,30);
					PENSecondPanel.setBounds(270,230,150,30);
					PENOpePanelB.setBounds(410,230,130,30);
					PENThirdPanel.setBounds(520,230,150,30);

				PENDone = new JButton ("DONE");
				PENAnswer = new JLabel ("Answer:");
				PENTotal = new JTextArea (5, 10);
				PENReturn = new JButton ("<");

				PENDone.setBounds(250,500,200,50);
				PENTotal.setBounds(10,290,665,200);
				PENAnswer.setBounds(10,270,150,20);
				PENReturn.setBounds(10,10,50,50);
			
		//ADD Introduction
		C.add(Choose);
		C.add(EngToPro);
		C.add(ProToEng);
			//ADD (If English to Proposition)
			C.add(EPStorage);
			C.add(EPYes);
			C.add(EPNo);
			C.add(EPReturn);
			C.add(EPReset);
				//ADD (English to Proposition YES)
				C.add(EPYTopName);
				C.add(EPYFirstSen);
				C.add(EPYSecondSen);
				C.add(EPYThirdSen);
				C.add(EPYChoose);
				C.add(EPYFirstPanel); C.add(EPYOpePanelA); C.add(EPYSecondPanel); C.add(EPYOpePanelB); C.add(EPYThirdPanel);
				C.add(EPYDone);
				C.add(EPYAnswer); C.add(EPYTotal);
				C.add(EPYReturn);

				//ADD (English to Proposition NO)
				C.add(EPNInput);
				C.add(EPNFirstSen);	C.add(EPNFirst);
				C.add(EPNSecondSen); C.add(EPNSecond);
				C.add(EPNThirdSen); C.add(EPNThird);
				C.add(EPNChoose);
				C.add(EPNFirstPanel);
				C.add(EPNOpePanelA);
				C.add(EPNSecondPanel);
				C.add(EPNOpePanelB);
				C.add(EPNThirdPanel);
				C.add(EPNDone);
				C.add(EPNAnswer); C.add(EPNTotal);
				C.add(EPNReturn);
			//ADD (If Proposition to English)
			C.add(PEStorage);
			C.add(PEYes);
			C.add(PENo);
			C.add(PEReturn);
			C.add(PEReset);
				//ADD (Proposition to English YES)
				C.add(PEYTopName);
				C.add(PEYFirstSen);
				C.add(PEYSecondSen);
				C.add(PEYThirdSen);
				C.add(PEYChoose);
				C.add(PEYFirstPanel); C.add(PEYOpePanelA); C.add(PEYSecondPanel); C.add(PEYOpePanelB); C.add(PEYThirdPanel);
				C.add(PEYDone);
				C.add(PEYAnswer); C.add(PEYTotal);
				C.add(PEYReturn);
				//ADD (Proposition to English NO)
				C.add(PENInput);
				C.add(PENFirstSen);	C.add(PENFirst);
				C.add(PENSecondSen); C.add(PENSecond);
				C.add(PENThirdSen); C.add(PENThird);
				C.add(PENChoose);
				C.add(PENFirstPanel); C.add(PENOpePanelA); C.add(PENSecondPanel); C.add(PENOpePanelB); C.add(PENThirdPanel);
				C.add(PENDone);
				C.add(PENAnswer); C.add(PENTotal);
				C.add(PENReturn);
		
		EPYTopName.setVisible(false);
		PEYTopName.setVisible(false);
		//setVisible(false) -- ENGLISH TO PROPOSITION
		EPStorage.setVisible(false);
		EPYes.setVisible(false);
		EPNo.setVisible(false);
		EPReturn.setVisible(false);
		EPReset.setVisible(false);
		EPYFirstSen.setVisible(false);
		EPYSecondSen.setVisible(false);
		EPYThirdSen.setVisible(false);
		EPYChoose.setVisible(false);
		EPYFirstPanel.setVisible(false);
		EPYOpePanelA.setVisible(false);
		EPYSecondPanel.setVisible(false);
		EPYOpePanelB.setVisible(false);
		EPYThirdPanel.setVisible(false);
		EPYDone.setVisible(false);
		EPYAnswer.setVisible(false);
		EPYTotal.setVisible(false);
		EPYReturn.setVisible(false);
		EPNInput.setVisible(false);
		EPNFirstSen.setVisible(false);
		EPNFirst.setVisible(false);
		EPNSecondSen.setVisible(false);
		EPNSecond.setVisible(false);
		EPNThirdSen.setVisible(false);
		EPNThird.setVisible(false);
		EPNChoose.setVisible(false);
		EPNFirstPanel.setVisible(false);
		EPNOpePanelA.setVisible(false);
		EPNSecondPanel.setVisible(false);
		EPNOpePanelB.setVisible(false);
		EPNThirdPanel.setVisible(false);
		EPNDone.setVisible(false);
		EPNAnswer.setVisible(false);
		EPNTotal.setVisible(false);
		EPNReturn.setVisible(false);
		
		//setVisible (false) -- PROPOSITION TO ENGLISH
		PEStorage.setVisible(false);
		PEYes.setVisible(false);
		PENo.setVisible(false);
		PEReturn.setVisible(false);
		PEReset.setVisible(false);
		PEYFirstSen.setVisible(false);
		PEYSecondSen.setVisible(false);
		PEYThirdSen.setVisible(false);
		PEYChoose.setVisible(false);
		PEYFirstPanel.setVisible(false);
		PEYOpePanelA.setVisible(false);
		PEYSecondPanel.setVisible(false);
		PEYOpePanelB.setVisible(false);
		PEYThirdPanel.setVisible(false);
		PEYDone.setVisible(false);
		PEYAnswer.setVisible(false);
		PEYTotal.setVisible(false);
		PEYReturn.setVisible(false);
		PENInput.setVisible(false);
		PENFirstSen.setVisible(false);
		PENFirst.setVisible(false);
		PENSecondSen.setVisible(false);
		PENSecond.setVisible(false);
		PENThirdSen.setVisible(false);
		PENThird.setVisible(false);
		PENChoose.setVisible(false);
		PENFirstPanel.setVisible(false);
		PENOpePanelA.setVisible(false);
		PENSecondPanel.setVisible(false);
		PENOpePanelB.setVisible(false);
		PENThirdPanel.setVisible(false);
		PENDone.setVisible(false);
		PENAnswer.setVisible(false);
		PENTotal.setVisible(false);
		PENReturn.setVisible(false);
		
		//setEnabled -- ENGLISH TO PROPOSITION
		EPYes.setEnabled (false);
		EPNo.setEnabled (false);
		EPReturn.setEnabled (false);
		EPReset.setEnabled (false);
		
		//setEnabled -- PROPOSITION TO ENGLISH
		PEYes.setEnabled (false);
		PENo.setEnabled (false);
		PEReturn.setEnabled(false);
		PEReset.setEnabled (false);
		
		//addActionListener -- INTRODUCTION
		EngToPro.addActionListener(this);
		ProToEng.addActionListener(this);
		
		//addActionListener -- ENGLISH TO PROPOSITION
		EPYes.addActionListener(this);
		EPNo.addActionListener(this);
		EPReturn.addActionListener(this);
		EPReset.addActionListener (this);
		EPYDone.addActionListener(this);
		EPNDone.addActionListener(this);
		EPYReturn.addActionListener(this);
		EPNReturn.addActionListener(this);
		
		//addActionListener -- PROPOSITION TO ENGLISH
		PEYes.addActionListener (this);
		PENo.addActionListener(this);
		PEReturn.addActionListener(this);
		PEReset.addActionListener (this);
		PEYDone.addActionListener(this);
		PENDone.addActionListener(this);
		PEYReturn.addActionListener(this);
		PENReturn.addActionListener(this);
		
		setTitle("Discreet Project");;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (800, 600);
		setLocationRelativeTo(null);
		setVisible (true);
		
	}
	
	public void actionPerformed (ActionEvent E)
	{		
		//Introduction -- IF ENGTOPRO BUTTON CLICKED
		if (E.getSource() == EngToPro)
		{
			EPStorage.setVisible(true);
			EPYes.setVisible(true);
			EPNo.setVisible(true);	
			EPReturn.setVisible(true);		
			EPYes.setEnabled(true);
			EPNo.setEnabled(true);
			EPReturn.setEnabled(true);
			
			Choose.setVisible(false);
			EngToPro.setVisible(false);
			ProToEng.setVisible(false);
		}
			
			//English to Proposition -- IF YES BUTTON CLICKED
			if (E.getSource() == EPYes)
			{
				EPYTopName.setVisible(true);
				EPReset.setEnabled(true);
				EPReset.setVisible(true);
				EPYFirstSen.setVisible(true);
				EPYSecondSen.setVisible(true);
				EPYThirdSen.setVisible(true);
				EPYChoose.setVisible(true);
				EPYFirstPanel.setVisible(true);
				EPYOpePanelA.setVisible(true);
				EPYSecondPanel.setVisible(true);
				EPYOpePanelB.setVisible(true);
				EPYThirdPanel.setVisible(true);
				EPYDone.setVisible(true);
				EPYAnswer.setVisible(true);
				EPYTotal.setVisible(true);	
				EPYReturn.setVisible(true);
				EPStorage.setVisible(false);					
				EPYes.setVisible(false);
				EPNo.setVisible(false);
				EPReturn.setVisible(false);
			}
				
				//English to Proposition -- IF DONE BUTTON CLICKED
				if (E.getSource() == EPYDone)
				{
					//For EPYFirstPanel
					if (EPYComboBoxA.getSelectedItem().equals("Today is Monday"))
						EPYFirstTemp = "p";
					else if (EPYComboBoxA.getSelectedItem().equals("Today is sunny"))
						EPYFirstTemp = "q";
					else if (EPYComboBoxA.getSelectedItem().equals("Today is hot"))
						EPYFirstTemp = "r";
					else if (EPYComboBoxA.getSelectedItem().equals("Today is not Monday"))
						EPYFirstTemp = "~p";
					else if (EPYComboBoxA.getSelectedItem().equals("Today is not sunny"))
						EPYFirstTemp = "~q";
					else if (EPYComboBoxA.getSelectedItem().equals("Today is not hot"))
						EPYFirstTemp = "~r";						
						
					//For EPYOpePanelA
					if (EPYOpeComboBoxA.getSelectedItem().equals("AND"))
						EPYOpeTempA = "^";
					else if (EPYOpeComboBoxA.getSelectedItem().equals("OR"))
						EPYOpeTempA = "V";
					else if (EPYOpeComboBoxA.getSelectedItem().equals("IMPLIES"))
						EPYOpeTempA = "->";
					else if (EPYOpeComboBoxA.getSelectedItem().equals("IF AND ONLY IF"))
						EPYOpeTempA = "<->";
					else if (EPYOpeComboBoxA.getSelectedItem().equals("BUT NOT"))
						EPYOpeTempA = "XOR";
						
					//For EPYSecondPanel
					if (EPYComboBoxB.getSelectedItem().equals("Today is Monday"))
						EPYSecondTemp = "p";
					else if (EPYComboBoxB.getSelectedItem().equals("Today is sunny"))
						EPYSecondTemp = "q";
					else if (EPYComboBoxB.getSelectedItem().equals("Today is hot"))
						EPYSecondTemp = "r";
					else if (EPYComboBoxB.getSelectedItem().equals("Today is not Monday"))
						EPYSecondTemp = "~p";
					else if (EPYComboBoxB.getSelectedItem().equals("Today is not sunny"))
						EPYSecondTemp = "~q";
					else if (EPYComboBoxB.getSelectedItem().equals("Today is not hot"))
						EPYSecondTemp = "~r";
						
					//For EPYOpePanelB
					if (EPYOpeComboBoxB.getSelectedItem().equals("AND"))
						EPYOpeTempB = "^";
					else if (EPYOpeComboBoxB.getSelectedItem().equals("OR"))
						EPYOpeTempB = "V";
					else if (EPYOpeComboBoxB.getSelectedItem().equals("IMPLIES"))
						EPYOpeTempB = "->";
					else if (EPYOpeComboBoxB.getSelectedItem().equals("IF AND ONLY IF"))
						EPYOpeTempB = "<->";
					else if (EPYOpeComboBoxB.getSelectedItem().equals("BUT NOT"))
						EPYOpeTempB = "XOR";
					else if (EPYOpeComboBoxB.getSelectedItem().equals("None"))
						EPYOpeTempB = " ";	
							
					//For EPYThirdPanel
					if (EPYComboBoxC.getSelectedItem().equals("Today is Monday"))
						EPYThirdTemp = "p";
					else if (EPYComboBoxC.getSelectedItem().equals("Today is sunny"))
						EPYThirdTemp = "q";
					else if (EPYComboBoxC.getSelectedItem().equals("Today is hot"))
						EPYThirdTemp = "r";
					else if (EPYComboBoxC.getSelectedItem().equals("Today is not Monday"))
						EPYThirdTemp = "~p";
					else if (EPYComboBoxC.getSelectedItem().equals("Today is not sunny"))
						EPYThirdTemp = "~q";
					else if (EPYComboBoxC.getSelectedItem().equals("Today is not hot"))
						EPYThirdTemp = "~r";
					else if (EPYComboBoxC.getSelectedItem().equals("None"))
						EPYThirdTemp = " ";
						
					EPYTotal.setText(EPYFirstTemp + " " + EPYOpeTempA + " " + EPYSecondTemp + " " + EPYOpeTempB + " " + EPYThirdTemp);
				}
				
				//English to Proposition -- IF (YES) RETURN BUTTON CLICKED
				if (E.getSource() == EPYReturn)
				{
					EPYTopName.setVisible(false);
					EPStorage.setVisible(true);
					EPYes.setVisible(true);
					EPNo.setVisible(true);			
					EPYes.setEnabled(true);
					EPNo.setEnabled(true);	
					EPReturn.setVisible(true);
					EPReset.setVisible(false);	
					EPYFirstSen.setVisible(false);
					EPYSecondSen.setVisible(false);
					EPYThirdSen.setVisible(false);
					EPYChoose.setVisible(false);
					EPYFirstPanel.setVisible(false);
					EPYOpePanelA.setVisible(false);
					EPYSecondPanel.setVisible(false);
					EPYOpePanelB.setVisible(false);
					EPYThirdPanel.setVisible(false);
					EPYDone.setVisible(false);
					EPYAnswer.setVisible(false);
					EPYTotal.setVisible(false);
					EPYReturn.setVisible(false);
				}
		
			//English to Proposition -- IF NO BUTTON CLICKED
			if (E.getSource() == EPNo)
			{
				EPYTopName.setVisible(true);
				EPNInput.setVisible(true);
				EPNFirstSen.setVisible(true);
				EPNFirst.setVisible(true);
				EPNSecondSen.setVisible(true);
				EPNSecond.setVisible(true);
				EPNThirdSen.setVisible(true);
				EPNThird.setVisible(true);
				EPNChoose.setVisible(true);
				EPNFirstPanel.setVisible(true);
				EPNOpePanelA.setVisible(true);
				EPNSecondPanel.setVisible(true);
				EPNOpePanelB.setVisible(true);
				EPNThirdPanel.setVisible(true);
				EPNDone.setVisible(true);
				EPNAnswer.setVisible(true);
				EPNTotal.setVisible(true);
				EPNReturn.setVisible(true);
				EPStorage.setVisible(false);
				EPYes.setVisible(false);
				EPNo.setVisible(false);
				EPReturn.setVisible(false);
				EPReset.setEnabled(true);
				EPReset.setVisible(true);
			}
				
				//English to Proposition -- IF DONE BUTTON CLICKED
				if (E.getSource() == EPNDone)
				{
					//For EPNFirstPanel
					if (EPNComboBoxA.getSelectedItem().equals("1st Sentence"))
						EPNFirstTemp = "p";
					else if (EPNComboBoxA.getSelectedItem().equals("2nd Sentence"))
						EPNFirstTemp = "q";
					else if (EPNComboBoxA.getSelectedItem().equals("3rd Sentence"))
						EPNFirstTemp = "r";
					else if (EPNComboBoxA.getSelectedItem().equals("~1st Sentence"))
						EPNFirstTemp = "~p";
					else if (EPNComboBoxA.getSelectedItem().equals("~2nd Sentence"))
						EPNFirstTemp = "~q";
					else if (EPNComboBoxA.getSelectedItem().equals("3rd Sentence"))
						EPNFirstTemp = "~r";
						
					//For EPNOpePanelA
					if (EPNOpeComboBoxA.getSelectedItem().equals("AND"))
						EPNOpeTempA = "^";
					else if (EPNOpeComboBoxA.getSelectedItem().equals("OR"))
						EPNOpeTempA = "V";
					else if (EPNOpeComboBoxA.getSelectedItem().equals("IMPLIES"))
						EPNOpeTempA = "->";
					else if (EPNOpeComboBoxA.getSelectedItem().equals("IF AND ONLY IF"))
						EPNOpeTempA = "<->";
					else if (EPNOpeComboBoxA.getSelectedItem().equals("BUT NOT"))
						EPNOpeTempA = "XOR";
						
					//For EPNSecondPanel
					if (EPNComboBoxB.getSelectedItem().equals("1st Sentence"))
						EPNSecondTemp = "p";
					else if (EPNComboBoxB.getSelectedItem().equals("2nd Sentence"))
						EPNSecondTemp = "q";
					else if (EPNComboBoxB.getSelectedItem().equals("3rd Sentence"))
						EPNSecondTemp = "r";
					else if (EPNComboBoxB.getSelectedItem().equals("~1st Sentence"))
						EPNSecondTemp = "~p";
					else if (EPNComboBoxB.getSelectedItem().equals("~2nd Sentence"))
						EPNSecondTemp = "~q";
					else if (EPNComboBoxB.getSelectedItem().equals("~3rd Sentence"))
						EPNSecondTemp = "~r";
						
					//For EPNOpePanelB
					if (EPNOpeComboBoxB.getSelectedItem().equals("AND"))
						EPNOpeTempB = "^";
					else if (EPNOpeComboBoxB.getSelectedItem().equals("OR"))
						EPNOpeTempB = "V";
					else if (EPNOpeComboBoxB.getSelectedItem().equals("IMPLIES"))
						EPNOpeTempB = "->";
					else if (EPNOpeComboBoxB.getSelectedItem().equals("IF AND ONLY IF"))
						EPNOpeTempB = "<->";
					else if (EPNOpeComboBoxB.getSelectedItem().equals("BUT NOT"))
						EPNOpeTempB = "XOR";
					else if (EPNOpeComboBoxB.getSelectedItem().equals("None"))
						EPNOpeTempB = " ";
				
					//For EPNThirdPanel
					if (EPNComboBoxC.getSelectedItem().equals("1st Sentence"))
						EPNThirdTemp = "p";
					else if (EPNComboBoxC.getSelectedItem().equals("2nd Sentence"))
						EPNThirdTemp = "q";
					else if (EPNComboBoxC.getSelectedItem().equals("3rd Sentence"))
						EPNThirdTemp = "r";
					else if (EPNComboBoxC.getSelectedItem().equals("~1st Sentence"))
						EPNThirdTemp = "~p";
					else if (EPNComboBoxC.getSelectedItem().equals("~2nd Sentence"))
						EPNThirdTemp = "~q";
					else if (EPNComboBoxC.getSelectedItem().equals("~3rd Sentence"))
						EPNThirdTemp = "~r";
					else if (EPNComboBoxC.getSelectedItem().equals("None"))
						EPNThirdTemp = " ";
						
					EPNTotal.setText(EPNFirstTemp + " " + EPNOpeTempA + " " + EPNSecondTemp + " " + EPNOpeTempB + " " + EPNThirdTemp);
				}
				
				//English to Proposition -- IF (NO) RETURN BUTTON CLICKED
				if (E.getSource() == EPNReturn)
				{
					EPYTopName.setVisible(false);
					EPStorage.setVisible(true);
					EPYes.setVisible(true);
					EPNo.setVisible(true);
					EPReturn.setVisible(true);			
					EPYes.setEnabled(true);
					EPNo.setEnabled(true);
					EPReturn.setEnabled(true);
					EPReset.setVisible(false);
					EPNInput.setVisible(false);
					EPNFirstSen.setVisible(false);
					EPNFirst.setVisible(false);
					EPNSecondSen.setVisible(false);
					EPNSecond.setVisible(false);
					EPNThirdSen.setVisible(false);
					EPNThird.setVisible(false);
					EPNChoose.setVisible(false);
					EPNFirstPanel.setVisible(false);
					EPNOpePanelA.setVisible(false);
					EPNSecondPanel.setVisible(false);
					EPNOpePanelB.setVisible(false);
					EPNThirdPanel.setVisible(false);
					EPNDone.setVisible(false);
					EPNAnswer.setVisible(false);
					EPNTotal.setVisible(false);
					EPNReturn.setVisible(false);
				}
			
			//English to Proposition -- IF RETURN BUTTON CLICKED
			if (E.getSource() == EPReturn)
			{
				EPYes.setEnabled(false);
				EPNo.setEnabled(false);
				EPStorage.setVisible(false);
				EPYes.setVisible(false);
				EPNo.setVisible(false);
				EPReset.setVisible(false);
				EPReturn.setVisible(false);
				Choose.setVisible(true);
				EngToPro.setVisible(true);
				ProToEng.setVisible(true);	
			}
			
			//English to Proposition -- IF RESET BUTTON CLICKED
			if (E.getSource() == EPReset)
			{
				EPYes.setEnabled(false);
				EPNo.setEnabled(false);
				EPYTotal.setText(" ");
				EPNTotal.setText(" ");
				EPNFirst.setText(" ");
				EPNSecond.setText(" ");
				EPNThird.setText(" ");
			}
			
		//Introduction -- IF PROTOENG BUTTON CLICKED	
		if (E.getSource() == ProToEng)
		{
			PEStorage.setVisible(true);
			PEYes.setVisible(true);
			PENo.setVisible(true);
			PEReturn.setVisible(true);
			PEYes.setEnabled(true);
			PENo.setEnabled(true);
			PEReturn.setEnabled(true);
			
			Choose.setVisible(false);
			EngToPro.setVisible(false);
			ProToEng.setVisible(false);
		}
			
			//Proposition to English -- IF YES BUTTON CLICKED
			if (E.getSource() == PEYes)
			{
				PEYTopName.setVisible(true);
				PEYFirstSen.setVisible(true);
				PEYSecondSen.setVisible(true);
				PEYThirdSen.setVisible(true);
				PEYChoose.setVisible(true);
				PEYFirstPanel.setVisible(true);
				PEYOpePanelA.setVisible(true);
				PEYSecondPanel.setVisible(true);
				PEYOpePanelB.setVisible(true);
				PEYThirdPanel.setVisible(true);
				PEYDone.setVisible(true);
				PEYAnswer.setVisible(true);
				PEYTotal.setVisible(true);	
				PEYReturn.setVisible(true);
				PEReset.setVisible(true);
				PEReset.setEnabled(true);		
				
				PEStorage.setVisible(false);
				PEYes.setVisible(false);
				PENo.setVisible(false);
				PEReturn.setVisible(false);
			}
			
				//Proposition to English -- IF DONE BUTTON CLICKED
				if (E.getSource() == PEYDone)
				{
					//For PEYFirstPanel
					if (PEYComboBoxA.getSelectedItem().equals("p"))
						PEYFirstTemp = "Today is monday";
					else if (PEYComboBoxA.getSelectedItem().equals("q"))
						PEYFirstTemp = "Today is sunny";
					else if (PEYComboBoxA.getSelectedItem().equals("r"))
						PEYFirstTemp = "Today is hot";
					else if (PEYComboBoxA.getSelectedItem().equals("~p"))
						PEYFirstTemp = "Today is not Monday";
					else if (PEYComboBoxA.getSelectedItem().equals("~q"))
						PEYFirstTemp = "Today is not sunny";
					else if (PEYComboBoxA.getSelectedItem().equals("~r"))
						PEYFirstTemp = "Today is not hot";
						
					//For PEYOpePanelA
					if (PEYOpeComboBoxA.getSelectedItem().equals("^"))
						PEYOpeTempA = "and";
					else if (PEYOpeComboBoxA.getSelectedItem().equals("V"))
						PEYOpeTempA = "or";
					else if (PEYOpeComboBoxA.getSelectedItem().equals("->"))
						PEYOpeTempA = "implies";
					else if (PEYOpeComboBoxA.getSelectedItem().equals("<->"))
						PEYOpeTempA = "if and only if";
					else if (PEYOpeComboBoxA.getSelectedItem().equals("XOR"))
						PEYOpeTempA = "but not";
				
					//For PEYSecondPanel
					if (PEYComboBoxB.getSelectedItem().equals("p"))
						PEYSecondTemp = "Today is Monday";
					else if (PEYComboBoxB.getSelectedItem().equals("q"))
						PEYSecondTemp = "Today is sunny";
					else if (PEYComboBoxB.getSelectedItem().equals("r"))
						PEYSecondTemp = "Today is hot";
					else if (PEYComboBoxB.getSelectedItem().equals("~p"))
						PEYSecondTemp = "Today is not Monday";	
					else if (PEYComboBoxB.getSelectedItem().equals("~q"))
						PEYSecondTemp = "Today is not sunny";
					else if (PEYComboBoxB.getSelectedItem().equals("~r"))
						PEYSecondTemp = "Today is not hot";
						
					//For PEYOpePanelB
					if (PEYOpeComboBoxB.getSelectedItem().equals("^"))
						PEYOpeTempB = "and";
					else if (PEYOpeComboBoxB.getSelectedItem().equals("V"))
						PEYOpeTempB = "or";
					else if (PEYOpeComboBoxB.getSelectedItem().equals("->"))
						PEYOpeTempB = "implies";
					else if (PEYOpeComboBoxB.getSelectedItem().equals("<->"))
						PEYOpeTempB = "if and only if";
					else if (PEYOpeComboBoxB.getSelectedItem().equals("XOR"))
						PEYOpeTempB = "but not";
					else if (PEYOpeComboBoxB.getSelectedItem().equals("N/A"))
						PEYOpeTempB = " ";						
						
					//For PEYThirdPanel
					if (PEYComboBoxC.getSelectedItem().equals("p"))
						PEYThirdTemp = "Today is Monday";
					else if (PEYComboBoxC.getSelectedItem().equals("q"))
						PEYThirdTemp = "Today is sunny";
					else if (PEYComboBoxC.getSelectedItem().equals("r"))
						PEYThirdTemp = "Today is hot";
					else if (PEYComboBoxC.getSelectedItem().equals("~p"))
						PEYThirdTemp = "Today is not Monday";
					else if (PEYComboBoxC.getSelectedItem().equals("~q"))
						PEYThirdTemp = "Today is not sunny";
					else if (PEYComboBoxC.getSelectedItem().equals("~r"))
						PEYThirdTemp = "Today is not hot";
					else if (PEYComboBoxC.getSelectedItem().equals("N/A"))
						PEYThirdTemp = " ";	
						
						
					PEYTotal.setText(PEYFirstTemp + " " + PEYOpeTempA + " " + PEYSecondTemp + " " + PEYOpeTempB + " " + PEYThirdTemp);	
				}
				
				//Proposition to English -- IF (YES) RETURN BUTTON CLICKED
				if (E.getSource() == PEYReturn)
				{
					PEYTopName.setVisible(false);
					PEReturn.setVisible(true);
					PEStorage.setVisible(true);
					PEYes.setVisible(true);
					PENo.setVisible(true);			
					PEYes.setEnabled(true);
					PENo.setEnabled(true);	
					PEReturn.setEnabled(true);
					PEReset.setVisible(false);	
					PEYFirstSen.setVisible(false);
					PEYSecondSen.setVisible(false);
					PEYThirdSen.setVisible(false);
					PEYChoose.setVisible(false);
					PEYFirstPanel.setVisible(false);
					PEYOpePanelA.setVisible(false);
					PEYSecondPanel.setVisible(false);
					PEYOpePanelB.setVisible(false);
					PEYThirdPanel.setVisible(false);
					PEYDone.setVisible(false);
					PEYAnswer.setVisible(false);
					PEYTotal.setVisible(false);
					PEYReturn.setVisible(false);
					EngToPro.setVisible(false);
					ProToEng.setVisible(false);
				}
		
			//Proposition to English -- IF NO BUTTON CLICKED
			if (E.getSource() == PENo)
			{
				PEYTopName.setVisible(true);
				PENInput.setVisible(true);
				PENFirstSen.setVisible(true);
				PENFirst.setVisible(true);
				PENSecondSen.setVisible(true);
				PENSecond.setVisible(true);
				PENThirdSen.setVisible(true);
				PENThird.setVisible(true);
				PENChoose.setVisible(true);
				PENFirstPanel.setVisible(true);
				PENOpePanelA.setVisible(true);
				PENSecondPanel.setVisible(true);
				PENOpePanelB.setVisible(true);
				PENThirdPanel.setVisible(true);
				PENDone.setVisible(true);
				PENAnswer.setVisible(true);
				PENTotal.setVisible(true);
				PENReturn.setVisible(true);
				PEReset.setVisible(true);
				PEReset.setEnabled(true);
				
				PEStorage.setVisible(false);
				PEYes.setVisible(false);
				PENo.setVisible(false);
				PEReturn.setVisible(false);
			}
			
				//Proposition to English -- IF DONE BUTTON CLICKED
				if (E.getSource() == PENDone)
				{
					//For PENFirstPanel
					if (PENComboBoxA.getSelectedItem().equals("p"))
						PENFirstTemp = PENFirst.getText();
					else if (PENComboBoxA.getSelectedItem().equals("q"))
						PENFirstTemp = PENSecond.getText();
					else if (PENComboBoxA.getSelectedItem().equals("r"))
						PENFirstTemp = PENThird.getText();
					else if (PENComboBoxA.getSelectedItem().equals("~p"))
						PENFirstTemp = "not " + PENFirst.getText();
					else if (PENComboBoxA.getSelectedItem().equals("~q"))
						PENFirstTemp = "not " + PENSecond.getText();
					else if (PENComboBoxA.getSelectedItem().equals("~r"))
						PENFirstTemp = "not " + PENThird.getText();
						
					//For PENOpePanelA
					if (PENOpeComboBoxA.getSelectedItem().equals("^"))
						PENOpeTempA = "and";
					else if (PENOpeComboBoxA.getSelectedItem().equals("V"))
						PENOpeTempA = "or";
					else if (PENOpeComboBoxA.getSelectedItem().equals("->"))
						PENOpeTempA = "implies";
					else if (PENOpeComboBoxA.getSelectedItem().equals("<->"))
						PENOpeTempA = "if and only if";
					else if (PENOpeComboBoxA.getSelectedItem().equals("XOR"))
						PENOpeTempA = "but not";
						
					//For PENSecondPanel
					if (PENComboBoxB.getSelectedItem().equals("p"))
						PENSecondTemp = PENFirst.getText();
					else if (PENComboBoxB.getSelectedItem().equals("q"))
						PENSecondTemp = PENSecond.getText();
					else if (PENComboBoxB.getSelectedItem().equals("r"))
						PENSecondTemp = PENThird.getText();
					else if (PENComboBoxB.getSelectedItem().equals("~p"))
						PENSecondTemp = "not " + PENFirst.getText();
					else if (PENComboBoxB.getSelectedItem().equals("~q"))
						PENSecondTemp = "not " + PENSecond.getText();
					else if (PENComboBoxB.getSelectedItem().equals("~r"))
						PENSecondTemp = "not " + PENThird.getText();
						
					//For PENOpePanelB
					if (PENOpeComboBoxB.getSelectedItem().equals("^"))
						PENOpeTempB = "and";
					else if (PENOpeComboBoxB.getSelectedItem().equals("V"))
						PENOpeTempB = "or";
					else if (PENOpeComboBoxB.getSelectedItem().equals("->"))
						PENOpeTempB = "implies";
					else if (PENOpeComboBoxB.getSelectedItem().equals("<->"))
						PENOpeTempB = "if and only if";
					else if (PENOpeComboBoxB.getSelectedItem().equals("XOR"))
						PENOpeTempB = "but not";
					else if (PENOpeComboBoxB.getSelectedItem().equals("N/A"))
						PENOpeTempB = " ";
						
					//For PENThirdPanel
					if (PENComboBoxC.getSelectedItem().equals("p"))
						PENThirdTemp = PENFirst.getText();
					else if (PENComboBoxC.getSelectedItem().equals("q"))
						PENThirdTemp = PENSecond.getText();
					else if (PENComboBoxC.getSelectedItem().equals("r"))
						PENThirdTemp = PENThird.getText();
					else if (PENComboBoxC.getSelectedItem().equals("~p"))
						PENThirdTemp = "not " + PENFirst.getText();
					else if (PENComboBoxC.getSelectedItem().equals("~q"))
						PENThirdTemp = "not " + PENSecond.getText();
					else if (PENComboBoxC.getSelectedItem().equals("~r"))
						PENThirdTemp = "not " + PENThird.getText();
					else if (PENComboBoxC.getSelectedItem().equals("N/A"))
						PENThirdTemp = " ";
						
					PENTotal.setText(PENFirstTemp + " " + PENOpeTempA + " " + PENSecondTemp + " " + PENOpeTempB + " " + PENThirdTemp);
				}
				
				//Proposition to English -- IF (NO) RETURN BUTTON CLICKED
				if (E.getSource() == PENReturn)
				{
					PEStorage.setVisible(true);
					PEYes.setVisible(true);
					PENo.setVisible(true);
					PEReturn.setVisible(true);			
					PEYes.setEnabled(true);
					PENo.setEnabled(true);
					PEReturn.setEnabled(true);
					PEReset.setVisible(false);
					PENInput.setVisible(false);
					PENFirstSen.setVisible(false);
					PENFirst.setVisible(false);
					PENSecondSen.setVisible(false);
					PENSecond.setVisible(false);
					PENThirdSen.setVisible(false);
					PENThird.setVisible(false);
					PENChoose.setVisible(false);
					PENFirstPanel.setVisible(false);
					PENOpePanelA.setVisible(false);
					PENSecondPanel.setVisible(false);
					PENOpePanelB.setVisible(false);
					PENThirdPanel.setVisible(false);
					PENDone.setVisible(false);
					PENAnswer.setVisible(false);
					PENTotal.setVisible(false);
					PENReturn.setVisible(false);
					PEYTopName.setVisible(false);
				}
			
			//Proposition to English -- IF RETURN BUTTON CLICKED
			if (E.getSource() == PEReturn)
			{
				PEYes.setEnabled(false);
				PENo.setEnabled(false);
				PEStorage.setVisible(false);
				PEYes.setVisible(false);
				PENo.setVisible(false);
				PEReturn.setVisible(false);
				
				Choose.setVisible(true);
				EngToPro.setVisible(true);
				ProToEng.setVisible(true);
			}
			
			//Proposition to English -- IF RESET BUTTON CLICKED
			if (E.getSource() == PEReset)
			{
				PEYes.setEnabled(false);
				PENo.setEnabled(false);
				PEYTotal.setText(" ");
				PENTotal.setText(" ");
				PENFirst.setText(" ");
				PENSecond.setText(" ");
				PENThird.setText(" ");
			}
	}
	
	public static void main (String args[])
	{
		DMProposition Close = new DMProposition();
		Close.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}