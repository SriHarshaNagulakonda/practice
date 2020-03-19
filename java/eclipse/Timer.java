// Allow short name access to following classes
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Timer extends Thread implements ActionListener {
  
  /**
   * The application method displaying the timer.
   * 
   * @param args The command-line arguments.
   */
  public static void main(String[] args) {
    new Timer().start();
  }
  
  // the window containing the components
  private JFrame win;
  // the start/pause/continue button
  private JButton startPauseContinue;
  // the reset button
  private JButton reset;
  // displays time elapsed
  private JLabel timeElapsed;
  // current time elapsed
  private double time;
  
  /**
   * Constructs Timer object.
   */
  public Timer() {
    
    // instantiate and set preferred sizes of both JButton objects
    startPauseContinue = new JButton("Start");
    startPauseContinue.setPreferredSize(new Dimension(90, 30));
    reset = new JButton("Reset");
    reset.setPreferredSize(new Dimension(90, 30));
    
    // register mouse clicks on both JButton objects
    startPauseContinue.addActionListener(this);
    reset.addActionListener(this);
    
    // set precision, alignment, font style, and font size of
    // JLabel object
    time = 0;
    timeElapsed = new JLabel(String.format("%.2f seconds", time));
    timeElapsed.setHorizontalAlignment(JLabel.CENTER);
    Font bigFont = new Font("Arial", Font.BOLD, 36);
    timeElapsed.setFont(bigFont);
    
    // put JButton objects in a JPanel with a FlowLayout to get both
    // JButtons to appear
    JPanel buttonsPanel = new JPanel(new FlowLayout());
    buttonsPanel.add(startPauseContinue);
    buttonsPanel.add(reset);
    
    win = new JFrame("My Timer");
    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    win.setSize(400, 300);
    win.setLayout(new BorderLayout());
    // add JPanel object to north region of window
    win.add(buttonsPanel, BorderLayout.NORTH);
    win.add(timeElapsed, BorderLayout.CENTER);
    
    win.setVisible(true);
    
  }
  
  public void run() {
    while(startPauseContinue.getText() == "Pause") {
      try {
        timeElapsed.setText(String.format("%.2f seconds", time));
        time += 0.01;
        Thread.sleep(10);
      } catch(InterruptedException e) {
        // do nothing
      }
    }
  }
  
  public void actionPerformed(ActionEvent e) {
    String text = e.getActionCommand();
    
    if(text == "Start") {
      startPauseContinue.setText("Pause");
    } else if(text == "Pause") {
      run();
      startPauseContinue.setText("Continue");
    } else if(text == "Continue") {
      startPauseContinue.setText("Pause");
    } else if(text == "Reset") {
      // reset timer
      time = 0;
      timeElapsed.setText(String.format("%.2f seconds", time));
      // restore text back to "Start"
      startPauseContinue.setText("Start");
    }
    
  }
  
}
