import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class GBullsAndCows extends Frame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	int count, key, strike, ball;
	int[] usr = new int[3];
	int[] com = new int[3];
	boolean gameover = false;
	Label display;
	TextArea history;
	Panel numPanel;
	Button[] buttons = new Button[12];
	
	public GBullsAndCows() {
		setTitle("Bulls and Cows");
		
		count = key = usr[0] = usr[1] = usr[2] = 0;
		
		Random r = new Random();
		
		com[0] = Math.abs(r.nextInt() % 9) + 1;
		
		do {
			com[1] = Math.abs(r.nextInt() % 9) + 1;
		} while (com[0] == com[1]);
		
		do {
			com[2] = Math.abs(r.nextInt() % 9) + 1;
		} while (com[0] == com[2] || com[1] == com[2]);
		
		System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
		
		// GUI
		setLayout(new BorderLayout());
		
		display = new Label();
		display.setAlignment(Label.RIGHT);
		add("North", display);
		
		numPanel = new Panel();
		numPanel.setLayout(new GridLayout(4, 3));
		
		for (int i = 7; i > 0; i -=3) {
			for (int j = 0; j < 3; j++) {
				buttons[i + j] = new Button(Integer.toString(i + j));
				numPanel.add(buttons[i + j]);
			}
		}
		
		buttons[0] = new Button("backspace");
		numPanel.add(buttons[0]);
		
		buttons[10] = new Button("clear");
		numPanel.add(buttons[10]);
		
		buttons[11] = new Button("enter");
		numPanel.add(buttons[11]);
		
		add("Center", numPanel);
		
		history = new TextArea(10, 20);
		add("South", history);
		
		for (int i = 0; i < 12; i++) {
			buttons[i].addActionListener(this);
		}
		
		setSize(350, 350);
		setLocationRelativeTo(null);
		setVisible(true);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {}
			
			@Override
			public void windowIconified(WindowEvent e) {}
			
			@Override
			public void windowDeiconified(WindowEvent e) {}
			
			@Override
			public void windowDeactivated(WindowEvent e) {}
			
			@Override
			public void windowClosing(WindowEvent e) {
				 System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {}
			
			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (gameover) return;
		
		if (e.getSource() == buttons[0]) { // backspace
			if (key > 0) {
				key--;
				display.setText("");
				for (int i = 0; i < key; i++) {
					display.setText(display.getText() + usr[i]);
				}
			}
		}
		else if (e.getSource() == buttons[10]) { // clear
			key = 0;
			usr[0] = usr[1] = usr[2] = 0;
			display.setText("");
		}
		else if (e.getSource() == buttons[11]) { // enter
			if (key == 3) {
				strike = ball = 0;
				if (usr[0] == com[0]) strike++;
				if (usr[1] == com[1]) strike++;
				if (usr[2] == com[2]) strike++;
				
				if (usr[0] == com[1]) ball++;
				if (usr[0] == com[2]) ball++;
				if (usr[1] == com[0]) ball++;
				if (usr[1] == com[2]) ball++;
				if (usr[2] == com[0]) ball++;
				if (usr[2] == com[1]) ball++;
				
				history.append(usr[0] + ", " + usr[1] + ", " + usr[2] + " -> Strike: " + strike + " Ball: " + ball + "\n");
				
				count++;
				key = 0;
				usr[0] = usr[1] = usr[2] = 0;
				display.setText("");
				
				if ((strike == 3) || (count == 11)) {
					if (count <= 2) {
						history.append("\n평가: 참 잘했어요!");
					}
					else if (count <= 5) {
						history.append("\n평가: 잘했어요!");
					}
					else if (count <= 9) {
						history.append("\n평가: 보통이네요!");
					}
					else {
						history.append("\n평가: 분발하세요!");
					}
					
					gameover = true;
					display.setText(" Game Over ! ");
					history.append("\n\n<<<게임 끝>>>");
				}
				
			} 
			else {
				// 숫자 3개 미만을 누른 경우
			}
			
		}
		else {
			if (key < 3) {
				char butVal = ((Button) e.getSource()).getLabel().charAt(0);
				usr[key] = Integer.parseInt(Character.toString(butVal));
				
				boolean same = false;
				switch (key) {
				case 2:
					if (usr[key] == usr[1]) same = true;
				case 1:
					if (usr[key] == usr[0]) same = true;
				}
				
				if (same) {
					// 같은 숫자를 누른 경우
				}
				else {
					display.setText(display.getText() + butVal);
					key++;
				}
			}
			else {
				// 숫자를 3개 이상 누른 경우
			}
		}
		
	}
	
	public static void main(String[] args) {
		new GBullsAndCows();

	}

}
