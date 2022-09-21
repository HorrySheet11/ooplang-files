
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stopwatch extends JFrame
{
    JButton startButton = new JButton();
    JButton stopButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel startLabel = new JLabel();
    JLabel stopLabel = new JLabel();
    JLabel elapsedLabel = new JLabel();
    
    JTextField startTextField = new JTextField();
    JTextField stopTextField = new JTextField();
    JTextField elapsedTextField = new JTextField();
    
    long startTime;
    long stopTime;
    double elapsedTime;
    
    public Stopwatch(){
        setTitle("Stopwatch Aplication");
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });
        
        getContentPane().setLayout(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints();
        startButton.setText("Start Timing");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(startButton, gridConstraints);
        
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
        
        stopButton.setText("Stop Timing");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(stopButton, gridConstraints);
        
        stopButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                stopButtonActionPerformed(e);
            }
        });
        
        exitButton.setText("Exit");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        getContentPane().add(exitButton, gridConstraints);
        
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
        
        
        startLabel.setText("Start Time");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        getContentPane().add(startLabel, gridConstraints);
        
        stopLabel.setText("Stop Time");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        getContentPane().add(stopLabel, gridConstraints);
        
        elapsedLabel.setText("Elapsed Time (sec)");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(elapsedLabel, gridConstraints);
        
        
        startTextField.setText("");
        startTextField.setColumns(15);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        getContentPane().add(startTextField, gridConstraints);
        
        stopTextField.setText("");
        stopTextField.setColumns(15);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        getContentPane().add(stopTextField, gridConstraints);
        
        elapsedTextField.setText("");
        elapsedTextField.setColumns(15);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        getContentPane().add(elapsedTextField, gridConstraints);
        
        setSize(1000,500);
        //pack();
        
    }
    public void exitForm(WindowEvent e){
        
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Exiting Module");
        System.exit(0);
    }
    
    public void startButtonActionPerformed(ActionEvent a){
        
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Start Timer Initiated");
    }
    public void stopButtonActionPerformed(ActionEvent a){
        
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Stoped Timer");
    }
    public void exitButtonActionPerformed(ActionEvent a){
        
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Thankyou. UwU -><-");
        System.exit(0);
    }
    
    public static void main(String[] args){
        new Stopwatch().show();
    }
}
