import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class discretemathproj extends JFrame implements ActionListener
{
//Strings
	String finale = "";
	String sub1,sym1,sym2,prd1,prd2,prd3;
//Spinner Arrays
 	String[] spinner1 = {"-","A(x)","~A(x)","E(x)","~E(x)"};
 	String[] spinner2 = {"-","p(x)","~p(x)","q(x)","~q(x)","r(x)", "~r(x)"};
 	String[] spinner3 = {"-","v","^","=>","<=>"};
 	String[] spinner4 = {"-","p(x)","~p(x)","q(x)","~q(x)","r(x)", "~r(x)"};
 	String[] spinner5 = {"-","v","^","=>","<=>"};
 	String[] spinner6 = {"-","p(x)","~p(x)","q(x)","~q(x)","r(x)", "~r(x)"};

 	String[] spinner1sen = {"-","All students","No student","A student","Not all students"};
 	String[] spinner2sen = {"-","taking a break","not taking a break", "eating lunch","not eating lunch", "buying food", "not buying food"};
 	String[] spinner3sen = {"-","and","or","if and only if","implies"};
 	String[] spinner4sen = {"-","taking a break","not taking a break", "eating lunch","not eating lunch", "buying food", "not buying food"};
 	String[] spinner5sen = {"-","and","or","if and only if","implies"};
 	String[] spinner6sen = {"-","taking a break","not taking a break", "eating lunch","not eating lunch", "buying food", "not buying food"};
 	
 	String[] subjstring = {"-","A(domain)","~A(domain)","E(domain)","~E(domain)"};
 	String[] first1sen = {"-","1st Sentence","~1st Sentence","2nd Sentence","~2nd Sentence","3rd Sentence","~3rd Sentence"};
 	String[] first2sen = {"-","1st Sentence","~1st Sentence","2nd Sentence","~2nd Sentence","3rd Sentence","~3rd Sentence"};
 	String[] first3sen = {"-","1st Sentence","~1st Sentence","2nd Sentence","~2nd Sentence","3rd Sentence","~3rd Sentence"};
 	String[] sensym1 = {"-","and","or","if and only if","implies"};
 	String[] sensym2 = {"-","and","or","if and only if","implies"};
 	
//Fonts
	Font font1 = new Font("Arial",Font.PLAIN,20);

//JTextArea
	JTextArea variatext = new JTextArea(10,10);
	JTextArea variatext2p = new JTextArea(10,10);

//Labels
	JLabel top1 = new JLabel("SENTENCES TO SYMBOLS");
	JLabel top2 = new JLabel("SYMBOLS TO SENTENCES");
	JLabel pred1l = new JLabel("p(x):");
	JLabel pred2l = new JLabel("q(x):");
	JLabel pred3l = new JLabel("r(x):");
	
	JLabel pred1l1 = new JLabel("p(x):");
	JLabel pred2l2 = new JLabel("q(x):");
	JLabel pred3l3 = new JLabel("r(x):");

	JLabel output = new JLabel("Output will be printed here.");

//Button
	JButton next = new JButton("Next");
	JButton go1 = new JButton("Print Output!");
	JButton go2 = new JButton("Print Output!");

//Radio
	JRadioButton SymToSen = new JRadioButton("Symbols -> Sentence");
	JRadioButton SenToSym = new JRadioButton("Sentence -> Symbols");
	JRadioButton twop = new JRadioButton("2 Predicates");
	JRadioButton threep = new JRadioButton("3 Predicate");

//CheckBox
	JCheckBox storedcheck = new JCheckBox("Use stored values");

//Spinners
	SpinnerListModel domlist1 = new SpinnerListModel(spinner1);
	SpinnerListModel domlist2 = new SpinnerListModel(spinner2);
	SpinnerListModel domlist3 = new SpinnerListModel(spinner3);
	SpinnerListModel domlist4 = new SpinnerListModel(spinner4);
	SpinnerListModel domlist5 = new SpinnerListModel(spinner5);
	SpinnerListModel domlist5a = new SpinnerListModel(spinner6);

	SpinnerListModel domlist6 = new SpinnerListModel(spinner1sen);
	SpinnerListModel domlist7 = new SpinnerListModel(spinner2sen);
	SpinnerListModel domlist8 = new SpinnerListModel(spinner3sen);
	SpinnerListModel domlist9 = new SpinnerListModel(spinner4sen);
	SpinnerListModel domlist10 = new SpinnerListModel(spinner5sen);
	SpinnerListModel domlist10a = new SpinnerListModel(spinner6sen);
	
	SpinnerListModel sublist = new SpinnerListModel(subjstring);
	SpinnerListModel senlist1 = new SpinnerListModel(first1sen);
	SpinnerListModel senlist2 = new SpinnerListModel(first2sen);
	SpinnerListModel senlist3 = new SpinnerListModel(first3sen);
	SpinnerListModel symsen1 = new SpinnerListModel(sensym1);
	SpinnerListModel symsen2 = new SpinnerListModel(sensym2);

	JSpinner spin1 = new JSpinner(domlist1);
	JSpinner spin2 = new JSpinner(domlist2);
	JSpinner spin3 = new JSpinner(domlist3);
	JSpinner spin4 = new JSpinner(domlist4);
	JSpinner spin5 = new JSpinner(domlist5);
	JSpinner spin6a = new JSpinner(domlist5a);

	JSpinner spin6 = new JSpinner(domlist6);
	JSpinner spin7 = new JSpinner(domlist7);
	JSpinner spin8 = new JSpinner(domlist8);
	JSpinner spin9 = new JSpinner(domlist9);
	JSpinner spin10 = new JSpinner(domlist10);
	JSpinner spin11 = new JSpinner(domlist10a);
	
	JSpinner spinsub = new JSpinner(sublist);
	JSpinner spinsen1 = new JSpinner(senlist1);
	JSpinner spinsen2 = new JSpinner(senlist2);
	JSpinner spinsen3 = new JSpinner(senlist3);
	JSpinner symbo1 = new JSpinner(symsen1);
	JSpinner symbo2 = new JSpinner(symsen2);

//TextField
	JTextField subj = new JTextField(10);
	JTextField pred1 = new JTextField(19);
	JTextField pred2 = new JTextField(19);
	JTextField pred3 = new JTextField(19);

	JTextField subj2 = new JTextField(10);
	JTextField pred11 = new JTextField(19);
	JTextField pred22 = new JTextField(19);
	JTextField pred33 = new JTextField(19);

//Panels
	JPanel stspanel = new JPanel();
	JPanel predpanel = new JPanel();
	JPanel subjpanel = new JPanel();
	JPanel panelpred = new JPanel();
	JPanel subjpanel2 = new JPanel();
	JPanel panelpred2 = new JPanel();
	JPanel outputpanel = new JPanel();
	JPanel spinpanel1 = new JPanel();
	JPanel spinpanel2 = new JPanel();
	JPanel spinpanel2h = new JPanel();
	JPanel spinsens = new JPanel();
	JPanel spinsens2 = new JPanel();


	public discretemathproj()
	{
		Container x = getContentPane();
		x.setLayout(null);
		x.add(stspanel);
		stspanel.setLayout(new BoxLayout(stspanel, BoxLayout.Y_AXIS));
		stspanel.setBorder(BorderFactory.createTitledBorder("Translation"));
		{
			stspanel.add(SymToSen);
			stspanel.add(SenToSym);
			ButtonGroup g1 = new ButtonGroup();
			{
				g1.add(SymToSen);
				g1.add(SenToSym);
			}
			stspanel.setBounds(10,10,160,75);
		}
		x.add(predpanel);
		predpanel.setLayout(new BoxLayout(predpanel, BoxLayout.Y_AXIS));
		predpanel.setBorder(BorderFactory.createTitledBorder("Predicates"));
		{
			predpanel.add(twop);
			predpanel.add(threep);
			ButtonGroup g2 = new ButtonGroup();
			{
				g2.add(twop);
				g2.add(threep);
			}
			predpanel.setBounds(10,85,160,75);
		}
		x.add(storedcheck);
		x.add(next);

		x.add(top1);
		x.add(top2);

//Symbols to Sentence
		x.add(variatext);
		{
			variatext.setFont(font1);
			variatext.setText("domain: students\np(x): taking a break\nq(x): eating lunch\nr(x): buying food");
		}
		x.add(variatext2p);
		{
			variatext2p.setFont(font1);
			variatext2p.setText("domain: students\np(x): taking a break\nq(x): eating lunch");
		}
//Sentences to Symbol
		x.add(subjpanel);
		subjpanel.setLayout(new BoxLayout(subjpanel, BoxLayout.Y_AXIS));
		subjpanel.setBorder(BorderFactory.createTitledBorder("Domain"));
		{
			subjpanel.add(subj);
		}
		x.add(panelpred);
		panelpred.setLayout(new FlowLayout());
		panelpred.setBorder(BorderFactory.createTitledBorder("Predicates"));
		{
			panelpred.add(pred1l);
			panelpred.add(pred1);
			panelpred.add(pred2l);
			panelpred.add(pred2);
			panelpred.add(pred3l);
			panelpred.add(pred3);
		}
//Symbol to Sentences
		x.add(subjpanel2);
		subjpanel2.setLayout(new BoxLayout(subjpanel2, BoxLayout.Y_AXIS));
		subjpanel2.setBorder(BorderFactory.createTitledBorder("Domain"));
		{
			subjpanel2.add(subj2);
		}
		x.add(panelpred2);
		panelpred2.setLayout(new FlowLayout());
		panelpred2.setBorder(BorderFactory.createTitledBorder("Predicates"));
		{
			panelpred2.add(pred1l1);
			panelpred2.add(pred11);
			panelpred2.add(pred2l2);
			panelpred2.add(pred22);
			panelpred2.add(pred3l3);
			panelpred2.add(pred33);
		}
//end
		x.add(outputpanel);
		outputpanel.setLayout(new FlowLayout());
		outputpanel.setBorder(BorderFactory.createLoweredBevelBorder());
		{
			outputpanel.add(output);
		}
		x.add(spinpanel1);
		spinpanel1.setLayout(new BoxLayout(spinpanel1, BoxLayout.X_AXIS));
		spinpanel1.setBorder(BorderFactory.createTitledBorder("Sentence Arrangement"));
		{
			spinpanel1.add(spin1);
			spinpanel1.add(spin2);
			spinpanel1.add(spin3);
			spinpanel1.add(spin4);
			spinpanel1.add(spin5);
			spinpanel1.add(spin6a);
		}
		x.add(spinpanel2);
		spinpanel2.setLayout(new BoxLayout(spinpanel2, BoxLayout.X_AXIS));
		spinpanel2.setBorder(BorderFactory.createTitledBorder("Sentence Arrangement"));
		{
			spinpanel2.add(spin6);
			spinpanel2.add(spin7);
			spinpanel2.add(spin8);
		}
		x.add(spinpanel2h);
		spinpanel2h.setLayout(new BoxLayout(spinpanel2h, BoxLayout.X_AXIS));
		spinpanel2h.setBorder(BorderFactory.createTitledBorder(""));
		{
			spinpanel2h.add(spin9);
			spinpanel2h.add(spin10);
			spinpanel2h.add(spin11);
		}
		x.add(spinsens);
		spinsens.setLayout(new BoxLayout(spinsens, BoxLayout.X_AXIS));
		spinsens.setBorder(BorderFactory.createTitledBorder("Sentence Arrangement"));
		{
			spinsens.add(spinsub);
			spinsens.add(spinsen1);
			spinsens.add(symbo1);
		}
		x.add(spinsens2);
		spinsens2.setLayout(new BoxLayout(spinsens2, BoxLayout.X_AXIS));
		spinsens2.setBorder(BorderFactory.createTitledBorder(""));
		{
			spinsens2.add(spinsen2);
			spinsens2.add(symbo2);
			spinsens2.add(spinsen3);
		}
		x.add(go1);
		x.add(go2);
//Bounds

		go1.setBounds(185,275,130,20);
		go2.setBounds(185,313,130,20);

		spinpanel1.setBounds(10,220,470,50);
		spinpanel2.setBounds(10,220,470,50);
		spinpanel2h.setBounds(10,275,470,30);
		
		spinsens.setBounds(10,220,470,50);
		spinsens2.setBounds(10,275,470,30);

		outputpanel.setBounds(0,340,494,75);

		subjpanel.setBounds(200,50,260,45);
		panelpred.setBounds(200,100,260,100);

		subjpanel2.setBounds(200,50,260,45);
		panelpred2.setBounds(200,100,260,100);

 		variatext.setBounds(200,50,260,100);
 		variatext2p.setBounds(200,50,260,100);

		top1.setBounds(255,20,150,20);
		top2.setBounds(255,20,150,20);


		storedcheck.setBounds(10,165,150,20);
		next.setBounds(15,190,150,20);

		go1.addActionListener(this);
		go2.addActionListener(this);
		SymToSen.addActionListener(this);
		SenToSym.addActionListener(this);
		twop.addActionListener(this);
		threep.addActionListener(this);
		storedcheck.addActionListener(this);
		next.addActionListener(this);
		
		subj.addActionListener(this);
		pred1.addActionListener(this);
		pred2.addActionListener(this);
		pred3.addActionListener(this);

		setTitle("Discrete Math Project");
		setSize(500,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
//VISIBILITY

		top1.setVisible(false);
		top2.setVisible(false);

		variatext.setVisible(false);
		variatext2p.setVisible(false);

		subjpanel.setVisible(false);
		panelpred.setVisible(false);

		subjpanel2.setVisible(false);
		panelpred2.setVisible(false);

		spinpanel1.setVisible(false);
		spinpanel2.setVisible(false);
		spinpanel2h.setVisible(false);
		spinsens.setVisible(false);
		spinsens2.setVisible(false);

		go1.setVisible(false);
		go2.setVisible(false);

	}
	public void actionPerformed(ActionEvent act)
	{
		if(act.getSource() == next)
		{
			if(SymToSen.isSelected() && twop.isSelected())
			{
				
				spinsens.setVisible(false);
				spinsens2.setVisible(false);
				go2.setVisible(false);
				spin5.setVisible(false);
				spin6a.setVisible(false);
				subjpanel2.setVisible(false);
				panelpred2.setVisible(false);
				pred33.setEditable(false);
				spinpanel1.setVisible(true);
				spinpanel2.setVisible(false);
				spinpanel2h.setVisible(false);
				go1.setVisible(true);
				subjpanel.setVisible(false);
				panelpred.setVisible(false);
				top1.setVisible(false);
				top2.setVisible(true);
				if(storedcheck.isSelected())
				{
					variatext.setVisible(false);
					variatext2p.setVisible(true);
				}
				else
				{
					subjpanel2.setVisible(true);
					panelpred2.setVisible(true);
					variatext.setVisible(false);
					variatext2p.setVisible(false);
				}
			}
			else if(SymToSen.isSelected() && threep.isSelected())
			{	
				spinsens.setVisible(false);
				spinsens2.setVisible(false);
				go2.setVisible(false);
				spin5.setVisible(true);
				spin6a.setVisible(true);
				pred33.setEditable(true);
				subjpanel2.setVisible(false);
				panelpred2.setVisible(false);
				spinpanel1.setVisible(true);
				spinpanel2.setVisible(false);
				spinpanel2h.setVisible(false);
				go1.setVisible(true);
				subjpanel.setVisible(false);
				panelpred.setVisible(false);
				top1.setVisible(false);
				top2.setVisible(true);
				if(storedcheck.isSelected())
				{
					subjpanel2.setVisible(false);
					panelpred2.setVisible(false);
					variatext2p.setVisible(false);
					variatext.setVisible(true);
				}
				else
				{
					subjpanel2.setVisible(true);
					panelpred2.setVisible(true);
					variatext.setVisible(false);
				}
			}
			else if(SenToSym.isSelected() && twop.isSelected())
			{
				symbo2.setEnabled(false);
				spinsen3.setEnabled(false);
				go1.setVisible(false);
				spin10.setEnabled(false);
				spin11.setEnabled(false);
				variatext2p.setVisible(false);
				subjpanel2.setVisible(false);
				panelpred2.setVisible(false);
				spinpanel1.setVisible(false);
				spinpanel2.setVisible(true);
				spinpanel2h.setVisible(true);
				go2.setVisible(true);
				pred3.setEditable(false);
				top2.setVisible(false);
				top1.setVisible(true);
				if(storedcheck.isSelected())
				{
					variatext.setVisible(false);
					variatext2p.setVisible(true);
					subjpanel.setVisible(false);
					panelpred.setVisible(false);
				}
				else
				{
					spinsens.setVisible(true);
					spinsens2.setVisible(true);
					variatext2p.setVisible(false);
					subjpanel.setVisible(true);
					panelpred.setVisible(true);
					spinpanel2.setVisible(false);
					spinpanel2h.setVisible(false);
					pred3.setEditable(false);
				}
			}
			else if(SenToSym.isSelected() && threep.isSelected())
			{
				symbo2.setEnabled(true);
				spinsen3.setEnabled(true);
				go1.setVisible(false);
				spin10.setEnabled(true);
				spin11.setEnabled(true);
				variatext2p.setVisible(false);
				subjpanel2.setVisible(false);
				panelpred2.setVisible(false);
				spinpanel1.setVisible(false);
				spinpanel2.setVisible(true);
				spinpanel2h.setVisible(true);
				go2.setVisible(true);
				pred3.setEditable(true);
				top2.setVisible(false);
				top1.setVisible(true);
				if(storedcheck.isSelected())
				{
					variatext.setVisible(true);
					variatext2p.setVisible(false);
					subjpanel.setVisible(false);
					panelpred.setVisible(false);
				}
				else
				{
					spinsens.setVisible(true);
					spinsens2.setVisible(true);
					subjpanel.setVisible(true);
					panelpred.setVisible(true);
					spinpanel2.setVisible(false);
					spinpanel2h.setVisible(false);
					variatext.setVisible(false);
				}
			}
		}

		if(act.getSource() == go1)
		{
			sym2 = "";
			prd3 = "";
			if(storedcheck.isSelected())
			{
				if(SymToSen.isSelected() && twop.isSelected())
				{
					//First spinner
					if(spin1.getValue().toString().equals("A(x)"))
					{
						sub1 = "All students are ";
					}
					else if(spin1.getValue().toString().equals("~A(x)"))
					{
						sub1 = "No student is ";
					}
					else if(spin1.getValue().toString().equals("E(x)"))
					{
						sub1 = "A student is ";
					}
					else if(spin1.getValue().toString().equals("~E(x)"))
					{
						sub1 = "Not all students are ";
					}
					else if(spin1.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//2nd spinner preds
					if(spin2.getValue().toString().equals("p(x)"))
					{
						prd1 = "taking a break ";
					}
					else if(spin2.getValue().toString().equals("~p(x)"))
					{
						prd1 = "not taking a break ";
					}
					else if(spin2.getValue().toString().equals("q(x)"))
					{
						prd1 = "eating lunch ";
					}
					else if(spin2.getValue().toString().equals("~q(x)"))
					{
						prd1 = "not eating lunch ";
					}
					else if(spin2.getValue().toString().equals("-"))
					{
						prd1= "";
					}
					//3rd spinner connecktors
					if(spin3.getValue().toString().equals("^"))
					{
						sym1 = "and ";
					}
					else if(spin3.getValue().toString().equals("v"))
					{
						sym1 = "or ";
					}
					else if(spin3.getValue().toString().equals("=>"))
					{
						sym1 = "if and only if ";
					}
					else if(spin3.getValue().toString().equals("<=>"))
					{
						sym1 = "implies ";
					}
					else if(spin3.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner prd2
					if(spin4.getValue().toString().equals("p(x)"))
					{
						prd2 = "taking a break. ";
					}
					else if(spin4.getValue().toString().equals("~p(x)"))
					{
						prd2 = "not taking a break. ";
					}
					else if(spin4.getValue().toString().equals("q(x)"))
					{
						prd2 = "eating lunch. ";
					}
					else if(spin4.getValue().toString().equals("~q(x)"))
					{
						prd2 = "not eating lunch. ";
					}
					else if(spin4.getValue().toString().equals("-"))
					{
						prd2= "";
					}
					
				}
				if(SymToSen.isSelected() && threep.isSelected())
				{
					//First spinner
					if(spin1.getValue().toString().equals("A(x)"))
					{
						sub1 = "All students are ";
					}
					else if(spin1.getValue().toString().equals("~A(x)"))
					{
						sub1 = "No student is ";
					}
					else if(spin1.getValue().toString().equals("E(x)"))
					{
						sub1 = "A student is ";
					}
					else if(spin1.getValue().toString().equals("~E(x)"))
					{
						sub1 = "Not all students are ";
					}
					else if(spin1.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//2nd spinner preds
					if(spin2.getValue().toString().equals("p(x)"))
					{
						prd1 = "taking a break ";
					}
					else if(spin2.getValue().toString().equals("~p(x)"))
					{
						prd1 = "not taking a break ";
					}
					else if(spin2.getValue().toString().equals("q(x)"))
					{
						prd1 = "eating lunch ";
					}
					else if(spin2.getValue().toString().equals("~q(x)"))
					{
						prd1 = "not eating lunch ";
					}
					else if(spin2.getValue().toString().equals("r(x)"))
					{
						prd1 = "buying food ";
					}
					else if(spin2.getValue().toString().equals("~r(x)"))
					{
						prd1 = "not buying food ";
					}
					else if(spin2.getValue().toString().equals("-"))
					{
						prd1= "";
					}
					//3rd spinner connecktors
					if(spin3.getValue().toString().equals("^"))
					{
						sym1 = "and ";
					}
					else if(spin3.getValue().toString().equals("v"))
					{
						sym1 = "or ";
					}
					else if(spin3.getValue().toString().equals("=>"))
					{
						sym1 = "implies";
					}
					else if(spin3.getValue().toString().equals("<=>"))
					{
						sym1 = "if and only if";
					}
					else if(spin3.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner prd2
					if(spin4.getValue().toString().equals("p(x)"))
					{
						prd2 = "taking a break ";
					}
					else if(spin4.getValue().toString().equals("~p(x)"))
					{
						prd2 = "not taking a break ";
					}
					else if(spin4.getValue().toString().equals("q(x)"))
					{
						prd2 = "eating lunch ";
					}
					else if(spin4.getValue().toString().equals("~q(x)"))
					{
						prd2 = "not eating lunch ";
					}
					else if(spin4.getValue().toString().equals("r(x)"))
					{
						prd2 = "buying food ";
					}
					else if(spin4.getValue().toString().equals("~r(x)"))
					{
						prd2 = "not buying food ";
					}
					else if(spin4.getValue().toString().equals("-"))
					{
						prd2= "";
					}
					//5th spinner connecktors
					if(spin5.getValue().toString().equals("^"))
					{
						sym2 = "and ";
					}
					else if(spin5.getValue().toString().equals("v"))
					{
						sym2 = "or ";
					}
					else if(spin5.getValue().toString().equals("=>"))
					{
						sym2 = "implies ";
					}
					else if(spin5.getValue().toString().equals("<=>"))
					{
						sym2 = "if and only if ";
					}
					else if(spin5.getValue().toString().equals("-"))
					{
						sym2 = "";
					}
					//6th
					if(spin6a.getValue().toString().equals("p(x)"))
					{
						prd3 = "taking a break ";
					}
					else if(spin6a.getValue().toString().equals("~p(x)"))
					{
						prd3 = "not taking a break ";
					}
					else if(spin6a.getValue().toString().equals("q(x)"))
					{
						prd3 = "eating lunch ";
					}
					else if(spin6a.getValue().toString().equals("~q(x)"))
					{
						prd3 = "not eating lunch ";
					}
					else if(spin6a.getValue().toString().equals("r(x)"))
					{
						prd3 = "buying food ";
					}
					else if(spin6a.getValue().toString().equals("~r(x)"))
					{
						prd3 = "not buying food ";
					}
					else if(spin6a.getValue().toString().equals("-"))
					{
						prd3= "";
					}
					
				}
				output.setText(sub1 + prd1 + sym1 + prd2 + sym2 + prd3);
			}
			else
			{
				if(SymToSen.isSelected() && twop.isSelected())
				{
					
					//First spinner
					if(spin1.getValue().toString().equals("A(x)"))
					{
						sub1 = "" + subj2.getText() +  " is ";
					}
					else if(spin1.getValue().toString().equals("~A(x)"))
					{
						sub1 = "No " + subj2.getText() + " is " ;
					}
					else if(spin1.getValue().toString().equals("E(x)"))
					{
						sub1 = "A " + subj2.getText() + " is ";
					}
					else if(spin1.getValue().toString().equals("~E(x)"))
					{
						sub1 = "Not all " + subj2.getText() + " are ";
					}
					else if(spin1.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//2nd spinner preds
					if(spin2.getValue().toString().equals("p(x)"))
					{
						prd1 = "" + pred11.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("~p(x)"))
					{
						prd1 = "not " + pred11.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("q(x)"))
					{
						prd1 = "" + pred22.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("~q(x)"))
					{
						prd1 = "not " + pred22.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("-"))
					{
						prd1= "";
					}
					//3rd spinner connecktors
					if(spin3.getValue().toString().equals("^"))
					{
						sym1 = "and ";
					}
					else if(spin3.getValue().toString().equals("v"))
					{
						sym1 = "or ";
					}
					else if(spin3.getValue().toString().equals("=>"))
					{
						sym1 = "if and only if ";
					}
					else if(spin3.getValue().toString().equals("<=>"))
					{
						sym1 = "implies ";
					}
					else if(spin3.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner prd2
					if(spin4.getValue().toString().equals("p(x)"))
					{
						prd2 = "" + pred11.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("~p(x)"))
					{
						prd2 = "not " + pred11.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("q(x)"))
					{
						prd2 = "" + pred22.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("~q(x)"))
					{
						prd2 = "not " + pred22.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("-"))
					{
						prd2= "";
					}
				}
				if(SymToSen.isSelected() && threep.isSelected())
				{
					//First spinner
					if(spin1.getValue().toString().equals("A(x)"))
					{
						sub1 = "" + subj2.getText() +  " is ";
					}
					else if(spin1.getValue().toString().equals("~A(x)"))
					{
						sub1 = "No " + subj2.getText() + " is " ;
					}
					else if(spin1.getValue().toString().equals("E(x)"))
					{
						sub1 = "A " + subj2.getText() + " is ";
					}
					else if(spin1.getValue().toString().equals("~E(x)"))
					{
						sub1 = "Not all " + subj2.getText() + " are ";
					}
					else if(spin1.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//2nd spinner preds
					if(spin2.getValue().toString().equals("p(x)"))
					{
						prd1 = "" + pred11.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("~p(x)"))
					{
						prd1 = "not " + pred11.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("q(x)"))
					{
						prd1 = "" + pred22.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("~q(x)"))
					{
						prd1 = "not " + pred22.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("r(x)"))
					{
						prd1 = "" + pred33.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("~r(x)"))
					{
						prd1 = "not " + pred33.getText() + " ";
					}
					else if(spin2.getValue().toString().equals("-"))
					{
						prd1= "";
					}
					//3rd spinner connecktors
					if(spin3.getValue().toString().equals("^"))
					{
						sym1 = "and ";
					}
					else if(spin3.getValue().toString().equals("v"))
					{
						sym1 = "or ";
					}
					else if(spin3.getValue().toString().equals("=>"))
					{
						sym1 = "if and only if ";
					}
					else if(spin3.getValue().toString().equals("<=>"))
					{
						sym1 = "implies ";
					}
					else if(spin3.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner prd2
					if(spin4.getValue().toString().equals("p(x)"))
					{
						prd2 = "" + pred11.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("~p(x)"))
					{
						prd2 = "not " + pred11.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("q(x)"))
					{
						prd2 = "" + pred22.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("~q(x)"))
					{
						prd2 = "not " + pred22.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("r(x)"))
					{
						prd2 = "" + pred33.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("~r(x)"))
					{
						prd2 = "not " + pred33.getText() + " ";
					}
					else if(spin4.getValue().toString().equals("-"))
					{
						prd2= "";
					}
					//5th spinner connecktors
					if(spin5.getValue().toString().equals("^"))
					{
						sym2 = "and ";
					}
					else if(spin5.getValue().toString().equals("v"))
					{
						sym2 = "or ";
					}
					else if(spin5.getValue().toString().equals("=>"))
					{
						sym2 = "if and only if ";
					}
					else if(spin5.getValue().toString().equals("<=>"))
					{
						sym2 = "implies ";
					}
					else if(spin5.getValue().toString().equals("-"))
					{
						sym2 = "";
					}
					//6th spinner prd2
					if(spin6a.getValue().toString().equals("p(x)"))
					{
						prd3 = "" + pred11.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("~p(x)"))
					{
						prd3 = "not " + pred11.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("q(x)"))
					{
						prd3 = "" + pred22.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("~q(x)"))
					{
						prd3 = "not " + pred22.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("r(x)"))
					{
						prd3 = "" + pred33.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("~r(x)"))
					{
						prd3 = "not " + pred33.getText() + " ";
					}
					else if(spin6a.getValue().toString().equals("-"))
					{
						prd3= "";
					}
				}
				output.setText(sub1 + prd1 + sym1 + prd2 + sym2 + prd3);
			}	
		}
		if(act.getSource() == go2)
		{
			sym2 = "";
			prd3 = "";
			if(storedcheck.isSelected())
			{
				if(SenToSym.isSelected() && twop.isSelected())
				{
					//First spinner
					if(spin6.getValue().toString().equals("All students"))
					{
						sub1 = "A(x)";
					}
					else if(spin6.getValue().toString().equals("No student"))
					{
						sub1 = "~A(x)";
					}
					else if(spin6.getValue().toString().equals("A student"))
					{
						sub1 = "E(x)";
					}
					else if(spin6.getValue().toString().equals("Not all students"))
					{
						sub1 = "~E(x)";
					}
					else if(spin6.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//Second spinner
					if(spin7.getValue().toString().equals("taking a break"))
					{
						prd1 = "p(x)";
					}
					else if(spin7.getValue().toString().equals("not taking a break"))
					{
						prd1 = "~p(x)";
					}
					else if(spin7.getValue().toString().equals("eating lunch"))
					{
						prd1 = "q(x)";
					}
					else if(spin7.getValue().toString().equals("not eating lunch"))
					{
						prd1 = "~q(x)";
					}
					else if(spin7.getValue().toString().equals("-"))
					{
						prd1 = "";
					}
					//3rd spinner
					if(spin8.getValue().toString().equals("and"))
					{
						sym1 = "v";
					}
					else if(spin8.getValue().toString().equals("or"))
					{
						sym1 = "^";
					}
					else if(spin8.getValue().toString().equals("if and only if"))
					{
						sym1 = "=>";
					}
					else if(spin8.getValue().toString().equals("implies"))
					{
						sym1 = "<=>";
					}
					else if(spin8.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner
					if(spin9.getValue().toString().equals("taking a break"))
					{
						prd2 = "p(x)";
					}
					else if(spin9.getValue().toString().equals("not taking a break"))
					{
						prd2 = "~p(x)";
					}
					else if(spin9.getValue().toString().equals("eating lunch"))
					{
						prd2 = "q(x)";
					}
					else if(spin9.getValue().toString().equals("not eating lunch"))
					{
						prd2 = "~q(x)";
					}
					else if(spin9.getValue().toString().equals("-"))
					{
						prd2 = "";
					}
				
				}
				if(SenToSym.isSelected() && threep.isSelected())
				{
					//First spinner
					if(spin6.getValue().toString().equals("All students"))
					{
						sub1 = "A(x)";
					}
					else if(spin6.getValue().toString().equals("No student"))
					{
						sub1 = "~A(x)";
					}
					else if(spin6.getValue().toString().equals("A student"))
					{
						sub1 = "E(x)";
					}
					else if(spin6.getValue().toString().equals("Not all students"))
					{
						sub1 = "~E(x)";
					}
					else if(spin6.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//Second spinner
					if(spin7.getValue().toString().equals("taking a break"))
					{
						prd1 = "p(x)";
					}
					else if(spin7.getValue().toString().equals("not taking a break"))
					{
						prd1 = "~p(x)";
					}
					else if(spin7.getValue().toString().equals("eating lunch"))
					{
						prd1 = "q(x)";
					}
					else if(spin7.getValue().toString().equals("not eating lunch"))
					{
						prd1 = "~q(x)";
					}
					else if(spin7.getValue().toString().equals("buying food"))
					{
						prd1 = "r(x)";
					}
					else if(spin7.getValue().toString().equals("not buying food"))
					{
						prd1 = "~r(x)";
					}
					else if(spin7.getValue().toString().equals("-"))
					{
						prd1 = "";
					}
					//3rd spinner
					if(spin8.getValue().toString().equals("and"))
					{
						sym1 = "v";
					}
					else if(spin8.getValue().toString().equals("or"))
					{
						sym1 = "^";
					}
					else if(spin8.getValue().toString().equals("if and only if"))
					{
						sym1 = "=>";
					}
					else if(spin8.getValue().toString().equals("implies"))
					{
						sym1 = "<=>";
					}
					else if(spin8.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//4th spinner
					if(spin9.getValue().toString().equals("taking a break"))
					{
						prd2 = "p(x)";
					}
					else if(spin9.getValue().toString().equals("not taking a break"))
					{
						prd2 = "~p(x)";
					}
					else if(spin9.getValue().toString().equals("eating lunch"))
					{
						prd2 = "q(x)";
					}
					else if(spin9.getValue().toString().equals("not eating lunch"))
					{
						prd2 = "~q(x)";
					}
					else if(spin9.getValue().toString().equals("buying food"))
					{
						prd2 = "r(x)";
					}
					else if(spin9.getValue().toString().equals("not buying food"))
					{
						prd2 = "~r(x)";
					}
					else if(spin9.getValue().toString().equals("-"))
					{
						prd2 = "";
					}
					//5th spinner
					if(spin10.getValue().toString().equals("and"))
					{
						sym2 = "v";
					}
					else if(spin10.getValue().toString().equals("or"))
					{
						sym2 = "^";
					}
					else if(spin10.getValue().toString().equals("if and only if"))
					{
						sym2 = "=>";
					}
					else if(spin10.getValue().toString().equals("implies"))
					{
						sym2 = "<=>";
					}
					else if(spin10.getValue().toString().equals("-"))
					{
						sym2 = "";
					}
					//6th
					if(spin11.getValue().toString().equals("taking a break"))
					{
						prd3 = "p(x)";
					}
					else if(spin11.getValue().toString().equals("not taking a break"))
					{
						prd3 = "~p(x)";
					}
					else if(spin11.getValue().toString().equals("eating lunch"))
					{
						prd3 = "q(x)";
					}
					else if(spin11.getValue().toString().equals("not eating lunch"))
					{
						prd3 = "~q(x)";
					}
					else if(spin11.getValue().toString().equals("buying food"))
					{
						prd3 = "r(x)";
					}
					else if(spin11.getValue().toString().equals("not buying food"))
					{
						prd3 = "~r(x)";
					}
					else if(spin11.getValue().toString().equals("-"))
					{
						prd3 = "";
					}
				}
				output.setText(sub1 + prd1 + sym1 + prd2 + sym2 + prd3);
			}
			else
			{
				sym2 = "";
				prd3 = "";
				if(SenToSym.isSelected() && twop.isSelected())
				{
					//spinsub
					if(spinsub.getValue().toString().equals("A(domain)"))
					{
						sub1 = "A(x)";
					}
					else if(spinsub.getValue().toString().equals("~A(domain)"))
					{
						sub1 = "~A(x)";
					}
					else if(spinsub.getValue().toString().equals("E(domain)"))
					{
						sub1 = "E(x)";
					}
					else if(spinsub.getValue().toString().equals("~E(domain)"))
					{
						sub1 = "~E(x)";
					}
					else if(spinsub.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//spinsen1
					if(spinsen1.getValue().toString().equals("1st Sentence"))
					{
						prd1 = "p(x)";
					}
					else if(spinsen1.getValue().toString().equals("~1st Sentence"))
					{
						prd1 = "~p(x)";
					}
					else if(spinsen1.getValue().toString().equals("2nd Sentence"))
					{
						prd1 = "q(x)";
					}
					else if(spinsen1.getValue().toString().equals("~2nd Sentence"))
					{
						prd1 = "~q(x)";
					}
					else if(spinsen2.getValue().toString().equals("-"))
					{
						prd2 = "";
					}
					//symbo1 
					if(symbo1.getValue().toString().equals("and"))
					{
						sym1 = "v";
					}
					else if(symbo1.getValue().toString().equals("or"))
					{
						sym1 = "^";
					}
					else if(symbo1.getValue().toString().equals("if and only if"))
					{
						sym1 = "=>";
					}
					else if(symbo1.getValue().toString().equals("implies"))
					{
						sym1 = "<=>";
					}
					else if(symbo1.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//spinsen1
					if(spinsen2.getValue().toString().equals("1st Sentence"))
					{
						prd2 = "p(x)";
					}
					else if(spinsen2.getValue().toString().equals("~1st Sentence"))
					{
						prd2 = "~p(x)";
					}
					else if(spinsen2.getValue().toString().equals("2nd Sentence"))
					{
						prd2 = "q(x)";
					}
					else if(spinsen2.getValue().toString().equals("~2nd Sentence"))
					{
						prd2 = "~q(x)";
					}
					else if(spinsen2.getValue().toString().equals("-"))
					{
						prd2 = "";
					}	
				}
				if(SenToSym.isSelected() && threep.isSelected())
				{
					//spinsub
					if(spinsub.getValue().toString().equals("A(domain)"))
					{
						sub1 = "A(x)";
					}
					else if(spinsub.getValue().toString().equals("~A(domain)"))
					{
						sub1 = "~A(x)";
					}
					else if(spinsub.getValue().toString().equals("E(domain)"))
					{
						sub1 = "E(x)";
					}
					else if(spinsub.getValue().toString().equals("~E(domain)"))
					{
						sub1 = "~E(x)";
					}
					else if(spinsub.getValue().toString().equals("-"))
					{
						sub1 = "";
					}
					//spinsen1
					if(spinsen1.getValue().toString().equals("1st Sentence"))
					{
						prd1 = "p(x)";
					}
					else if(spinsen1.getValue().toString().equals("~1st Sentence"))
					{
						prd1 = "~p(x)";
					}
					else if(spinsen1.getValue().toString().equals("2nd Sentence"))
					{
						prd1 = "q(x)";
					}
					else if(spinsen1.getValue().toString().equals("~2nd Sentence"))
					{
						prd1 = "~q(x)";
					}
					else if(spinsen2.getValue().toString().equals("-"))
					{
						prd2 = "";
					}
					//symbo1 
					if(symbo1.getValue().toString().equals("and"))
					{
						sym1 = "v";
					}
					else if(symbo1.getValue().toString().equals("or"))
					{
						sym1 = "^";
					}
					else if(symbo1.getValue().toString().equals("if and only if"))
					{
						sym1 = "=>";
					}
					else if(symbo1.getValue().toString().equals("implies"))
					{
						sym1 = "<=>";
					}
					else if(symbo1.getValue().toString().equals("-"))
					{
						sym1 = "";
					}
					//spinsen2
					if(spinsen2.getValue().toString().equals("1st Sentence"))
					{
						prd2 = "p(x)";
					}
					else if(spinsen2.getValue().toString().equals("~1st Sentence"))
					{
						prd2 = "~p(x)";
					}
					else if(spinsen2.getValue().toString().equals("2nd Sentence"))
					{
						prd2 = "q(x)";
					}
					else if(spinsen2.getValue().toString().equals("~2nd Sentence"))
					{
						prd2 = "~q(x)";
					}
					else if(spinsen2.getValue().toString().equals("3rd Sentence"))
					{
						prd2 = "r(x)";
					}
					else if(spinsen2.getValue().toString().equals("~3rd Sentence"))
					{
						prd2 = "~r(x)";
					}
					else if(spinsen2.getValue().toString().equals("-"))
					{
						prd2 = "";
					}
					//symbo2 
					if(symbo2.getValue().toString().equals("and"))
					{
						sym2 = "v";
					}
					else if(symbo2.getValue().toString().equals("or"))
					{
						sym2 = "^";
					}
					else if(symbo2.getValue().toString().equals("if and only if"))
					{
						sym2 = "=>";
					}
					else if(symbo2.getValue().toString().equals("implies"))
					{
						sym2 = "<=>";
					}
					else if(symbo2.getValue().toString().equals("-"))
					{
						sym2 = "";
					}
					//spinsen3
					if(spinsen3.getValue().toString().equals("1st Sentence"))
					{
						prd3 = "p(x)";
					}
					else if(spinsen3.getValue().toString().equals("~1st Sentence"))
					{
						prd3 = "~p(x)";
					}
					else if(spinsen3.getValue().toString().equals("2nd Sentence"))
					{
						prd3 = "q(x)";
					}
					else if(spinsen3.getValue().toString().equals("~2nd Sentence"))
					{
						prd3 = "~q(x)";
					}
					else if(spinsen3.getValue().toString().equals("3rd Sentence"))
					{
						prd3 = "r(x)";
					}
					else if(spinsen3.getValue().toString().equals("~3rd Sentence"))
					{
						prd3 = "~r(x)";
					}
					else if(spinsen3.getValue().toString().equals("-"))
					{
						prd3 = "";
					}	
				}
				output.setText(sub1 + prd1 + sym1 + prd2 + sym2 + prd3);
			}
		}

	}
	public static void main(String[] args)
	{
		new discretemathproj();
	}
}