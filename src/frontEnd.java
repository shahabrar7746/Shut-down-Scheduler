import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frontEnd implements ActionListener {
	JFrame frame = new JFrame("Shut Down Scheduler");

	static JComboBox cb=new JComboBox();
	static JComboBox cb2 = new JComboBox(); 
	static JComboBox cb3 =new JComboBox(); 
	frontEnd(){
						frame.setSize(400,225);
		frame.setVisible(true);
		frame.setLayout(null);
		String hrs[] = new String[24+1];
		String mins[] = new String[60+1];
		String secs[] = new String[60+1];
		String temp = "";
		hrs[0] = "Hours";
		for(int i = 1;i<24+1;i++) {
			if(temp.length() == 1) {
			hrs[i] = "0" + temp.valueOf(i);	
			}else {
			hrs[i] = temp.valueOf(i);
			}
		}
		hrs[24] = "00";
		mins[0] = "Minutes";
		secs[0] = "Seconds";
		for(int i = 1;i<60+1;i++) {
			temp = temp.valueOf(i);
			if(temp.length() == 1) {
				mins[i] =   "0" + temp;
				secs[i] = "0" + temp;
			}else {
			mins[i] = temp;
			secs[i] = temp;
			}
			}
		mins[60] = "00";
		secs[60] = "00";
		 cb=new JComboBox(hrs); 
	    cb.setBounds(20, 30,90,20);
	    cb.setVisible(true);
	    cb.setLayout(null);
	    frame.add(cb);  
	    cb2 = new JComboBox(mins);
	    cb2.setBounds(148, 30,90,20);
	    cb.setVisible(true);
	    cb2.setLayout(null);
	    frame.add(cb2);
	    cb3 = new JComboBox(secs);
	    cb3.setBounds(278, 30,90,20);
	    cb3.setVisible(true);
	    cb3.setLayout(null);
	    frame.add(cb3);
	    
	    JButton  b = new JButton("Schedule");
	    b.setBounds(110, 110, 150, 50);
	    b.setVisible(true);
	    b.addActionListener(this); 
	    frame.add(b);
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frontEnd fe = new frontEnd()
		;
	}
	public void actionPerformed(ActionEvent e){  
		frame.dispose();
      String hrs = (String) cb.getItemAt(cb.getSelectedIndex());
      String mins = (String) cb2.getItemAt(cb2.getSelectedIndex());
      String sec = (String) cb3.getItemAt(cb3.getSelectedIndex());
        String time = hrs+":"+mins+":"+sec;
     time_testing testing = new time_testing();
     try {
		testing.loop(time);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     
	}

}
